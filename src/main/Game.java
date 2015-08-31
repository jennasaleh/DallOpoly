package main;

import java.util.ArrayList;

public class Game {
	private ArrayList<Player> players = new ArrayList<Player>();
	
	private boolean gameWinner = false;
	
	private int turnCounter = 0;
	
	private Board board;

	public Game() {
		setup();
	}
	
	public void playGame() {
		System.out.println("*************************************\n**     Welcome to Dallopoly!!!     **\n*************************************");
		
		while(!gameWinner) {
			players.get(turnCounter++ % players.size()).takeTurn();
		}
		
		board = new Board();
	}
	
	private void setup() {
		for(int i = 0; i < 5; i++ ) {
			players.add(new Player("Player" + (i + 1)));
		}
		
		
	}
}
