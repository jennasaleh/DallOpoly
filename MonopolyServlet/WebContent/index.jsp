<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>The Monopoly Game</title>
</head>
<body>
		<h1>The Monopoly Game</h1>
	<form action="Monopoly" method="post">
		Select Number of Players: 
		<input type="radio" name="numOfPlayers" value="2" checked>  2 
		<input type="radio" name="numOfPlayers" value="3"> 3
		<input type="radio" name="numOfPlayers" value="4"> 4
		<br>
		Enter starting money:
		<input type="text" name="startingMoney">
		<br>
		<input type="submit" value="Submit">
	</form>
</body>
</html>