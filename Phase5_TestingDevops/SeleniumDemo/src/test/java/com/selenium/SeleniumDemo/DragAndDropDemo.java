package com.selenium.SeleniumDemo;

import static org.testng.Assert.assertNotNull;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDropDemo {

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
		 driver.get("file:///Users/Shalini/Desktop/Vodafone_Jan2023/Phase5_TestingDevops/SeleniumDemo/drag.html");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		 WebElement eleTarget = driver.findElement(By.id("dropBox"));
		 WebElement eleSource = driver.findElement(By.id("dragA"));
		 
//		 assertNull(ele);
		 
		 if(eleSource.isDisplayed() && eleTarget.isDisplayed()) {
			 Actions actions = new Actions(driver);
			 
			 actions.dragAndDrop(eleSource, eleTarget)
			 .pause(Duration.ofSeconds(2))
			 .build().perform();
		 }
		 Thread.sleep(2000);
		 WebElement ele =  eleTarget.findElement(By.id("dragA"));
		 System.out.println(ele.getTagName());
		 assertNotNull(ele);
				 
	  }
}
