package com.testng.demo.TestNGDemo.parameters;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

	   @DataProvider(name="SearchProvider")
       public static Object[][] getDataFromDataprovider(){
           return new Object[][] {
               { "demo", "India" },
               { "Krishna", "UK" },
               { "Bhupesh", "USA" }
           };
	   }
}
