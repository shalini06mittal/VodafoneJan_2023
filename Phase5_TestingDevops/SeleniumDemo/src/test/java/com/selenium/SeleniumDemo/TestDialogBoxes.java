package com.selenium.SeleniumDemo;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestDialogBoxes {

	WebDriver driver; 
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

	  @Test
	  public void testAlertClick() throws InterruptedException
	  {
		  driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		  
		  WebElement eleAlertButton = driver.findElement(
				  By.id("alertbtn"));
		  eleAlertButton.click();
		  Thread.sleep(2000);
		  
		  Alert alert = driver.switchTo().alert();
		  
		  assertEquals(alert.getText(), "Hello , share this practice page and share your knowledge");
		 
		  alert.dismiss();
		  Thread.sleep(2000);
		  driver.switchTo().parentFrame();
		  WebElement eleConfirmButton = driver.findElement(
				  By.id("confirmbtn"));
		  eleConfirmButton.click();
		   alert = driver.switchTo().alert();
		   Thread.sleep(2000);
		   alert.accept();
		   Thread.sleep(2000);
		  //
	  }
}
