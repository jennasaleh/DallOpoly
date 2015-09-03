package main;

import java.util.Random;

public class Driver {

	public Driver() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Game game = new Game();
		game.playGame();
		
	}
	
	public class Diecup {
		public final static int MIN_TOTAL = 2;
		public final static int MAX_TOTAL = 12;
		
		public int total() {
			int dice1 = die.roll();
			int dice2 = die.roll();
			int total = dice1 + dice2;
			return total;
		}
		
	}
	
}
