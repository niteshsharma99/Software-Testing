package com.selenium.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindElementClass {
	
	@Test
	public void findElementTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nkumarsharma\\eclipse-workspace\\SeleniumProject1\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://classic.freecrm.com");
		
		driver.findElement(By.className("form-control")).sendKeys("niteshkumar.sharma830@gmail.com");
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.className("form-control")).sendKeys("Test@12334");
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		driver.findElement(By.className("anshul")).sendKeys("Test");
		
		driver.quit();

	}

}
