package com.testng.demo.TestNGDemo;

public class Calculator {

	public int add(int x, int y)
	{
		return x+y;
	}
	
	public double squareRoot(int num) throws Exception
	{
		if(num <= 0)
			throw new Exception("Number should be positive");
		return Math.sqrt(num);
	}
}
