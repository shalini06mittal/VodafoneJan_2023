package com.selenium.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println( "Hello World!" );
        // to set the driver for your project
        System.setProperty("webdriver.chrome.driver", "/Users/Shalini/Downloads/chromedriver_mac_arm64/chromedriver");  
        // open chrome=> create an instance of the Chrome driver
        WebDriver driver = new ChromeDriver(); 
        // get method specify the webpage to open
        driver.get("http://www.google.com/");    

        Thread.sleep(5000);  // Let the user actually see something!     
        // locate the web element
        WebElement searchBox = driver.findElement(By.name("q"));
        // sendkeys is used to send some text to the textarea
        searchBox.sendKeys("ChromeDriver");     

        // enter key
        searchBox.submit();    

        Thread.sleep(5000);  // Let the user actually see something!     
        // to close the browser opened by selenium
        driver.quit();  
    }
}
