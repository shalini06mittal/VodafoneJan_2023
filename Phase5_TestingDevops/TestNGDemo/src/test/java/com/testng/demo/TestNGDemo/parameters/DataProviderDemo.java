package com.testng.demo.TestNGDemo.parameters;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviderDemo {	
	@DataProvider
	public Object[][] provideData()
	{
		return new Object[][]
				{
			{"u1","p1"},
			{"u2","p2"},
			{"u3","p3"},
			{"u4","p4"},
				};
	}
	@Test(dataProvider = "provideData")
	public void FillLoginForm(String UserName, String Passcode) {
		System.out.println("Parameter for User Name passed as :- " + UserName);
		System.out.println("Parameter for Passcode passed as :- " + Passcode);
	}

}
