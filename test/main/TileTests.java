package main;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TileTests {
	
	@Before
	public void setUp() throws Exception {
		
	}
	
	@After
	public void tearDown() throws Exception {
		
	}
	
	@Test
	public void testPlayerBuyFromPlayer() {
		try {
			String player1 = Player("One",1,null);
			String player2 = Player("Two",2,null);
			String expectNewBalance1 = 1950;
			String expectNewBalance2 = 2050;
			// One pays 50 to Two
			p.charge(50,b);
			
			
		} catch (PropertyBuyNoFunds e) {
			fail(e.getLocalizedMessage());
		}
	}
	
	@Test
	public void testFailToBuyLowMoney() {
		try {
			Tile currentPlayerTile = new Tile(200,0);
			boolean result = currentPlayerTile.buy(currentPlayer);
			Assert.assertTrue("Result was " + result, result);
		} catch (PropertyBuyNoFunds e) {
			fail(e.getLocalizedMessage());
		}
	}
	
	@Test
	public void testFailToBuyNotAvailable() {
		try {
			boolean result = currentPlayerTile.buy(currentPlayer,OwnedBy!=p);
			Assert.assertTrue("Bought but Not Enough Money: " + result, result);
		} catch (PropertyNotAvailable e) {
			fail(e.getLocalizedMessage());
		}
	}
	
	@Test
	public void testFailToBuyAlreadyOwned() {
		try {
			boolean result = currentPlayerTile.buy(currentPlayer,OwnedBy=p);
			Assert.assertTrue("Bought but Already Owned: " + result, result);
		} catch (PropertyBuyDuplicate e) {
			fail(e.getLocalizedMessage());
		}
	}
	
	@Test
	public void testLimit40Tiles() {
		try {
			boolean result = numTiles > 40;
			Assert.assertTrue("Tiles More than 40: " + result, result);
		} catch (TilesLimitExceeded e) {
			fail(e.getLocalizedMessage());
		}
	}
	
	@Test
	public void testLimitMoneyBelowZero() {
		try {
			boolean result = money < 0;
			Assert.assertTrue("Money Less than Zero: " + result, result);
		} catch (MoneyNotAvailable e) {
			fail(e.getLocalizedMessage());
		}
	}
	
	@Test
	public void testLimit4Houses() {
		try {
			boolean result = houses > 4;
			Assert.assertTrue("More than 4 Houses: " + result, result);
		} catch (HouseNotAvailable e) {
			fail(e.getLocalizedMessage());
		}
	}
		
}
