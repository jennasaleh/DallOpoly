package main;

import java.util.ArrayList;

public class Game {
	private ArrayList<Player> players = new ArrayList<Player>();
	
	private boolean gameWinner = false;
	
	private int turnCounter = 0;

	public Game() {
		setup();
	}
	
	public void playGame() {
		System.out.println("*************************************\n**     Welcome to Dallopoly!!!     **\n*************************************");
		
		while(!gameWinner) {
			players.get(turnCounter++ % players.size()).takeTurn();
		}
		
		
	}
	
	private void setup() {
		for(int i = 0; i < 5; i++ ) {
			players.add(new Player("Player" + (i + 1)));
		}
		
		
	}
}
