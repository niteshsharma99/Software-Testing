package com.selenium.wait;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWait {
	
	@Test
	public void emailvarification(){
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\nkumarsharma\\eclipse-workspace\\SeleniumProject1\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://gmail.com");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

// saving the GUI element reference into a "element" variable of WebElement type
	WebElement element = driver.findElement(By.xpath("//input[@type='email']"));
	
	element.sendKeys("niteshkumar.sharma830@gmail.com");
	element.sendKeys(Keys.RETURN);
	
//	entering password
	driver.findElement(By.id("Passwd")).sendKeys("password");
	
	// clicking signin button
	driver.findElement(By.id("signIn")).click();
	
	// explicit wait - to wait for the compose button to be click-able
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
	
	// click on the compose button as soon as the "compose" button is visible
	driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();

	driver.quit();
	}
	
}

