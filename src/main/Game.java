package main;

import java.util.ArrayList;

public class Game {
	private GUI gui;
	
	private ArrayList<Player> players = new ArrayList<Player>();
	
	private boolean gameWinner = false;
	
	private int turnCounter = 0;
	
	private Board board;
	
	private Bank bank;

	public Game() {
		setup();
	}
	
	public void playGame() {
		System.out.println("*************************************\n**     Welcome to Dallopoly!!!     **\n*************************************");
		
		while(!gameWinner) {
			gui.draw(board,players);

			
			
			Player currentPlayer = players.get(turnCounter % players.size());
			
			//Down to 1 Player?
			//checkforWinner();
			
			currentPlayer.takeTurn();
			Tile currentPlayerTile = board.getTile(currentPlayer.getPosition() % board.getBoardSize());
			
			currentPlayerTile.populate(currentPlayer,bank);
			
			if(currentPlayer.playerIsBankrupt()) {
				System.out.println("\n	*** " + currentPlayer.getName() + " is kicked out! ***\n");
				System.out.println("	Original size: " + players.size());
				players.remove(currentPlayer.getId());
				System.out.println("\n	New size: " + players.size());
				
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
		gui = new GUI();
		
		players.add(new Player("Player" + 1,1,"#00ff00"));
		players.add(new Player("Player" + 2,2,"#ffff00"));
		players.add(new Player("Player" + 3,3,"#ff0000"));
		players.add(new Player("Player" + 4,4,"#00ffff"));
		players.add(new Player("Player" + 5,5,"#0000ff"));
		
		bank = new Bank("Bank",-1,"#000000");
		
		board = new Board();
	}
}
