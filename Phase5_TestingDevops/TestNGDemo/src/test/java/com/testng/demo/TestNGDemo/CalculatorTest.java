package com.testng.demo.TestNGDemo;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class CalculatorTest {
	 Calculator ob;
	 int expected1;
  @Test(priority = 1)
  public void testAddReturnPositiveValue() {
	  int actual = ob.add(3, 3);
	  assertEquals(actual, expected1);
  }
  @Test(priority = 0, enabled = false)
  public void testAddReturnNegativeValue() {
	  expected1 = -6;
	  int actual = ob.add(-2, -4);
	  assertEquals(actual, expected1);
  }
  @Test(priority = 2)
  public void testSquareRootReturnPositiveValue() throws Exception {
	  double expected = 4.0;
	  double actual = ob.squareRoot(20);
	  System.out.println(actual);
	  assertEquals(actual, expected, 0.50);
  }
  @BeforeMethod
  public void beforeMethod() {
	 expected1 = 6;
  }

  @AfterMethod
  public void afterMethod() {
	
  }

  @BeforeClass
  public void beforeClass() {
	  ob = new Calculator();
  }

  @AfterClass
  public void afterClass() {
	  ob = null;
  }

}
