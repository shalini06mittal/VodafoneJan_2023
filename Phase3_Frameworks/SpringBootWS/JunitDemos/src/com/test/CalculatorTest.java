package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.java.Calculator;

class CalculatorTest {

	Calculator ob;
	
	@BeforeEach
	public void before()
	{
		ob = new Calculator();
	}
	@AfterEach
	public void after()
	{
		ob = null;
	}
	
	@Test
	void testAddShouldReturnValue() {
		int actual = ob.add(5, 9);
		int expected = 14;
		assertEquals(expected, actual);
	}
	
	@Test
	void testSubShouldReturnPositiveValue() {
		int actual = ob.sub(5, 9);
		int expected = 4;
		assertEquals(expected, actual);
	}
	
	@Test
	void testSubShouldNotReturnNegativeValue() {
		int actual = ob.sub(15, 9);
		int expected = 6;
		assertEquals(expected, actual);
	}

	@Test
	void testSquareRootShouldReturnValue() throws Exception {
		double actual = ob.squareroot(20);
		double expected = 4.4;
		assertEquals(expected, actual, 0.5 );
	}
	@Test
	void testSquareRootShouldThrowException() throws Exception {
		assertThrows(Exception.class, ()-> ob.squareroot(-10));
	}

}
