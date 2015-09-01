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
			Player currentPlayer = players.get(turnCounter % players.size());
			currentPlayer.takeTurn();
			int currentPlayerPosition = currentPlayer.getPosition();
			int currentPlayerTilePrice = board.getTile(currentPlayerPosition).getCost();
			Tile currentPlayerTile = board.getTile(currentPlayerPosition % board.getBoardSize());
			
			if(currentPlayerTilePrice < currentPlayer.getNetworth()) {
				currentPlayerTile.buy(currentPlayer);
			}
			
			//checkForWin(players.get(turnCounter % players.size()), board);
			
			delay(1000);
			
			
			turnCounter++;
		}
		
	}
	
	//public boolean checkForWin(Player p, Board b) {
		
	//}
	
	private void delay(int milliseconds) {
		try {
		    Thread.sleep(milliseconds);                 //1000 milliseconds is one second.
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}	
	}
	
	private void setup() {
		for(int i = 0; i < 5; i++ ) {
			players.add(new Player("Player" + (i + 1)));
		}
		
		board = new Board();
	}
}
