package com.testng.demo.TestNGDemo.anno;

import org.testng.annotations.Test;

public class MyTestClass1 extends SeleniumAbstractTest{

	@Test
	  public void myTestMethod1() {
	    System.out.println("myTestMethod1");
	  }

	  @Test
	  public void myTestMethod2() {
	    System.out.println("myTestMethod2");
	  }
}
