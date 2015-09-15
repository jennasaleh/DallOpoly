package main;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class WhenPlayerRollsDie {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void PlayerShouldAdvanceTheSameNumberofTilesAsTheDieRoll() {
		Player player = new Player("TEST PLAYER1",0,"#ffffff");
		player.takeTurn();
		
		if(player.getRollHistory().get(0).getRoll1() + player.getRollHistory().get(0).getRoll2()  != player.getPosition()) {
			fail(player.getPosition() + "Player roll does not match position");
		}
	}

}
