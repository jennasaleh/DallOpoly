package main;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class PropertyTests {
	
	@Before
	public void setUp() throws Exception {
		
	}
	
	@After
	public void tearDown() throws Exception {
		
	}
	
	@Test
	public void testFailToBuyLowMoney() {
		try {
			//Test here
			Assert.assertEquals("Message", Expected, Actual);
		} catch (TooLittleMoney e) {
			fail(e.getLocalizedMessage());
		}
		
	}
	
	@Test
	public void testFailToBuyNotAvailable() {
		try {
			//Test here
			Assert.assertEquals("Message", Expected, Actual);
		} catch (PropertyNotAvailable e) {
			fail(e.getLocalizedMessage());
	}
		
}
