package main;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DieTest {
	private Die die;
	
	@Before
	public void setUp() throws Exception {
		die = new Die();
	}
	
	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void test() {
		if(badDieValues(die)) {
			fail("Invalid Die Values");
			
		}	
	}
	
	public boolean badDieValues(Die die) {	
		for(int i = 0; i < 100; i++ ) {
			int dieRoll = die.roll();
			
			if(dieRoll < 1 || dieRoll > die.DEFAULT_NUMBER_OF_FACES ) {
				return true;
			}
		}
		
		return false;
	}

}
