package com.employee365;

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

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

//import twitter4j.TwitterException;



@Controller
public class FacebookController {


    @RequestMapping("/facebook")

    public String openTwitterJSP()  {//TwitterException {



        return "Facebook";
    }


    @RequestMapping("/postFacebook")
    public String postFacebook(@ModelAttribute TwitterBean twitterBean, Map<String, List<Icons>> IconsMap, HttpServletRequest request) throws TwitterException {

       // String pageAccessToken = "EAACEdEose0cBAOqZAwlZAonu0DvrH8gWO1FZBqYgJ2rlyAZAown1rNQpnlx4GqhfqQWgjr7ksrqwA8xr6PZApx9S7CACDZA1zd0BUoBcLeYhJhgtDgHr3RHCHGVlATZC6hAk5FeUxVxjuvweNNNroQpRaq2DVgqNfsdWm3wuHeRZCneatKBKCbUZCgja7InZAimVcZD";

  //      String pageAccessToken =  "EAACEdEose0cBAAb46py2lrzZBZAM35nddRLYJzAe68kg3UKGAVovMHFYJbEM381P6jonamv3jT2boTDsJx1jG9HNBPjkdsV91KpTW7OHFumeltk7ZAsSKwpwh0HZC7FgVDhLshCCXu8MHgJY54ApxcUxKpjHWAPZCQdAqWY6AQ0H2nc8GVXrcyt5IAluHSXBPfpV4wj645M1UIsYCyAHZC6i4UbLmzWK0ZD";
        //String pageAccessToken = "EAACEdEose0cBAJIM5qxde0agqUGWDwLt1ZBsmcZA4bsdzWPFmVNe3pKqt4aYGFprcYE1bqJZBbsQ1S9qYvotqPZA0isZCEazvtMFVd0EgsZBW4Smv9gkxjpu1mdt1gISMKQxPwtgelGYsMYvDyVDHmzVSwOmZAMbQGuF42gGiwBMbjmQ1oASMPPD0WVZAqaPEJvZB48mS4VXZCegZDZD";
 String pageAccessToken = "EAACEdEose0cBAND9owCHZAZAaZAFLDv6SeJZAV7EFiD2MsdB2ZC6ukpGQcHu9acJ4xZCOw4T6JSlELW8o58NCLSWRlmLZA6oESlGWw61HZCp57l1HZADbylgAXWSSdMtb4TgCb66kmZB5Bm0liac2mtjX2C8t4sQbbwTHra38QBrPlSlZAzHkl9L9F43kN0adbKbxKKL9ZAnMMe0XQZDZD";
        final FacebookClient fb = new DefaultFacebookClient(pageAccessToken);
        final Page page = fb.fetchObject("1561283120630758", Page.class);
        fb.publish("1561283120630758/feed", FacebookType.class, Parameter.with("message", twitterBean.getTweetInput()));


        return "redirect:https://www.facebook.com/Employee365-1561283120630758/notifications/";
    }
}
