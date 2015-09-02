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
			Player currentPlayer = players.get(turnCounter % players.size());

			if(!currentPlayer.isOut){
				currentPlayer.takeTurn();
				Tile currentPlayerTile = board.getTile(currentPlayer.getPosition() % board.getBoardSize());

				if(currentPlayerTile.getOwnedBy() == null )
					currentPlayerTile.populate(currentPlayer,bank);
				else if(currentPlayerTile.getOwnedBy().getId() != currentPlayer.getId())
					currentPlayerTile.host(currentPlayer);
				
				if(currentPlayer.playerIsBankrupt()) {
					currentPlayerTile.vacate();
				}

				
			}



			String marker;
			for(Player player : players) {
				marker = "";
				if(currentPlayer.getId() == player.getId()) {
					marker = "*";
				}
				System.out.print(marker + player.getName() + "=" + player.getNetworth() + "\t");
			}
			System.out.println();

			//checkForWin(players.get(turnCounter % players.size()), board);

			delay(100);

			gui.draw(board,players);
			turnCounter++;
		}

	}


	//public boolean checkForWin(Player p, Board b) {

	//}
	
	public Board getBoard() {
		return board;
	}

	private void delay(int milliseconds) {
		try {
			Thread.sleep(milliseconds);                 //1000 milliseconds is one second.
		} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}	
	}

	private void setup() {
		gui = new GUI();

		players.add(new Player("Player" + 1,1,"#800080"));
		players.add(new Player("Player" + 2,2,"#996633"));
		players.add(new Player("Player" + 3,3,"#ff0000"));
		players.add(new Player("Player" + 4,4,"#00cc00"));
		players.add(new Player("Player" + 5,5,"#0000ff"));

		bank = new Bank("Bank",-1,"#000000");

		board = new Board();
	}
}
