<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.usaa.monopoly.web.GameState"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DisplayBoard</title>

<style>

body {text-align:center;} 
body {background-color: #C6DEFF;}
input [type = 'text'] {font-size:25px;}
input [type = 'radio'] {font-size:70x;}
input [type = 'submit'] {font-size:40px;}

	.BlankSquare{
		width: 75px;
		height: 75px;
		background-color: #fff;
		display: table-cell;
		border-style: solid;
		border-width: 1px;
	}

	.PropertySquare{
		width: 75px;
		height: 75px;
		background-color: #000;
		display: table-cell;

		display: table-cell;
		text-align: center;
		vertical-align: middle;
		color: white;
		font-family: arial;
		font-size: xx-large;
	}
	
	.rectangle {
		width: 420px;
		height: 350px;
		background: #F0FFFF;
		text-align: center;
		vertical-align: middle;
		margin-left: 555px;
		border-radius: 10%;
		border: 3px solid  #3BB9FF;
		padding: 15px;
	}
	
	
	
</style>
</head>

<body>

		<h1><font color = "#1589FF" size = "30" face = "arial"><u>The Monopoly Game!</u></font></h1>
		
		<div class="rectangle">
			<font color = "purple" face = "arial" size = "5"><br><b><i>RULES:</i></b>
			<br><p align = "left">
			* Each player must buy the property they land on. <br>
			* If a property is already owned, the player that lands on it must pay rent. <br>
			* Rent is the number of houses on a property x 10%. <br>
			* Player is kicked out when their net worth falls below zero. </p>
			</font>
		</div>
		
	<form action="Monopoly" method="post">
			<font size = "5" color = "1F45FC" face = "arial"><br>Select Number of Players: </font>
			<input type="radio" name="numOfPlayers" value="2" checked>  2 
			<input type="radio" name="numOfPlayers" value="3"> 3
			<input type="radio" name="numOfPlayers" value="4"> 4
			<input type="radio" name="numOfPlayers" value="5"> 5
		<br>
		<br>
		<font size = "5" color = "1F45FC" face = "arial">Enter preferred starting amount of money:</font>
		<input type="text" name="startingMoney">
		<br><br>
		<input type="submit" value="Submit">
	</form>
	
</body>
</html>
