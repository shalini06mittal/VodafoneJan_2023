package com.selenium.SeleniumDemo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavascriptSyncExecutorDemo {


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
		driver.get("https://moneyboats.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		Dimension dim = driver.manage().window().getSize();
		System.out.println(dim.getHeight());
		System.out.println(dim.getWidth());

		int scroll = 100;
		do {
			js.executeScript("window.scrollBy(0,"+scroll+")");
			scroll+=100;
			Thread.sleep(1000);
		}while(scroll<dim.getHeight());
	}
}
