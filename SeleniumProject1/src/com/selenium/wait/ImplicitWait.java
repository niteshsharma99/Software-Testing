package com.selenium.wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ImplicitWait {
	
	@Test
	public void googleSearch() {
	
	System.setProperty("webdriver.edge.driver", "C:\\Users\\nkumarsharma\\eclipse-workspace\\SeleniumProject1\\Drivers\\msedgedriver.exe");    
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();

	driver.get("https://www.google.com");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.findElement(By.xpath("//textarea[@type='search']")).sendKeys("selenium-webdriver");

//	XpATH
//	driver.findElement(By.xpath("//li[@role='presentation'][6]"));
	
	driver.findElement(By.cssSelector("[role='presentation']  li:nth-child(6)")).click();
	
	driver.quit();
	}

}
