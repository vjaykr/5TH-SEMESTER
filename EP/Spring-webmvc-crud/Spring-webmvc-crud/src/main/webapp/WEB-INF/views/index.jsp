<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<html>
<head>
<title>Employee Page</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<style type="text/css">
		.td-align {
			text-align: justify;
		}
	</style>
</head>
<body>
	<h3>
		<a href="newEmployee">Add New Employee</a>
	</h3>
	<div class="container-fluid" style="width: 70%">
		<table class="table table-bordered table-striped text-center">
			<thead>
				<tr>
					<th>Id</th>
					<th>Full Name</th>
					<th>Email ID</th>
					<th>Mobile</th>
					<th>Deptno</th>
					<th>Action</th>
				</tr>
			</thead>
			<c:forEach var="employee" items="${listemployees}">
				<tr>
					<td class="td-align">${employee.empId}</td>
					<td class="td-align">${employee.name}</td>
					<td class="td-align">${employee.email}</td>
					<td class="td-align">${employee.mobile}</td>
					<td class="td-align">${employee.deptno}</td>
					<td><a href="editEmployee?id=${employee.empId}" class="btn btn-primary">Edit</a> <a
						href="deleteEmployee?id=${employee.empId}" class="btn btn-danger">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>