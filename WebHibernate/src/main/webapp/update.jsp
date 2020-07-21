<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ page import="com.techno.dao.PersonDao,com.techno.entites.Person" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
Person p=PersonDao.getPerson(Integer.parseInt(request.getParameter("id"))); %>
<form action="update" method="post">
<input type="hidden" name="id" value="<%=p.getId()%>"/>
Name : <input type="text" name="pname" value="<%=p.getName()%>"/>
Age : <input type="text" name="age" value="<%=p.getAge()%>"/>
<input type="submit" value="submit"/>
</form>

</body>
</html>