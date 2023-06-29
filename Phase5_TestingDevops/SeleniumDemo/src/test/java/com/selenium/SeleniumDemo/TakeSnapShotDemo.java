package com.selenium.SeleniumDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TakeSnapShotDemo {
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
	public void testAlertClick() throws InterruptedException, IOException
	{
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/table/tbody/tr/td[4]/a[1]/img")).click();
		
		Thread.sleep(2000);
		takeSnapShot(driver, "snapshot.png");
		Thread.sleep(2000);
		
	}
	
	public void takeSnapShot(WebDriver driver, String filename) throws IOException
	{
		TakesScreenshot shot = (TakesScreenshot) driver;
		File srcfile = shot.getScreenshotAs(OutputType.FILE);
		File destfile = new File(filename);
		FileUtils.copyFile(srcfile, destfile);
	}
	
	

}
