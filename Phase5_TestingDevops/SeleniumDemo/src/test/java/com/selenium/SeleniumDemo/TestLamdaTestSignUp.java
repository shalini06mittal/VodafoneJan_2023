package com.selenium.SeleniumDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TestLamdaTestSignUp {
	WebDriver driver; 
  @Test
  public void testClickOnSignUpLink() throws InterruptedException {
	  
	  WebElement eleSignUp = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/div[2]/div/div/div[2]/a[2]"));
	  eleSignUp.click();
	  Thread.sleep(3000); 
	  String title = driver.getTitle();
	  AssertJUnit.assertEquals(title, "Sign up for free | Cross Browser Testing Tool | LambdaTest");
	  
  }
  @Test
  public void testSignUpPageFillForm() throws InterruptedException {
	  
	  WebElement eleSignUp = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/div[2]/div/div/div[2]/a[2]"));
	  eleSignUp.click();
	  Thread.sleep(3000); 
	  WebElement eleName = driver.findElement(By.id("name"));
	  eleName.sendKeys("Testing");
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	   driver = new ChromeDriver(); 
	   driver.get("https://www.lambdatest.com/");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit(); // will close all the windows opened by selenium
	 // driver.close();// will only close the current window
  }

  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "/Users/Shalini/Downloads/chromedriver_mac_arm64/chromedriver");
  }

 

}
