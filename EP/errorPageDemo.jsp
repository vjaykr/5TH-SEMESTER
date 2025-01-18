<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page errorPage="errorpage.html" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
		Number-1:<input type="text" name="num1" /><br/><br/>  
		Number-2:<input type="text" name="num2" /><br/><br/>  
		<input type="submit" value="Get divide"/>  
	</form>
	
	<%
		if(request.getParameter("num1") != null && 
			request.getParameter("num2") != null){
			int result = 
					Integer.parseInt(request.getParameter("num1"))/
					Integer.parseInt(request.getParameter("num2"));
			out.println("Result is :" + result);
		}
	%>
</body>
</html>