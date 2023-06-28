package com.selenium.SeleniumDemo;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

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

public class TestSwitchWindow {

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
		  driver.get("https://demo.guru99.com/popup.php");
		 driver.manage().window().maximize();
		 
		 WebElement ele = driver.findElement(By.linkText("Click Here"));
		 ele.click();
		 
		 String mainWindow = driver.getWindowHandle();
		 System.out.println(mainWindow);
		 
		 Set<String> windows = driver.getWindowHandles();
		 Iterator<String> iter = windows.iterator();
		 while(iter.hasNext())
		 {
			 String childWindow = iter.next();
			 System.out.println(childWindow);
			 
			 if(!mainWindow.equalsIgnoreCase(childWindow))
			 {
				 driver.switchTo().window(childWindow);
				 
				 WebElement label = driver.findElement(By.id("message9"));
				 System.out.println("label text "+label.getText());
				 assertTrue(label.getText().isBlank());
				
				 driver.findElement(By.name("btnLogin")).click();
				 System.out.println("label text "+label.getText());
				 assertFalse(label.getText().isBlank());
				 
				 driver.findElement(By.name("emailid")).sendKeys("dummy@gmail.com");
				 Thread.sleep(2000);
				 driver.findElement(By.name("btnLogin")).click();
				 Thread.sleep(2000);
				 driver.close();
			 }
		 }
		 driver.switchTo().window(mainWindow);
		   Thread.sleep(2000);
		  //
	  }
}
