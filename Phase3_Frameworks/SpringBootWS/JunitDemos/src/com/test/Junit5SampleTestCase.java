package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// actual value and expected value
public class Junit5SampleTestCase {

	// a directory to be created only once
	@BeforeAll
	public static void beforeAll()
	{
		System.out.println("BEFORE ALL");
	}
	
	// delete directory only once
	@AfterAll
	public static void afterAll()
	{
		System.out.println("AFTER ALL");
	}
	
	@BeforeEach
	public void setUp()
	{
		// file to be created 
		System.out.println("BEFORE EACH");
	}
	@AfterEach
	public void tearDown()
	{
		// destroying the file
		System.out.println("AFTER EACH");
	}
	
	// testing that i can write data in the file
	@Test
	public void test1()
	{
		System.out.println("TEST 1 ");
		double actual1 = Math.sqrt(16.0);
		double expected1 = 4.1;
		assertEquals(expected1, actual1, 0.10);
	}
	// can read data from the file
	@Test
	public void test2()
	{
		System.out.println("TEST 2 ");
	}
	@Test
	public void test3()
	{
		System.out.println("TEST 3 ");
	}
	
}
