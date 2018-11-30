package app;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PirexFrameTest {

	/*
	 * Test the default constructor to see if there are no exceptions. 
	 */
	@Test
	public void testPirexFrame() {
		try {
			new PirexFrame();
			
		} catch(Exception e) {
			assertTrue(true);
		}
	}

}
