package com.xpath.examples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathExample1 {

	public static void main(String[] args) {
		
		/*
		 * 1. What is XPath? 
		 * 	 
		 * 	  A query language which is used to find a node or set of nodes in XML/HTML document
		 * 
		 * 2. Relative XPath Using Node Attributes
		 *     
		 *    Syntax: //TagName[@Attribute Name="Attribute Value"]
		 *    
		 */

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nkumarsharma\\eclipse-workspace\\SeleniumProject1\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com");
//		driver.get("https://www.facebook.com/r.php");
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();		
			
		try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
					
		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("Nitesh");
//		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Nitesh");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("Sharma");
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("niteshkumar.sharma830@gmail.com");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//input[@aria-label='Re-enter email address']")).sendKeys("niteshkumar.sharma830@gmail.com");
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("12345678");
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//select[@id='day']")).sendKeys("5");
		
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Apr");
		
		driver.findElement(By.xpath("//select[@id='year']")).sendKeys("1999");
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.quit();
	}
}
