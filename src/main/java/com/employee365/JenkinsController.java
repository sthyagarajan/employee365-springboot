package com.employee365;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//import twitter4j.TwitterException;



@Controller
public class JenkinsController {

    @RequestMapping("/jenkins")
    public String openTwitterJSP()  {//TwitterException {
        return "redirect:http://localhost:8080";
    }
}
