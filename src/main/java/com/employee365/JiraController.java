package com.employee365;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//import twitter4j.TwitterException;


@Controller
public class JiraController {

    @RequestMapping("/jira")
    public String openTwitterJSP()  {//TwitterException {
        return "redirect:http://localhost:9080";
    }
}
