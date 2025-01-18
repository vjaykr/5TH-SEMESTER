<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>JspConfig Example</h1>
	
	<% 
		String sname = config.getServletName();
		out.println("Servlet Name is "+ sname); 
	%>
	<br/>
	<% 
		out.println("Username variable retreived using config object : " + 
			config.getInitParameter("Username")); 
		out.println("<br/>");
		out.println("Usertype variable retreived using config object : " + 
			config.getInitParameter("Usertype"));
		out.println("<br/>");
		out.println("Userlocation variable retreived using config object : " + 
			config.getInitParameter("Userloc"));
		
	%>
</body>
</html>