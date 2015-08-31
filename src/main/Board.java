package main;

import java.util.ArrayList;

public class Board {
	public ArrayList<Tile> tiles = new ArrayList<Tile>();

	public Board() {
		System.out.println("Board Created");
	}
	
	public void addTiles() {
		for(int i = 0; i < 15; i++ ) {
			tiles.add(new Tile());
		}
	}

}
