pipeline {
    agent {
      label "jenkins-gradle"
    }
    environment {
      ORG               = 'jenkinsx'
      APP_NAME          = 'employee365-springboot'
      CHARTMUSEUM_CREDS = credentials('jenkins-x-chartmuseum')
    }
    stages {
      stage('CI Build and push snapshot') {
        when {
          branch 'PR-*'
        }
        environment {
          PREVIEW_VERSION = "0.0.0-SNAPSHOT-$BRANCH_NAME-$BUILD_NUMBER"
          PREVIEW_NAMESPACE = "$APP_NAME-$BRANCH_NAME".toLowerCase()
          HELM_RELEASE = "$PREVIEW_NAMESPACE".toLowerCase()
        }
        steps {
          container('gradle') {
            // TODO
            //sh "mvn versions:set -DnewVersion=$PREVIEW_VERSION"
            sh "gradle clean build docker"
            sh 'export VERSION=$PREVIEW_VERSION && skaffold run -f skaffold.yaml'
          }

          dir ('./charts/preview') {
           container('gradle') {
             sh "make preview"
             sh "jx preview --app $APP_NAME --dir ../.."
           }
          }
        }
      }
      stage('Build Release') {
        when {
          branch 'master'
        }
        steps {
          container('gradle') {
            // ensure we're not on a detached head
            sh "git checkout master"
            sh "git config --global credential.helper store"
            sh "jx step validate --min-jx-version 1.1.73"
            sh "jx step git credentials"
            // so we can retrieve the version in later steps
            sh "echo \$(jx-release-version) > VERSION"
            sh "gradle clean build docker"

            //sh "mvn versions:set -DnewVersion=\$(cat VERSION)"
          }
          dir ('./charts/employee365-springboot') {
            container('gradle') {
              sh "make tag"
            }
          }
          container('gradle') {
            sh 'gradle clean build'

            sh 'export VERSION=`cat VERSION` && skaffold run -f skaffold.yaml'
          }
        }
      }
      stage('Promote to Environments') {
        when {
          branch 'master'
        }
        steps {
          dir ('./charts/employee365-springboot') {
            container('gradle') {
              sh 'jx step changelog --version v\$(cat ../../VERSION)'

              // release the helm chart
              sh 'make release'

              // promote through all 'Auto' promotion Environments
              sh 'jx promote -b --all-auto --timeout 1h --version \$(cat ../../VERSION)'
            }
          }
        }
      }
    }
    post {
        always {
            cleanWs()
        }
    }
  }
