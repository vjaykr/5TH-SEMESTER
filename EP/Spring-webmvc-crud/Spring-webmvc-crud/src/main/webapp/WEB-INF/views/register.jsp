<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container col-md-4 col-md-offset-3" style="overflow: auto">
  		<h1>Employee Registration</h1>
		<form:form action="saveEmployee" method="post"
			modelAttribute="employee" class="form-horizontal">

			<form:hidden path="empId" />
			
			<div class="form-group">
				<label for="name">Full Name</label>
				<form:input path="name" class="form-control" />
			</div>
			<div class="form-group">
				<label for="email">Email</label>
				<form:input path="email" class="form-control" />
			</div>
			<div class="form-group">
				<label for="mobile">Mobile</label>
				<form:input path="mobile" class="form-control" />
			</div>
			<div class="form-group">
				<label for="deptno">Deptno</label>
				<form:input path="deptno" class="form-control" />
			</div>
			<div class="form-group">
				<input type="submit" value="Save Employee"></td>
			</div>			
		</form:form>
	</div>
</body>
</html>