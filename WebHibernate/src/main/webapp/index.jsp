<html>
<body>

<%if(request.getAttribute("msg")!=null) {%>
<%=request.getAttribute("msg") %>
<%} %>
<form action="save" method="post">
Name : <input type="text" name="pname"/>
Age : <input type="text" name="age"/>
<input type="submit" value="submit"/>
</form>
<a href="show.jsp">show persons</a>
</body>
</html>
