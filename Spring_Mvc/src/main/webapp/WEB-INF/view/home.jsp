<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>welcome to home in page</h1>
<%
  String name = (String)request.getAttribute("name");   %>

<h3 >Name:<%=name%></h3>3
<a href="login">login</a>
</body>
</html>