<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>

<style>
body {
    background-image: url("images/Bg.jpg");
}

</style>


<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />
</head>
<body>
 
 
<h3 align="center" >Login Form</h3>  
<%  
String profile_msg=(String)request.getAttribute("profile_msg");  
if(profile_msg!=null){  
//out.print(profile_msg);
}  
String login_msg=(String)request.getAttribute("login_msg");  
if(login_msg!=null){  
//out.print(login_msg);
}  
 %>  
 <br/>  
<form action="login" method="post">  
 <div align="center" class = "login">
UserID:<input type="text" name="userID"/><br/><br/>  
Password:<input type="password" name="password"/><br/><br/>  
<input type="submit" value="Login"/>
</div> 
</form> 


</body>
</html>