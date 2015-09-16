<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body {text-align:center;} 
body {background-color: lightblue;}
input [type = 'text'] {font-size:40px;}
input [type = 'radio'] {font-size:40px;}
input [type = 'submit'] {font-size:40px;}
</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>The Monopoly Game</title>
</head>

<body>
		<h1><font color = "purple", size = "15">The Monopoly Game!</font></h1>
		
	<form action="Monopoly" method="post">
		Select Number of Players: 
		<input type="radio" name="numOfPlayers" value="2" checked>  2 
		<input type="radio" name="numOfPlayers" value="3"> 3
		<input type="radio" name="numOfPlayers" value="4"> 4
		<br>
		Enter preferred starting amount of money:
		<input type="text" name="startingMoney">
		<br>
		<input type="submit" value="Submit">
	</form>
	
	<img src = "mguy.jpg" alt = "monopolyGuy" style = "width:687px;height:500px;">
	
</body>
</html>
