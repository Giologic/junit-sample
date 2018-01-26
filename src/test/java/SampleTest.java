

import static org.junit.Assert.*;

import org.junit.Test;

public class SampleTest {
	
	@Test
	public void simpleTestPassed() {
		int a = 1;
		int b = 2;
		assertTrue(a + b == 3);
	}
	
 	@Test
 	public void simpleTestFailed() {
 		int a = 1;
 		int b = 2;
 		assertFalse(a + b == 5);
 		}
 		
 		
 	}
