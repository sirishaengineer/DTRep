package com.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;
 
public class DTTest1 {
	public String baseUrl = "https://www.google.com/";
	public WebDriver driver;
 
  @BeforeTest
	 	 public void setBaseUrl() {
		 driver = new FirefoxDriver();
		 driver.get(baseUrl);
	 }
	  
  @Test 
  public void verifyPageTitle() {
 
	String expectedTitle = "Google";
    String actualTitle = driver.getTitle();
    Assert.assertEquals(actualTitle,expectedTitle);
  }
  
  @AfterTest
   public void endSession() {
 	  // Close the driver
       driver.close();
       
      // Runtime.getRuntime().exit(0);
   }
 
}

