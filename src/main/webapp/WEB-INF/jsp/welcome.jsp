<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.List" %>
<%@ page import="com.employee365.Icons" %>
<html lang="en">
<head>

<link rel="stylesheet" type="text/css"
	href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />

<!-- 
	<spring:url value="/css/main.css" var="springCss" />
	<link href="${springCss}" rel="stylesheet" />
	 -->
<link href="${jstlCss}" rel="stylesheet" />




</head>

<script type='text/javascript'>


function openJSP(icon) {
//	alert(icon);
	  document.myForm.action =icon;
	  document.myForm.submit();
	//document.getElementById("myForm").submit();
}

</script>

<body >
<form action = "/" name="myForm">


<h3 align = "center">EMPLOYEE 365</h3>
<div class="box" align="right" id="box">

 <input type="search" id="search" placeholder="Search..." />
 <img src="https://s3-us-west-1.amazonaws.com/lab-katta012127011/Logout.png"   width="50" height="50" id= "logout"/>
</div>
<br><br><br>



	<div class="container" align = "center">

		<div class="starter-template">
				
					
	<%-- 			<c:forEach items="${IconsList}" var="IconsList">
			<table>					 
	<td>Hello</td>
	</table>
	
			  <img src="<c:url value = "${IconsList.iconName}" />"  width="100" height="100" hspace="20" />  

			   <img src="<c:url value = "images/Facebook.png" />"  width="100" height="100" hspace="20" onclick = "openFacebook()"/>  
			     <img src="<c:url value = "images/PayPal.png" />"  width="100" height="100" hspace="20"/>  
		 			    
			 </c:forEach>
			<!--   <img src="src/main/resources/Bird.jpeg"  /> -->
		 --%>	
		</div>

	</div>
	
	
	<table align ="center">
<%

List list = (List)request.getAttribute("IconsList");


for(int i=0; i<list.size();){

%>
<tr>
<% 

for(int j=1; (j<=3 && i<list.size());j++){
%>
<td>
<% 
Icons icons = (Icons) list.get(i);

/* out.print("list:"+icons.getIconName()); */

i++;
%>
<!-- <a href = "#" onclick = "openJSP('<%= icons.getIconName()%>');"> -->
    <a href = "/<%= icons.getIconName()%>" target="_blank">
    <img  src="<c:url value = "<%= icons.getIconPath()%>" />"  width="100" height="100" hspace="20" />
 </a>  
</td>
<% 
}
%>
</tr>
<% 

} %>
</table>

<!-- 	<script type="text/javascript"
		src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
 -->
</form>
</body>

</html>
