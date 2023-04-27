package com.selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvokeOtherBrowsers {
	
	@Test
	public void verifyFaceBookHomePage(){
		
		String URL = "https://www.facebook.com";
		
		//Open the URL with Selenium
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nkumarsharma\\eclipse-workspace\\SeleniumProject1\\Drivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		//FireFox Browser Invoke
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\nkumarsharma\\eclipse-workspace\\SeleniumProject1\\Drivers\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		
		
		
      System.setProperty("webdriver.edge.driver", "C:\\Users\\nkumarsharma\\eclipse-workspace\\SeleniumProject1\\Drivers\\msedgedriver.exe");    
      WebDriver driver3 = new EdgeDriver();
		
		//To maximize the Browser
		driver.manage().window().maximize();
				
		driver.get(URL);
		
		//Verify HomePage Tiitle
		String pageTitle = driver.getTitle();
		System.out.println("We get the Title Like :" +pageTitle);
		
		Assert.assertEquals(pageTitle, "Facebook – log in or sign up");
		
		//To Close the Browser
		driver.quit();
		
	}
}
