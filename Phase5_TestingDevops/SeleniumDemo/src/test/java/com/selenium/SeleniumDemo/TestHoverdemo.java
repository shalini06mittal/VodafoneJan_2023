package com.selenium.SeleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHoverdemo {

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
		 driver.get("https://techgatha.com/");
		 driver.manage().window().maximize();
		 
		 WebElement ele = driver.findElement(By.linkText("KIDS SECTION"));
		 String bgcolor = ele.getCssValue("background-color");
		 System.out.println(bgcolor);
		 
		 Actions action = new Actions(driver);
		 Action mouseOver = action.moveToElement(ele)
				 .pause(Duration.ofSeconds(2))
				 .build();
		 mouseOver.perform();
		 bgcolor = ele.getCssValue("background-color");
		 System.out.println(bgcolor);
		 
		
		 Thread.sleep(2000);
		 
	  }
}
