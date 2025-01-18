<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post">
		<h2>Login Dialog</h2>
		User name :<br/>
		<input type="text" name="username" size=20/><br/><br/>
		User Password :<br/>
		<input type="password" name="userpass" size=20/><br/><br/>
		<input type="submit" value="Login Me"/>
	</form>
	
	<%
		out.println("Method is :" + request.getMethod());
		if(request.getMethod().equals("POST")){
			String username = request.getParameter("username");
			String password = request.getParameter("userpass");
			
			if(username.equals("admin") && password.equals("password")) {
				Cookie cookie = new Cookie("username", username);
				cookie.setMaxAge(5*60);
				response.addCookie(cookie);
				
				session.setAttribute("username", username);
				session.setMaxInactiveInterval(10*60);
				response.sendRedirect("myDemos/loginSuccess.jsp");
			}
			else{
				response.sendError(response.SC_UNAUTHORIZED, 
						"Username/password should not be null or not exists");
			}
		}
	%>
</body>
</html>