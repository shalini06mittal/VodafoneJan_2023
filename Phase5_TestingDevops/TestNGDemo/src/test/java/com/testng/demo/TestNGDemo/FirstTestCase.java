package com.testng.demo.TestNGDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestCase {
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("before test");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class");
	}
	@Test
	public void test1()
	{
		System.out.println("Test 1");
	}
	@Test
	public void test2()
	{
		System.out.println("Test 2");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("after test");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class");
	}

}
