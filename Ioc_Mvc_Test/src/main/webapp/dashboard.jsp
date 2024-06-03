<%@page import="java.util.List"%>
<%@page import="com.jsp.dao.StudentDao"%>
<%@page import="com.jsp.dto.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>${msg3 }</h2>
	<h1>Student Dashboard</h1>
	<table border="1px" cellpadding="5px" width="80%">
		<tr>
			<th>S.no</th>
			<th>ID</th>
			<th>Name</th>
			<th>Email</th>
			<th>Date of Birth</th>
			<th>Mobile No</th>
		</tr>
		<%
		int i = 1;
		%>
		<c:forEach var="stu" items="${list }">
			<tr>
				<td><%=i++%></td>
				<td>${stu.getId() }</td>
				<td>${stu.getName() }</td>
				<td>${stu.getEmail() }</td>
				<td>${stu.getDob() }</td>
				<td>${stu.getMobile() }</td>

			</tr>

		</c:forEach>
		
		<br>
		<br>
		<br>
		
		<a href="HomePage.jsp"><button>Home Page</button></a>

	</table>

</body>
</html>