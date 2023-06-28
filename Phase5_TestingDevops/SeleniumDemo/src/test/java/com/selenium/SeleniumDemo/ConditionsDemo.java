package com.selenium.SeleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionsDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/Shalini/Downloads/chromedriver_mac_arm64/chromedriver");
		WebDriver driver = new ChromeDriver();
	    
//		driver.get("http://techgatha.com/contact.html");     
//        driver.findElement(By.name("name")).sendKeys("selenium-name");
//        driver.findElement(By.name("email")).sendKeys("sel-name@gmail.com");
//        driver.findElement(By.name("comments")).sendKeys("sel-name comments");
		
//		driver.findElement(By.cssSelector("input[id*=l]")).sendKeys("C++ Tutorial");  
		
//        Thread.sleep(1000);
//        WebElement button = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
//       	button.click();
//    	Thread.sleep(1000);
//        System.out.println(button.isEnabled());	
		driver.get("https://www.oracle.com/java/technologies/downloads/");
		int scroll = 10;
		JavascriptExecutor Scrool = (JavascriptExecutor) driver;
		do{		
			Scrool.executeScript("window.scrollBy(0,"+scroll+")", "");
			scroll+=100;
			System.out.println(scroll);
			Thread.sleep(4000);
			
		}while(!driver.findElement(By.linkText("Java 8")).isDisplayed());
		System.out.println(driver.findElement(By.linkText("jdk-8u371-linux-x64.tar.gz")).isSelected());
		driver.close();
	}

}
