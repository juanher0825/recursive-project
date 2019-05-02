package model;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecursiveFunctionsTest {
	
	private RecursiveFunctions a;

	@Test
	void setupScenary1() {
		a = new RecursiveFunctions();
	}
	
	@Test
	void factorialTest() {
		setupScenary1();
		
		assertTrue(a.factorial(2) == 2);
		assertTrue(a.factorial(5) == 120);
		assertTrue(a.factorial(10) == 3628800);
		
	}
	
	@Test
	void fibonacciTest() {
		setupScenary1();
		
		assertTrue(a.fibonacci(3) == 2);
		assertTrue(a.fibonacci(5) == 5);
		assertTrue(a.fibonacci(4) == 3);
	}
	
	@Test
	void arraySummaryTest() {
		setupScenary1();
		int[] d = {1,2,3};
		int[] b = {1,2,3,4,5};
		int[] c = {1,2,3,4,5,6,7};
		assertTrue(a.arraySummatory(d, d.length-1) == 6);
		assertTrue(a.arraySummatory(b, b.length-1) == 15);
		assertTrue(a.arraySummatory(c, c.length-1) == 28);
	}

}
