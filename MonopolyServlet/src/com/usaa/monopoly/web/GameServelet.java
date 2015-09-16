package com.usaa.monopoly.web;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GameServelet
 */
@WebServlet("/GameServelet")
public class GameServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private GameController game;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GameServelet() {
        super();
        startGame();
        // TODO Auto-generated constructor stub
    }
    
    public void init() {
    	
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	public void startGame() {
		if(game != null) {
			
		}
		
		else {
			game = new GameController();
			game.playGame();
		}
		
	}

}
