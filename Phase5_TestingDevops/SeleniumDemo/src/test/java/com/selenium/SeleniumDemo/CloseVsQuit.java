package com.selenium.SeleniumDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class CloseVsQuit {
	WebDriver driver; 
  @Test
  public void testDriverCommands() throws InterruptedException {
	  
	  driver.get("https://only-testing-blog.blogspot.com/");
	  System.out.println(driver.getCurrentUrl());
	 // System.out.println(driver.getPageSource());
	  System.out.println(driver.getTitle());
	  driver.findElement(By.linkText("Visit MyTest Page")).click();
	  Thread.sleep(3000);
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	   driver = new ChromeDriver(); 
  }

  @AfterMethod
  public void afterMethod() {
	  //driver.quit(); // will close all the windows opened by selenium
	  driver.close();// will only close the current window
  }

  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "/Users/Shalini/Downloads/chromedriver_mac_arm64/chromedriver");
  }

 

}
