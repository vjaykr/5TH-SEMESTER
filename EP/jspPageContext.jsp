<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page Context Example</title>
</head>
<body>
	<form method="post">
		Enter User name: <br/><input type="text" name="uid"><br/>
		Enter Password: <br/><input type="password" name="upass"><br/><br/>
		<input type="submit" value="Login">
	</form>
	<br><br><br>
	<%
		if(request.getMethod().equals("POST")){
			String username = request.getParameter("uid");
			String password = request.getParameter("upass");
			
			if(username.equals("admin") && password.equals("password")) {
				pageContext.setAttribute("uname", username, 
						PageContext.SESSION_SCOPE);
				pageContext.setAttribute("upass", password, 
						PageContext.SESSION_SCOPE);
				
				out.print("<a href='myDemos/jspPageContextShow.jsp'>Welcome to Web Application</a>");
			}
			else
			{
				out.print("<h2>Invalid username / password </h1>");
			}
		}	
	%>
</body>
</html>