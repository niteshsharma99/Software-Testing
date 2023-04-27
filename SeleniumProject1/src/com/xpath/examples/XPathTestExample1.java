package com.xpath.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class XPathTestExample1 {
	
	@Test
	public void testFacebookSign() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nkumarsharma\\eclipse-workspace\\SeleniumProject1\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Open the FaceBook.com
		driver.get("https://www.facebook.com");

		// Verify Page Tittle
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle,
				"Facebook – log in or sign up");
		
//		Create New Account
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();		
		
		try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
//		Enter First Name		
		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("Nitesh");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		Enter SurName/LastName
		driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("Sharma");
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		Enter Mobile Number or Email Address
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("niteshkumar.sharma830@gmail.com");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		Verify Email Address
		driver.findElement(By.xpath("//input[@aria-label='Re-enter email address']")).sendKeys("niteshkumar.sharma830@gmail.com");
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		Enter Password
		driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("12345678");
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		Enter DOB
		driver.findElement(By.xpath("//select[@id='day']")).sendKeys("5");
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Apr");	
		driver.findElement(By.xpath("//select[@id='year']")).sendKeys("1999");
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		Select the Gender
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		Submit the details
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		// Verify the Profile Title
//		Assert.assertEquals(driver.getTitle(), "Welcome to Facebook");
		
		driver.quit();
	}

}
