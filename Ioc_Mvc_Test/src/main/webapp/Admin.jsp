<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Login</title>
</head>
<body>

	<h2>Admin LogIn</h2>

	<h2>${msg2 }</h2>


	<form action="Adminlogin">

		UserName:<input type="text" name="name"><br> <br>
		Password:<input type="password" name="password"><br> <br>
		<input type="submit" value="LOGIN"> <input type="reset"
			value="CANCEL">

	</form>



</body>
</html>