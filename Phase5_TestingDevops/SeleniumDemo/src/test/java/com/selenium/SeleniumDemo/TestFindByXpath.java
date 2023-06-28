package com.selenium.SeleniumDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TestFindByXpath {
	WebDriver driver; 
  @Test
  public void testDriverCommands() throws InterruptedException {
	  
	  driver.get("http://only-testing-blog.blogspot.com/2013/09/test.html");
	  System.out.println(driver.getCurrentUrl());
	 // System.out.println(driver.getPageSource());
	  
//	  WebElement eleFname = driver.findElement(By.id("fname"));
//	  eleFname.sendKeys("Shalini");
//	  Thread.sleep(2000);
//	  WebElement eleLname = driver.findElement(By.name("lname"));
//	  System.out.println(eleLname.isEnabled());
//	  if(eleLname.isEnabled())
//		  eleLname.sendKeys("Mittal");
//	  Thread.sleep(2000);
//	  List<WebElement> checkbox = driver.findElements(By.name("vehicle"));
//	  for(WebElement ele : checkbox) {
//		  String text = ele.getAttribute("value");
//		  System.out.println(ele.getText());
//		  System.out.println(text);
//		  if(text.equals("Car"))
//			  ele.click();
//	  }
//	  Thread.sleep(4000);
//	  WebElement maleEle = driver.findElement(By.cssSelector("input[value='male']"));
//	  maleEle.click();
//	  Thread.sleep(4000);
//	  WebElement linkEle = driver.findElement(By.partialLinkText("Newer"));
//	  linkEle.click();
	  
	  WebElement eleCarsSelect = driver.findElement(By.xpath("//*[@id=\"post-body-6522850981930750493\"]/div[1]/select"));
	  System.out.println(eleCarsSelect.getTagName());
	  List<WebElement> eleCarsOption = eleCarsSelect.findElements(By.tagName("option"));
	  
	  for(WebElement ele : eleCarsOption)
	  {
		  System.out.println("name "+ele.getText());
	  }
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
