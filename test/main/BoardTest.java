package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoardTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testBoardForNull() {
		Game g = new Game();
		Board board = g.getBoard();
		
		for(Tile tile : board.tiles) {
			if(tile.getOwnedBy() != null) {
				fail("Tile is not initiated with null value");
			}
		}
		
		Player pTest = new Player("name",1, null);
	}

}
