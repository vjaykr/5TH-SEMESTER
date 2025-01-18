<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	
		String username= 
			(String) pageContext.getAttribute("uname", PageContext.SESSION_SCOPE);
		String password= 
			(String) pageContext.getAttribute("upass", PageContext.SESSION_SCOPE);
		
		out.println("<h1>Hi " + username + "</h1>");
	%>
</body>
</html>