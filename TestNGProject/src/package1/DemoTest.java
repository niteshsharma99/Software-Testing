package package1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTest {
	
	@Test
   public void test()
   {
	System.out.println("Hello");
   }
	
	@BeforeTest
	   public void test1()
	   {
		System.out.println("World");
	   }
	
	@AfterTest
	   public void test2()
	   {
		System.out.println("AfterTest");
	   }
}
