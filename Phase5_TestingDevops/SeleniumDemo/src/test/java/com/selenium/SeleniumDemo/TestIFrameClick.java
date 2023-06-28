package com.selenium.SeleniumDemo;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestIFrameClick {

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
	  public void testImageClick() throws InterruptedException
	  {
		  driver.get("https://docs.oracle.com/javase/7/docs/api/");
		  
		  driver.switchTo().frame("classFrame");
		  WebElement eleImageLink = driver.findElement(
				  By.linkText("Deprecated"));
		  eleImageLink.click();
		  Thread.sleep(3000);
		  
		  WebElement ele = driver.findElement(By.xpath("/html/body/div[3]/h1"));
		  assertEquals(ele.getText(), "Deprecated API");
		 
	  }
}
