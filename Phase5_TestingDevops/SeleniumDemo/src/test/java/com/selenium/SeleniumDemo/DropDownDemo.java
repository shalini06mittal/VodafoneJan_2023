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

public class DropDownDemo {

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
	  public void testDropDown() throws InterruptedException
	  {
		  driver.get("http://only-testing-blog.blogspot.com/2013/09/test.html");
		  Select selectCars = new Select(driver.findElement(By.xpath("//*[@id=\"post-body-6522850981930750493\"]/div[1]/select")));
		  System.out.println(selectCars.isMultiple());
		  List<WebElement> options =  selectCars.getAllSelectedOptions();
		  for(WebElement ele:options)
			  System.out.println(ele.getText());
		  
		  selectCars.selectByIndex(1);
		  Thread.sleep(3000);
		  Select selectCountries = new Select(driver.findElement(By.name("FromLB")));
		  System.out.println(selectCountries.isMultiple());
		  selectCountries.selectByValue("IND");
		  selectCountries.selectByValue("ITA");
		  Thread.sleep(3000);
		  WebElement eleMoveRt = driver.findElement(By.xpath("//*[@id=\"post-body-6522850981930750493\"]/div[1]/form[2]/table/tbody/tr/td[2]/input[1]"));
		  eleMoveRt.click();
		  Thread.sleep(3000);
		  
		  Select selectedCountries = new Select(driver.findElement(By.name("ToLB")));
		  AssertJUnit.assertEquals(selectedCountries.getOptions().size(), 2); 
	  }
}
