package com.usaa.monopoly.web;

import java.util.ArrayList;

public class GameState {
	//TODO fill this out
	//dummy variable, should instead hold actual board/game state
	public final static int BOARD_DEFAULT_TILE_NUMBER = 40;
	public final static int NUMBER_OF_PLAYERS = 5;
	
	public ArrayList<String> boardColors;
	public boolean gameIsOver = false;
	
	public int[] playerMoney;
	public String[] playerNames;
	public String[] playerColors;
	public boolean[] playerIsOut;
	
	
	public GameState() {
		boardColors = new ArrayList<String>();
		playerMoney = new int[NUMBER_OF_PLAYERS];
		playerNames = new String[NUMBER_OF_PLAYERS];
		playerColors = new String[NUMBER_OF_PLAYERS];
		playerIsOut = new boolean[] {true, true, true, true, true};
	}
	
	public void fillGameColors(Board b, ArrayList<Player> players) {
		for(int i = 0; i < b.getBoardSize(); i++) {
			if(b.getTile(i).getOwnedBy() != null) {
				boardColors.add(b.getTile(i).getOwnedBy().getColor());
			}
			else
				boardColors.add("#000");
		}
		
		fillPlayerArrays(players);
	}
	
	private void fillPlayerArrays(ArrayList<Player> p) {
		for(int i = 0; i < p.size(); i++) {
			playerMoney[i] = p.get(i).money;
			playerNames[i] = p.get(i).getName();
			if(playerMoney[i] > 0) {
				playerIsOut[i] = false;
			}
			else
				playerIsOut[i] = true;
			playerColors[i] = p.get(i).getColor();
		}
	}
}
