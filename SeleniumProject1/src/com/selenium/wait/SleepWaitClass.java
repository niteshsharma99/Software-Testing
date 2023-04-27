package com.selenium.wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SleepWaitClass {
	
	@Test
	public void googleSearch() {
	
	System.setProperty("webdriver.edge.driver", "C:\\Users\\nkumarsharma\\eclipse-workspace\\SeleniumProject1\\Drivers\\msedgedriver.exe");    
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();

	driver.get("https://www.google.com");
	
	driver.findElement(By.xpath("//textarea[@type='search']")).sendKeys("selenium-webdriver");
	
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.cssSelector("[role='presentation']  li:nth-child(6)")).click();
	
	driver.quit();
	}
}
