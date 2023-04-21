package com.selenium.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class XpathClass {
	
	@Test
	public void absoluteXpath() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nkumarsharma\\eclipse-workspace\\SeleniumProject1\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.rediff.com/");

		driver.findElement(By.linkText("Sign in")).click();
		


		//Relative Path to Locate the Username
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("niteshkumar.sharma830@gmail.com");

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		Absolute Path
//		driver.findElement(By.xpath("/html/body/div/div/div/div/a")).click();
		
		//Relative Path
		driver.findElement(By.xpath("//div/a")).click();
		

		Assert.assertEquals(driver.getTitle(),
				"Rediff.com: News | Rediffmail | Stock Quotes | Shopping");

		driver.quit();
	}

}
