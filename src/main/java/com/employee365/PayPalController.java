package com.employee365;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//import twitter4j.TwitterException;



@Controller
public class PayPalController {
	
	
	@RequestMapping("/paypal")

	public String openTwitterJSP()  {//TwitterException {
	
			
		
		return "PayPal";
	}
}
