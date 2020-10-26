package com.ustg.amazon.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class initialSetUp {
	
	static WebDriver driver;
	
  
  @BeforeSuite
  public void beforeSuite() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\SELENIUM UDEMY\\Chrome Driver//chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.Amazon.in");
  }

  @AfterSuite
  public void afterSuite() {
	  //driver.quit();
  }

}
