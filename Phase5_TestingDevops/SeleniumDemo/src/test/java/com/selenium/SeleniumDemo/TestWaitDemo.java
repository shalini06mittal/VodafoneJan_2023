package com.selenium.SeleniumDemo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestWaitDemo {

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
		 driver.get("file:///Users/Shalini/Desktop/Vodafone_Jan2023/Phase5_TestingDevops/SeleniumDemo/index.html");
		 driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 // explicit wait
		 WebElement elePara = new WebDriverWait(driver, Duration.ofSeconds(10))
			 .until(ExpectedConditions.visibilityOfElementLocated(By.id("p1")));
		 //WebElement ele = driver.findElement(By.id("p1"));
		
		 elePara.click();

		// ele.click();
		 Thread.sleep(2000);
		  //
	  }
}
