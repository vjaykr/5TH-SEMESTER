<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ page import="com.jspdemo.models.Emps" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Show data using Application Context</h1>
	<%
		List<Emps> emps = (List<Emps>)application.getAttribute("emps");
		
		out.print("<ul>");
		for(Emps emp : emps){
			out.print("<li>" + emp.getEmpno() + "</li>" + 
				emp.getEname() + "<br/>" + emp.getDeptno());
		}
	%>
	
</body>
</html>