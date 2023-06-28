package com.selenium.SeleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestMouseHoverAndOptions {

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
		 driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		 driver.manage().window().maximize();
		 
//		 JavascriptExecutor Scrool = (JavascriptExecutor) driver;
//			
//				Scrool.executeScript("window.scrollBy(0,"+1200+")", "");
//				Thread.sleep(4000);
//				
//			
//		 WebElement ele = driver.findElement(By.id("mousehover"));
//		 
		 Actions action = new Actions(driver);
//		 Action mouseOver = action.moveToElement(ele)
//				 .pause(Duration.ofSeconds(2))
//				 .keyDown(Keys.DOWN)
//				 .pause(Duration.ofSeconds(5))
//				 .click()
//				 .build();
//		 mouseOver.perform();
//		 
//		 
//		 Thread.sleep(2000);
		 
		 WebElement ele1 = driver.findElement(By.id("autocomplete"));
		 Action textAction = action.moveToElement(ele1)
				 .pause(Duration.ofSeconds(2))
//				 .sendKeys(Keys.ENTER)
//				 .pause(Duration.ofSeconds(5))
				 .keyDown(ele1,Keys.SHIFT)
				 .sendKeys(ele1,"Hello")
				 .pause(Duration.ofSeconds(2))
				 .keyUp(ele1,Keys.SHIFT)
				 .doubleClick()
				 .build();
		 textAction.perform();
		
		 Thread.sleep(2000);
		 
	  }
}
