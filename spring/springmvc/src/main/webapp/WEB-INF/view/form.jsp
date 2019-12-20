<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User</title>
</head>
<body>
	<form action="./form" method="post" align="center">


		<div class="form-group">
			<input type="text" class="form-control" name="id" placeholder="id">
		</div>

		<div class="form-group">
			<input type="text" class="form-control" name="name"
				placeholder="name">
		</div>

		<div class="form-group">
			<input type="password" class="form-control" name="password"
				placeholder="password">
		</div>

		<div class="form-group">
			<input type="text" class="form-control" name="gender"
				placeholder="gender">
		</div>

		<div class="form-group">
			<input type="date" class="form-control" name="doj"
				placeholder="yyyy-mm-dd">
		</div>

		<div class="form-group">
			<input type="reset" class="form-control" value="Reset">
		</div>

		<div class="form-group">
			<input type="submit" class="form-control" value="Register">
		</div>
	</form>
</body>
</html>