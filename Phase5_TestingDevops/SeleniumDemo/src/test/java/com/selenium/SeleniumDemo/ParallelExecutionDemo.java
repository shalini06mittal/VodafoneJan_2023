package com.selenium.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelExecutionDemo {

	WebDriver driver; 
//	@BeforeMethod
//	public void beforeMethod() {
//		System.out.println("before");
//		driver = new ChromeDriver(); 
//	}
//
//	@AfterMethod
//	public void afterMethod() {
//		driver.quit(); // will close all the windows opened by selenium
//		//driver.close();// will only close the current window
//	}

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "/Users/Shalini/Downloads/chromedriver_mac_arm64/chromedriver");
	}
	@Test    
	public void executSessionOne(){
		System.out.println("test one");
		//First session of WebDriver
		//Goto guru99 site
		driver = new ChromeDriver(); 
		driver.get("http://demo.guru99.com/V4/");
		//find user name text box and fill it
		driver.findElement(By.name("uid")).sendKeys("Driver 1");   
	}       
	@Test    

	public void executeSessionTwo(){
		System.out.println("test 2");
		//Second session of WebDriver
		//Goto guru99 site
		driver = new ChromeDriver(); 
		driver.get("http://demo.guru99.com/V4/");
		//find user name text box and fill it
		driver.findElement(By.name("uid")).sendKeys("Driver 2");
	}
	@Test    
	public void executSessionThree(){
		System.out.println("test 3");
		//Third session of WebDriver
		//Goto guru99 site
		driver = new ChromeDriver(); 
		driver.get("http://demo.guru99.com/V4/");
		//find user name text box and fill it
		driver.findElement(By.name("uid")).sendKeys("Driver 3");

	}      

}
