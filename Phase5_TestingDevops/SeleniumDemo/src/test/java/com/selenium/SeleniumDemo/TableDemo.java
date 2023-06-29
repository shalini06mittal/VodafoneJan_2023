package com.selenium.SeleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TableDemo {


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
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		List rows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		System.out.println(rows.size());
		
		List cols = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		System.out.println(cols.size());
	}
}
