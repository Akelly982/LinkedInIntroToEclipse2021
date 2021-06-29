package com.toddperkins;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest extends Calculator {

	//use Ctrl space to open hinting window
	private final Calculator calculator = new Calculator();
	
	@Test
	void testAdd() {
		assertEquals(5, calculator.add(2, 3));
	}
	
	@Test
	void testSubtract() {
		assertEquals(1, calculator.subtract(3, 2));
	}
	
	@Test
	void testMultipy() {
		assertEquals(25, calculator.multiply(5, 5));
	}
	
	@Test
	void testDivide(){
		assertEquals(5, calculator.divide(20, 4));
		assertEquals(0, calculator.divide(20, 0));
	}
	

}
