<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Employee365 Facebook page</title>

    <!-- Bootstrap core CSS -->
    <link href="https://s3-us-west-1.amazonaws.com/lab-katta012127011/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="https://s3-us-west-1.amazonaws.com/lab-katta012127011/css/album.css" rel="stylesheet">
</head>

<body>


<div class="navbar navbar-inverse bg-inverse">
    <div class="container d-flex justify-content-between">
        <a href="#" class="navbar-brand">Employee365</a>
        <span class="navbar-brand">sunder.thyagarajan@sjsu.edu</span>

    </div>
</div>

<section class="jumbotron text-center">
    <div class="container">
        <h1 class="jumbotron-heading">Employee365</h1>
        <p class="lead text-muted">One stop shop for employees</p>

    </div>
</section>

<div class="album text-muted">
    <div class="container">

        <form class="form-signin">

        </form>

        <form class="form-signin" action="postFacebook" method="POST" >
            <h2 class="form-signin-heading">Post on to Employee365 Facebook page</h2>
            <label for="tweet" class="sr-only">Whats in your mind?</label>
            <textarea  id="tweet" class="form-control"  name="tweetInput" placeholder="Employee365 is feeling..." rows="10" cols="50" required autofocus>
            </textarea>

            <button class="btn btn-lg btn-primary btn-block" type="submit">Post</button>
        </form>

    </div>
</div>

<footer class="text-muted">
    <div class="container">
        <p class="float-right">
            <a href="#">Back to top</a>
        </p>
        <h4>About us</h4>
        <p>Employee365 is an enterprise portal for all self services</p>

    </div>
</footer>

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
<script src="https://s3-us-west-1.amazonaws.com/lab-katta012127011/js/holder.min.js"></script>
<script>
    $(function () {
        Holder.addTheme("thumb", { background: "#55595c", foreground: "#eceeef", text: "Thumbnail" });
    });
</script>
<script src="https://s3-us-west-1.amazonaws.com/lab-katta012127011/js/bootstrap.js"></script>
</body>
</html>
