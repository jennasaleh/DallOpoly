package com.usaa.monopoly.web;

import java.util.ArrayList;

public class GameState {
	//TODO fill this out
	//dummy variable, should instead hold actual board/game state
	public final static int BOARD_DEFAULT_TILE_NUMBER = 40;
	public int dummy = 0;
	public ArrayList<String> boardColors;
	public GameState() {
		boardColors = new ArrayList<String>();
	}
	
	public void fillGameColors(Board b) {
		for(int i = 0; i < b.getBoardSize(); i++) {
			if(b.getTile(i).getOwnedBy() != null) {
				boardColors.add(b.getTile(i).getOwnedBy().getColor());
			}
			else
				boardColors.add("#000");
		}
	}
	
	
}
