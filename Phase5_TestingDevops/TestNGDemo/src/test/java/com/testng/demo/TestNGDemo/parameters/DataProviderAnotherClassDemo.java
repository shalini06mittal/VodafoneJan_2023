package com.testng.demo.TestNGDemo.parameters;

import org.testng.annotations.Test;


public class DataProviderAnotherClassDemo {	
	
	@Test(dataProvider = "provideData",dataProviderClass = DataProviderClass.class)
	public void FillLoginForm(String UserName, String Passcode) {
		System.out.println("Parameter for User Name passed as :- " + UserName);
		System.out.println("Parameter for Passcode passed as :- " + Passcode);
	}


}
