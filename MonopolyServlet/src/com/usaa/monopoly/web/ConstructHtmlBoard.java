package com.usaa.monopoly.web;

import java.util.ArrayList;

import com.usaa.dallopoly.Board;
import com.usaa.dallopoly.Player;

public class ConstructHtmlBoard {

	private Board b;
	private ArrayList<Player> players;
	
	public static final int DEFAULT_SQUARE_SIDE_SIZE = 50;
	
	public ConstructHtmlBoard() {
		
	}
	
	public void draw(Board b,ArrayList<Player> players) {
		this.b = b;
		this.players = players;
	}
	
	public StringBuilder blankBoard() {
		StringBuilder htmlBuilder = new StringBuilder();
		htmlBuilder.append(createTable());
		return htmlBuilder;
	}
	
	private String addTile() {
		return addTile("#fff");
	}
	
	private String addTile(String color) {
		String t = "<div style=\"width: " + DEFAULT_SQUARE_SIDE_SIZE + "px; height: " + DEFAULT_SQUARE_SIDE_SIZE + "px;background-color: " + color + ";\"></div>";
		return t;
	}
	
	private StringBuilder createTable() {
		StringBuilder table = new StringBuilder();
		table.append("<table style=\"width:100%\">");
		for(int i = 0; i < 15; i++) {
			table.append(addTableRow());
		}
		
		table.append("</table");
		return table;
	}
	
	private StringBuilder addTableRow() {
		StringBuilder row = new StringBuilder();
		row.append("<tr>");
		for(int i = 0; i < 15; i++) {
			row.append("<td>");
			row.append(addTile("#008000"));
			row.append("</td>");
		}
		row.append("</tr>");
		return row;
	}
}
