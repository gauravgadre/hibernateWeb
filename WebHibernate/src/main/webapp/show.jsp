<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="com.techno.dao.PersonDao,java.util.*,com.techno.entites.Person"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>


	<div class="container">
		<div class="text-center">
			<a href="index.jsp">
				<button class="btn btn-primary">Add Person</button>
			</a>
		</div>
		<br />
		<table class="table table-bordered mt-3">
			<thead>
				<tr>
					<th>name</th>
					<th>age</th>
					<th>action</th>
					<th>action</th>
				</tr>
			</thead>
			<tbody>
				<%
					List<Person> list = PersonDao.getAllPersons();
					for (Person p : list) {
				%>
				<tr>
					<td><%=p.getName()%></td>
					<td><%=p.getAge()%></td>
					<th><a href="update.jsp?id=<%=p.getId()%>"><button
								class="btn btn-primary">update</button></a></th>
					<th><a href="delete?id=<%=p.getId()%>"><button
								class="btn btn-danger">delete</button></a></th>
				</tr>



				<%
					}
				%>
			</tbody>
		</table>
	</div>


</body>
</html>