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
	<%
		List<Emps> emps = new ArrayList<Emps>();
		emps.add(new Emps(1,"Jalpa Shah", 10));
		emps.add(new Emps(2,"Mahesh Kotak", 20));
		emps.add(new Emps(3,"Vijay Thandani", 30));
		emps.add(new Emps(4,"Praveen Kumar", 40));
		emps.add(new Emps(5,"Kalpesh Kori", 50));
		
		application.setAttribute("emps", emps);
	%>
	<h1>JSP Application Example</h1>
	<a href="myDemos/jspAppCtxShow.jsp">Show data</a>
</body>
</html>