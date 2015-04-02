<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert new Employee</title>
</head>
<body>
	<form action="InsertEmployee">
	<fieldset>
	<legend>Form new Employee</legend>
	<p>ID:
	<input type="text" name="id">
	</p>
	<p>
	Name:
	<input type="text" name="name">
	</p>
	<p>
	dateofbirth:
	<input type="text" name="dateofbirth">
	</p>
	<p>
	agency:
	<input type="text" name="agency">
	</p>
	<p>
	<input type="submit" value="Insert">
	</p>
	</fieldset>
</form>
</body>
</html>