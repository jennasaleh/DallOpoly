<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.usaa.monopoly.web.GameState"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
	.BlankSquare{
		width: 75px;
		height: 75px;
		background-color: #fff;
	}

	.PropertySquare{
		width: 75px;
		height: 75px;
		background-color: #000;

		display: table-cell;
		text-align: center;
		vertical-align: middle;
		color: white;
		font-family: arial;
		font-size: xx-large;
	}
</style>
</head>
<body>
	<table>
		<tr>
			<td><div class="PropertySquare">&#149</div></td>
			<td><div class="BlankSquare"></div></td>
			<td><div class="BlankSquare"></div></td>
			<td><div class="PropertySquare"></div></td>
		</tr>
	</table>
	<label><%GameState gs = (GameState)request.getAttribute("GameState");%></label>
</body>
</html>