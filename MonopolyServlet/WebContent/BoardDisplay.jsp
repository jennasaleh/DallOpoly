<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.usaa.monopoly.web.GameState"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="refresh" content="5">
<title>Insert title here</title>
<style>
	.BlankSquare{
		width: 675px;
		height: 75px;
		background-color: #fff;
		display: table-cell;
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
	
	.PlayerInfo{
   		width: auto;
    	color: white;
    	font-family: arial;
    	font-size: xx-large;
    	padding-left: .5%;
    	padding-right: .5%;
	}
</style>
</head>
<%!GameState gs; %>
<%!int tile = 0; %>
<%gs = (GameState)request.getAttribute("GameState");%>

<body>
	<table cellspacing="0" cellpadding="0">
		<%
		for(int i = 0; i < 11; i++) {
			String square = "<td><div class=\"PropertySquare\" style=\"background-color: " +gs.boardColors.get(tile++) +"\"></div></td>";
		%>
		<%=square%>
		<%
		}
		%>
	</table>
	
	<table cellspacing="0" cellpadding="0">
		<%for(int i = 0; i < 9; i++) {
			String square =   "<table cellspacing=\"0\" cellpadding=\"0\">"
							+ "<td><div class=\"PropertySquare\" style=\"background-color: " +gs.boardColors.get(tile++) +"\"></div></td>"
							+ "<td><div class=\"BlankSquare\"</div></td>"
							+ "<td><div class=\"PropertySquare\" style=\"background-color: " +gs.boardColors.get(tile++) +"\"></div></td>"
							+ "</table>";
		%>
		<%=square %>
		<%
		}
		%>
	</table>
	
	<table cellspacing="0" cellpadding="0">
		<%
		for(int i = 0; i < 11; i++) {
			String square = "<td><div class=\"PropertySquare\" style=\"background-color: " +gs.boardColors.get(tile++) +"\"></div></td>";
		%>
		<%=square%>
		<%
		}
		
		tile = 0;
		%>
	</table>
	<br>
	<span class="PlayerInfo" style="background-color: <%=gs.playerColors[0] %>"><%=gs.playerNames[0] %> has $<%=gs.playerMoney[0]%></span>
	<br>
	<span class="PlayerInfo" style="background-color: <%=gs.playerColors[1] %>"><%=gs.playerNames[1] %> has $<%=gs.playerMoney[1]%></span>
	<br>
	<span class="PlayerInfo" style="background-color: <%=gs.playerColors[2] %>"><%=gs.playerNames[2] %> has $<%=gs.playerMoney[2]%></span>
	<br>
	<span class="PlayerInfo" style="background-color: <%=gs.playerColors[3] %>"><%=gs.playerNames[3] %> has $<%=gs.playerMoney[3]%></span>
	<br>
	<span class="PlayerInfo" style="background-color: <%=gs.playerColors[4] %>"><%=gs.playerNames[4] %> has $<%=gs.playerMoney[4]%></span>
	
	
</body>
</html>