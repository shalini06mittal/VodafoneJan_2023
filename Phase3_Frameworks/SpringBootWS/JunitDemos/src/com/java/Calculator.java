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
	public String encrypt(String message)
	{
		String encrypted = "";
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<message.length();i++)
		{
			char ch = message.charAt(i);
			encrypted += ch+2;
		}
		return encrypted;
	}
}
