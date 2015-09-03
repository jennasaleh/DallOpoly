/**
 * 
 */
package main;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author plk6272
 *
 */
public class WhenTileIsLandedOn {
	
	private Player player1,player2;
	private Tile tile;
	private Bank bank;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		tile = new Tile(100,0);
		player1 = new Player("TEST PLAYER1",0,null);
		player2 = new Player("TEST PLAYER2",1,null);
		bank = new Bank("TEST BANK", 0, null);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void PlayerShouldPopulateHouse() {
		tile.buy(player1, bank);
		
		if(player1.getNetworth() != player1.DEFAULT_START_VALUE - tile.getCost()) {
			fail("Player does not populate house");
		}
	}
	
	@Test
	public void TileShouldHoldPlayerId() {
		tile.buy(player1, bank);
		
		if(tile.getOwnedBy().getId() != player1.getId()) {
			fail("Player did not successfully aquire tire");
		}
	}
	
	@Test
	public void PlayerShouldPayRentIfSpotAlreadyOwned() {
		tile.buy(player1, bank);
		tile.visitedBy(player2);
		
		if(player2.getNetworth() != player2.DEFAULT_START_VALUE - tile.calculateRent()) {
			fail("Player was not correctly charged rent" + player2.getNetworth());
		}
	}
	
	@Test
	public void PlayerShouldNotAquireTileIfAlreadyOwned() {
		tile.buy(player1, bank);
		tile.visitedBy(player2);
		
		if(tile.getOwnedBy().getId() != player1.getId()) {
			fail("Player stole tile");
		}
		
	}
	
	@Test
	public void PlayerShouldPayCorrectRentForMultipleHouses() {
		tile.buy(player1, bank);
		tile.visitedBy(player1);
		tile.visitedBy(player2);
		
		if(player2.getNetworth() != player2.DEFAULT_START_VALUE - tile.calculateRent()) {
			fail("Multiple house rent pay not correct");
		}
	}

}
