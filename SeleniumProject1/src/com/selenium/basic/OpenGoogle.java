package com.selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenGoogle {
	
	@Test
	public void verifyGoogleHomePage(){
		
		String URL = "https://www.google.com";
		
		//Open the URL with Selenium
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nkumarsharma\\eclipse-workspace\\SeleniumProject1\\Drivers\\chromedriver.exe");
//			
//		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\nkumarsharma\\eclipse-workspace\\SeleniumProject1\\Drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
//        System.setProperty("webdriver.edge.driver", "C:\\Users\\nkumarsharma\\eclipse-workspace\\SeleniumProject1\\Drivers\\msedgedriver.exe");
//        
//        WebDriver driver = new EdgeDriver();
		
		//To maximize the Browser
		driver.manage().window().maximize();
				
		driver.get(URL);
		
		//To maximize the Browser
		driver.manage().window().maximize();
		
		//Verify HomePage Title
		String pageTitle = driver.getTitle();
		System.out.println("We get the Title Like :" +pageTitle);
		
		Assert.assertEquals(pageTitle, "Google");
		
		//To Close the Browser
		driver.close();
		
	}

}
