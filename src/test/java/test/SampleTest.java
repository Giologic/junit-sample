package test;
import main.Operations;


import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.junit.Test;

public class SampleTest {
	
	Operations ops = new Operations();
	
	@Test
	public void testAdd() {
		int a = 1;
		int b = 2;
		assertTrue(ops.add(a, b) == 3);
	}
	
 	@Test
 	public void testMinus() {
 		int a = 5;
		int b = 3;
		assertTrue(ops.subtract(a, b) == 2);
	}
 	
 	@Test
 	public void testMultiply() {
 		int a = 11;
 		int b = 6;
 		assertFalse(ops.multiply(a, b) == 30);
 	}
 	
 	@Test
 	public void testDivide() {
 		int a = 11;
 		int b = 4;
 		assertFalse(ops.divide(a, b) == 3);
 	}
 	
}
