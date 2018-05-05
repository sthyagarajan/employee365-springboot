package com.employee365;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class SSOController {

	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";

	/*@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		return "Login";
	}*/
	
	
	@SuppressWarnings("unused")
	@RequestMapping("/getIcons")
	public String getIconsByRole(Map<String, List<Icons>> IconsMap, HttpServletRequest request) {

		String s3Path = "https://s3-us-west-1.amazonaws.com/lab-katta012127011/";

		List<Icons> IconsList = new ArrayList<Icons>();
		Icons icons = null;
		 String userRole = "Developer";
		 if(userRole.equalsIgnoreCase("Developer") ) {
			 icons = new Icons();
			 icons.setIconPath(("https://www.paypalobjects.com/webstatic/en_US/i/buttons/pp-acceptance-large.png"));
			 icons.setIconName(("paypal"));
			 IconsList.add(icons);
			 icons = new Icons();
			 icons.setIconPath((s3Path+"Jenkins.jpg"));
			 icons.setIconName(("jenkins"));
			 IconsList.add(icons);
			 icons = new Icons();
			 icons.setIconPath((s3Path+"Twitter.png"));
			 icons.setIconName(("jwitter"));
			 IconsList.add(icons);
			 icons = new Icons();
			 icons.setIconPath((s3Path+"Facebook.png"));
			 icons.setIconName(("facebook"));
			 IconsList.add(icons);
			 icons = new Icons();
			 icons.setIconPath((s3Path+"Dropbox.ico"));
			 icons.setIconName(("dropbox"));
			 IconsList.add(icons);
			 icons = new Icons();
			 icons.setIconPath((s3Path+"Dropbox.ico"));
			 icons.setIconName(("jira"));
			 IconsList.add(icons);
			 			 
		 }else if (userRole == "HR") {
			 icons = new Icons();
			 icons.setIconPath((s3Path+"ProfileIcon.png"));
			 icons.setIconName(("ProfileIcon"));
			 IconsList.add(icons);
			 icons = new Icons();
			 icons.setIconPath((s3Path+"Twitter.png"));
			 icons.setIconName(("twitter"));
			 IconsList.add(icons);
			 icons = new Icons();
			 icons.setIconPath((s3Path+"Facebook.png"));
			 icons.setIconName(("facebook"));
			 IconsList.add(icons);
			 icons = new Icons();
			 icons.setIconPath((s3Path+"Dropbox.ico"));
			 icons.setIconName(("dropbox"));
			 IconsList.add(icons);
			 icons = new Icons();
			 icons.setIconPath((s3Path+"Dropbox.ico"));
			 icons.setIconName(("jira"));
			 IconsList.add(icons);
			
		 }else{
			 
		 }
		 for (int i=0;i<IconsList.size();i++) {
			 System.out.println(IconsList.get((i)));
		 }
		
		 request.setAttribute("IconsList",IconsList);
		 IconsMap.put("IconsList", IconsList);
		return "developer";
	}
	
	

	
	@RequestMapping("/openNewJSP")
	public String pageRedirect() {
	
		
		
		
		
		return "Profile";
		
	}
	/* public static void main(String arr[]){

	int x = 15;
	List list = new ArrayList();
	for(int i=0;i<x;i++){
	list.add(i) ;
	}

	System.out.println("list:"+list);

	for(int i=0; i<list.size();){
	System.out.println("Break");
	for(int j=1; (j<=3 && i<list.size());j++){

	System.out.print("list:"+list.get(i));

	i++;
	}

	}
	}*/

}