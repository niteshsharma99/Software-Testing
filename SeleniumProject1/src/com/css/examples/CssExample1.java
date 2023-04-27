package com.css.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssExample1 {

	public static void main(String[] args) {
		
		/*
		 **** Creating CSS Selector Using Attributes ****
		 * 	Syntax: TagName[Att1=Value]
		 * 	In case Att1 is 'id' or 'class' then we can use following symbols:
		 * 		id => # (hash)
		 * 		class => . (dot)
		 * 	Examples: 1. div#u123   2. span.layerParent
		 */
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nkumarsharma\\eclipse-workspace\\SeleniumProject1\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
//		Example: .hm-icon.nav-sprite  i.hm-icon.nav-sprite
		driver.findElement(By.cssSelector("i.hm-icon")).click();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//div[starts-with(text(),'Echo & Alexa')]")).click();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.partialLinkText("All-new Echo Dot (4t")).click();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		String title = driver.findElement(By.cssSelector("span#productTitle")).getText();
		
		System.out.println(title);
		
		if (title.contains("Echo Dot")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		driver.quit();
	}

	}

