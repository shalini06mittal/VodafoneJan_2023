package com.java;

public class Calculator {

	public int add(int x, int y)
	{
		return x+y;
	}
	public int sub(int x, int y)
	{
		if(x > y )
			return x-y;
		return y-x;
	}

	public double squareroot(double data) throws Exception
	{
		if(data <=0)
			throw new Exception("data cannot be negative");
		return Math.sqrt(data);
	}
}
