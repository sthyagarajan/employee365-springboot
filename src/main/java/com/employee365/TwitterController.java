package com.employee365;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.types.FacebookType;
import com.restfb.types.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;



@Controller
public class TwitterController {
	
	
	@RequestMapping("/twitter")

	public String openTwitterJSP() throws TwitterException {
	
			
		
		return "Twitter";
	}
	
	
	
	@RequestMapping("/postTweet")
	public String postTweet(@ModelAttribute TwitterBean twitterBean, Map<String, List<Icons>> IconsMap, HttpServletRequest request) throws TwitterException {
	
		
/*		String consumerKeyStr = "v4JGV4NdGVjzl1yBARJQpNU9V";
		String consumerSecretStr = "PoT5hGzs7xABwoYW2ck2faiDaq7SG6gv9ctrOESYRmKPWQzYnG";
		String accessTokenStr = "916783602129543168-L8qcEHbBYEdD1czFqMznLCXz0l2qdha";
		String accessTokenSecretStr = "toS0piP5FfwyNZCh62zcUZJgUJqinxuyXkVwJvBKiWd6Z";
		System.setProperty("http.useSSL", "true");
		
		ConfigurationBuilder cb = new ConfigurationBuilder();

		cb.setDebugEnabled(true).setOAuthConsumerKey(consumerKeyStr)
				.setOAuthConsumerSecret(consumerSecretStr)
				.setOAuthAccessToken(accessTokenStr)
				.setOAuthAccessTokenSecret(accessTokenSecretStr);
		TwitterFactory factory = new TwitterFactory(cb.build());
		
		Twitter twitter = factory.getInstance();
		
		twitter.updateStatus("SSO Project Tweet");
*/	
		
		String consumerKeyStr = "v4JGV4NdGVjzl1yBARJQpNU9V";
		String consumerSecretStr = "PoT5hGzs7xABwoYW2ck2faiDaq7SG6gv9ctrOESYRmKPWQzYnG";
		String accessTokenStr = "916783602129543168-L8qcEHbBYEdD1czFqMznLCXz0l2qdha";
		String accessTokenSecretStr = "toS0piP5FfwyNZCh62zcUZJgUJqinxuyXkVwJvBKiWd6Z";
		System.setProperty("http.useSSL", "true");
		
		ConfigurationBuilder cb = new ConfigurationBuilder();

		cb.setDebugEnabled(true).setOAuthConsumerKey(consumerKeyStr)
				.setOAuthConsumerSecret(consumerSecretStr)
				.setOAuthAccessToken(accessTokenStr)
				.setOAuthAccessTokenSecret(accessTokenSecretStr);
		TwitterFactory factory = new TwitterFactory(cb.build());
		
		Twitter twitter = factory.getInstance();
		
		twitter.updateStatus(twitterBean.getTweetInput());


		return "redirect:https://twitter.com/employee365";
	}
	
	
		

}
