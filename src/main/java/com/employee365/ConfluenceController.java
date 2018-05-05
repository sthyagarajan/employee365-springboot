package com.employee365;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//import twitter4j.TwitterException;


@Controller
public class ConfluenceController {

    @RequestMapping("/confluence")
    public String openTwitterJSP()  {//TwitterException {
        return "redirect:http://localhost:8090";
    }
}
