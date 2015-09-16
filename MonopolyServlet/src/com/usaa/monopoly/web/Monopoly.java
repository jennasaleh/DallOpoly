package com.usaa.monopoly.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Monopoly")
public class Monopoly extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private GameController game = new GameController();	
	
    public Monopoly() {
        // TODO Auto-generated constructor stub
    }
    
    public void init() {
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		game.playGame(1);
		response.getWriter().append("Number of turns: " + game.getTurnCounter());
		response.setContentType("text/html");
		
		//put the gameboard data object in to an attribute so it can be accessed in jsp
		request.setAttribute("GameState", game.getGameState());
		request.getRequestDispatcher("/board/").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//to get request parameters, name is in the html form name   request.getParameter("numOfPlayers");
		if(game.gameIsOver) {
			game = new GameController();
		}
		doGet(request, response);
		
	}

}
