package com.selenium.SeleniumDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class BasicDriverCommands {
	WebDriver driver; 
  @Test
  public void testDriverCommands() {
	  
	  driver.get("http://www.google.com/");
	  System.out.println(driver.getCurrentUrl());
	 // System.out.println(driver.getPageSource());
	  System.out.println(driver.getTitle());
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	   driver = new ChromeDriver(); 
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "/Users/Shalini/Downloads/chromedriver_mac_arm64/chromedriver");
  }

 

}
