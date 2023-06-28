package com.selenium.SeleniumDemo;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFileUpload {

	WebDriver driver; 
	@BeforeMethod
	  public void beforeMethod() {
		   driver = new ChromeDriver(); 
	  }

	  @AfterMethod
	  public void afterMethod() {
		  driver.quit(); // will close all the windows opened by selenium
		  //driver.close();// will only close the current window
	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.setProperty("webdriver.chrome.driver", "/Users/Shalini/Downloads/chromedriver_mac_arm64/chromedriver");
	  }

	  @Test
	  public void testAlertClick() throws InterruptedException
	  {
		 driver.get("https://the-internet.herokuapp.com/upload");
		 driver.manage().window().maximize();
		 WebElement ele = driver.findElement(By.id("file-upload"));
		 ele.sendKeys("/Users/Shalini/Desktop/sign.png");
		 Thread.sleep(2000);
		 
	  }
}
