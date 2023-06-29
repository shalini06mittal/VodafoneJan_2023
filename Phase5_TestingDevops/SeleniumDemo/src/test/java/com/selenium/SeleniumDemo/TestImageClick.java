package com.selenium.SeleniumDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
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

public class TestImageClick {

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
		  driver.get("https://magento.softwaretestingboard.com/");
		  
		  WebElement eleImageLink = driver.findElement(
				  By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/div/a[2]"));
		  eleImageLink.click();
		  Thread.sleep(3000);
		  
		  WebElement ele = driver.findElement(By.id("page-title-heading"));
		  AssertJUnit.assertEquals(ele.getText(), "Tees");
		  WebElement ele1 = driver.findElement(By.id("toolbar-amount"));
		  AssertJUnit.assertEquals(ele1.getText(), "12 Items");
		  
	  }
}
