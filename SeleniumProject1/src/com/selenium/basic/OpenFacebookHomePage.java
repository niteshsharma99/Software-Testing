package com.selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenFacebookHomePage {
	
	
	@Test
	public void verifyFaceBookHomePage(){
		
		String URL = "https://www.facebook.com";
		
		//Open the URL with Selenium
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nkumarsharma\\eclipse-workspace\\SeleniumProject1\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\nkumarsharma\\eclipse-workspace\\SeleniumProject1\\Drivers\\geckodriver.exe");
		
//		WebDriver driver = new FirefoxDriver();
		
		//To maximize the Browser
		driver.manage().window().maximize();
				
		driver.get(URL);
		
		//To maximize the Browser
		driver.manage().window().maximize();
		
		//Verify HomePage Tiitle
		String pageTitle = driver.getTitle();
		System.out.println("We get the Title Like :" +pageTitle);
		
		Assert.assertEquals(pageTitle, "Facebook – log in or sign up");
		
		//To Close the Browser
		driver.close();
		
	}

}
