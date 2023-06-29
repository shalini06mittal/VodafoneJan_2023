package com.selenium.SeleniumDemo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavascriptASyncExecutorDemo {


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
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeAsyncScript("window.setTimeout(()=>alert('hello time up'), 2000);");
		 
		//Thread.sleep(2000);
	}
}
