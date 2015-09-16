<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.usaa.monopoly.web.GameState"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
	.BlankSquare{
		width: 675px;
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
</style>
</head>
<%!GameState gs; %>
<%gs = (GameState)request.getAttribute("GameState");%>
<body>
	<div class="PropertySquare"></div>
	<div class="PropertySquare"></div>
	<div class="PropertySquare"></div>
	<div class="PropertySquare"></div>
	<div class="PropertySquare"></div>
	<div class="PropertySquare"></div>
	<div class="PropertySquare"></div>
	<div class="PropertySquare"></div>
	<div class="PropertySquare"></div>
	<div class="PropertySquare"></div>
	<div class="PropertySquare"></div>
	<br>
	<div class="PropertySquare"></div>
	<div class="BlankSquare"></div>
	<div class="PropertySquare"></div>
	
	<div class="BlankSquare"></div>
	<label><%=gs.dummy %></label>
</body>
</html>