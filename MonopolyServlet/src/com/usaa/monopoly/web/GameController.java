package com.usaa.monopoly.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class GameController {
	public boolean gameIsOver = false;
	
	private ArrayList<Player> players = new ArrayList<Player>();
	private boolean gameWinner = false;
	private int turnCounter = 0;
	private boolean debug = false;
	private int delayTime = 100;
	private Board board;
	private Bank bank;

	public GameController() {
		setup();
	}

	public void playGame() {
		System.out.println("*************************************\n**     Welcome to Dallopoly!!!     **\n*************************************");

		while(players.size() > 1) {
			//Wait for User input
			if(debug) {
				try {
					System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}


			//Get Current Player
			Player currentPlayer = players.get(turnCounter % players.size());
			Tile currentPlayerTile = board.getTile(currentPlayer.getPosition() % board.getBoardSize());

			if(currentPlayer.getNetworth() > 0 ){
				currentPlayer.takeTurn();


				if(currentPlayerTile.getOwnedBy() == null )
					currentPlayerTile.buy(currentPlayer,bank);
				else if(currentPlayerTile.getOwnedBy().getId() != currentPlayer.getId())
					currentPlayerTile.visitedBy(currentPlayer);

			} else {
				for(Tile t : board.tiles) {
					if(t.getOwnedBy() != null) {
						if(t.getOwnedBy().getId() == currentPlayer.getId()) {
							t.vacate();
						}
					}
				}

				players.remove(turnCounter % players.size());
				System.out.println("\t" + currentPlayer.getName() + " out");
			}



			String marker;
			System.out.print(turnCounter + ") " );
			for(Player player : players) {
				marker = "";
				if(currentPlayer.getId() == player.getId()) {
					marker = "*";
				}
				System.out.print(marker + player.getName() + "=" + player.getNetworth() + "\t\t");
			}
			System.out.println();

			//checkForWin(players.get(turnCounter % players.size()), board);

			delay(delayTime);

			turnCounter++;
		}
	}
	
	public void playGame(int numOfTurns) {

		int endTurn = turnCounter + numOfTurns;
		
		while(players.size() > 1 && turnCounter<= endTurn) {
			//Wait for User input
			if(debug) {
				try {
					System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}


			//Get Current Player
			Player currentPlayer = players.get(turnCounter % players.size());
			Tile currentPlayerTile = board.getTile(currentPlayer.getPosition() % board.getBoardSize());

			if(currentPlayer.getNetworth() > 0 ){
				currentPlayer.takeTurn();


				if(currentPlayerTile.getOwnedBy() == null )
					currentPlayerTile.buy(currentPlayer,bank);
				else if(currentPlayerTile.getOwnedBy().getId() != currentPlayer.getId())
					currentPlayerTile.visitedBy(currentPlayer);

			} else {
				for(Tile t : board.tiles) {
					if(t.getOwnedBy() != null) {
						if(t.getOwnedBy().getId() == currentPlayer.getId()) {
							t.vacate();
						}
					}
				}

				players.remove(turnCounter % players.size());
				System.out.println("\t" + currentPlayer.getName() + " out");
			}



			String marker;
			System.out.print(turnCounter + ") " );
			for(Player player : players) {
				marker = "";
				if(currentPlayer.getId() == player.getId()) {
					marker = "*";
				}
				System.out.print(marker + player.getName() + "=" + player.getNetworth() + "\t\t");
			}
			System.out.println();

			//checkForWin(players.get(turnCounter % players.size()), board);
			if(players.size() < 1) {
				gameIsOver = true;
			}
			delay(delayTime);
			turnCounter++;
		}
	}
	
	public int getTurnCounter() {
		return turnCounter;
	}

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

		players.add(new Player("Mike",0,"#800080"));
		players.add(new Player("Jenna",1,"#996633"));
		players.add(new Player("Darren",2,"#ff0000"));
		players.add(new Player("Joey",3,"#00cc00"));
		players.add(new Player("Jon",4,"#0000ff"));

		bank = new Bank("Bank",-1,"#000000");

		board = new Board();
	}
	
	//TODO fill this out
	public GameState getGameState() {
		GameState gs = new GameState();
		gs.fillGameColors(board, players);
		return gs;
	}
}
