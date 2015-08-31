package main;

import java.util.ArrayList;
import java.util.Random;

public class Board {
	public ArrayList<Tile> tiles = new ArrayList<Tile>();

	public Board() {
		System.out.println("Board Created");
	}
	
	public int getBoardSize() {
		return tiles.size();
	}
	
	public void addTiles() {
		Random r = new Random();
		
		for(int i = 0; i < 15; i++ ) {
			tiles.add(new Tile(r.nextInt() % 200));
		}
		
		tiles.add(new Jail(0));
	}

}
