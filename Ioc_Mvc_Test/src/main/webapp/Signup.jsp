<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>student signup</title>
</head>
<body>


	<h1>Student SignUp</h1>
	<form:form action="saveStudent" modelAttribute="student">
Name : <form:input path="name" />
		<br>
		<br>
Email : <form:input path="email" />
		<br>
		<br>
Password : <form:password path="password" />
		<br>
		<br>
D.O.B : <input type="date" name="db">
		<br>
		<br>
Mobile : <form:input path="mobile" />
		<br>
		<br>

		<form:button>SignUp</form:button>
		<input type="reset" value="Cancel">



	</form:form>

</body>
</html>