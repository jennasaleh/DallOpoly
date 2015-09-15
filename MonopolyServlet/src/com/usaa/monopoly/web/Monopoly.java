package com.usaa.monopoly.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Monopoly
 */
@WebServlet("/Monopoly")
public class Monopoly extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Monopoly() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		//TODO page needs to be constructed in html
		//TODO if game is over, deconstruct page, redirect to splash screen
		
		ConstructHtmlBoard b = new ConstructHtmlBoard();
		response.setContentType("text/html");
		response.getWriter().append(b.blankBoard());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//to get request parameters, name is in the html form name   request.getParameter("numOfPlayers");
		// TODO get post information
		//TODO start game, construct etc
		//TODO serve page via doGet method call
		doGet(request, response);
		
	}

}
