package com.test.testng.demo;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class TestNGDemo {
    public String baseUrl = "http://www.google.com/xhtml";
    String driverPath = "chromedriver.exe";
    public WebDriver driver ; 
     
  @Test
  public void verifyHomepageTitle() throws InterruptedException {
       
      System.out.println("launching chrome browser"); 
     // System.setProperty("webdriver.firefox.marionette", driverPath);
      
      System.setProperty("webdriver.chrome.driver", driverPath);
      
      WebDriver driver = new ChromeDriver();
      driver.get(baseUrl);
      Thread.sleep(3000);  // Let the user actually see something!
      WebElement searchBox = driver.findElement(By.name("q"));
      searchBox.sendKeys("ChromeDriver");
      searchBox.submit();
      Thread.sleep(5000);  // Let the user actually see something!
      driver.quit();
  }
}