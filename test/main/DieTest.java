package main;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class DieTest {
	
	@Before
	public void setUp() throws Exception {
		
	}
	
	@After
	public void tearDown() throws Exception {
		
	}
	
	@Test
	public void testDefaultDieValue() {
		try {
			Die die = new Die();
			Assert.assertEquals("Die does not default to 6", 6, die.DEFAULT_NUMBER_OF_FACES);
		} catch (TooFewDieFacesException e) {
			fail(e.getLocalizedMessage());
		}
		
	}
	
	@Test
	// Darren update Die Range
	// New range 2-12 and not 1-6
	public void testDieValueRange() {
		try {
			Die die = new Die();
			
			for(int i = 0; i < 100; i++ ) {
				int dieRoll = die.roll();
				
				if(dieRoll < 2 || dieRoll > (2 * die.DEFAULT_NUMBER_OF_FACES )) {
					fail("Invalid Die Values");
				}
			}
		} catch (TooFewDieFacesException e) {
			fail(e.getLocalizedMessage());
		}
		
		
		
	}

}
