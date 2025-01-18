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
		String remoteadd = request.getRemoteAddr();
		String remotehost = request.getRemoteHost();
		String requri = request.getRequestURI();
		String sessid = request.getRequestedSessionId();
		String srvctx = request.getServletPath();
	
		out.println("<br/>Remote Address :" + remoteadd);
		out.println("<br/>Remote Host    :" + remotehost);
		out.println("<br/>Request URI    :" + requri);
		out.println("<br/>Session id     :" + sessid);
		out.println("<br/>Srv Context    :" + srvctx);
		out.println("Method requested by user :" + request.getMethod());
	%>
</body>
</html>