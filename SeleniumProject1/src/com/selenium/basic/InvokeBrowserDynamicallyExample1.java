package com.selenium.basic;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InvokeBrowserDynamicallyExample1 {

	WebDriver driver = null;
	
	@BeforeTest
	public void geekforgeeks() throws IOException {
		// TODO Auto-generated method stub
		
		FileReader reader=new FileReader("C:\\Users\\nkumarsharma\\eclipse-workspace\\SeleniumProject1\\config.properties");
		Properties props=new Properties();
		props.load(reader);
		
		String browser = props.getProperty("browser");

		if(browser.equalsIgnoreCase("chrome")){
		//Open the URL with Selenium
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nkumarsharma\\eclipse-workspace\\SeleniumProject1\\Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		//Only for Windpws
		//System.setProperty("webdriver.chrome.driver", "c:\\test\\selenium.....\\chromedriver.exe")
		}else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\nkumarsharma\\eclipse-workspace\\SeleniumProject1\\Drivers\\geckodriver.exe");
			 driver = new FirefoxDriver();	
		}else{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\nkumarsharma\\eclipse-workspace\\SeleniumProject1\\Drivers\\msedgedriver.exe");    
			driver = new EdgeDriver();
	}
		
	}
	@AfterMethod
	public void quitBrowser(){
		driver.quit();
	}
	
	@Test
	public void verifyFaceBookHomePage() throws IOException{
		
		FileReader reader=new FileReader("C:\\Users\\nkumarsharma\\eclipse-workspace\\SeleniumProject1\\config.properties");
		Properties props=new Properties();
		props.load(reader);
		
		String url = props.getProperty("URL");
		
//		String URL = "https://www.facebook.com";
				
		driver.get(url);
	
		//Verify HomePage Title
		String pageTitle = driver.getTitle();
		System.out.println("We get the Title Like :" +pageTitle);
		Assert.assertEquals(pageTitle, "Facebook – log in or sign up");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
