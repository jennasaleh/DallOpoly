package main;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.sun.prism.paint.Color;


public class TileTests {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void testPlayerCharge() {
		
		
		for(int i = -10000; i < 10000; i++ ) {
			
			Player player1 = new Player(null,0,null);
			Player player2 = new Player(null,1,null);

			player1.charge(i, player2);
			
			if(player1.getNetworth() != player1.DEFAULT_START_VALUE - i && player2.getNetworth() != player2.DEFAULT_START_VALUE + i) {
				fail("Charge not working");
			}
		}

		
	}
	
	@Test
	public void testMultipleHouses() {
		Tile t = new Tile(100,0);
		Player p1 = new Player(null,0,null);
		Player p2 = new Player(null,0,null);
		Bank b = new Bank(null, 0, null);
		
		t.buy(p1, b);
		
		
		if(p1.getNetworth() != 1900) {
			fail("Player does not populate house");
		}
		
		t.visitedBy(p2);
		
		if(p2.getNetworth() != 1990) {
			fail("Player is not charged rent ");
		}
		
		t.visitedBy(p1);
		t.visitedBy(p2);
		
		if(p2.getNetworth() != 1970) {
			fail("Player does not pay higher rent for multiple houses" + p2.getNetworth());
		}
	}
	
	@Test
	public void testPurchase() {
		
		for(int i = -10; i < 1000; i++ ) {
			Player p1 = new Player(null,0,null);
			Tile t1 = new Tile(i,0);
			Bank b = new Bank(null, 0, null);
			
			t1.buy(p1, b);
			
			if(t1.getOwnedBy().getId() != p1.getId()){
				fail("Purchase from bank not working");
			}
		}
		
	}

	@Test
	public void testFailToBuyLowMoney() {
		for (int i = 2050; i < 2060; i++) {
			Player player1 = new Player("One",0,null);
			Bank bank = new Bank("Bank",0,null);
			player1.charge(i,bank);
			
			if (player1.getNetworth() == player1.DEFAULT_START_VALUE - i) {
				fail("Blocked Purchase not Working");
			}
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
