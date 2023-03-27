package listeners;

import static org.testng.Assert.assertTrue;

import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ITestListenersTestCases {
	
	private int i;

	@BeforeTest
	public void beforeTest() {
		System.out.println("In beforeTest");
	}
	
	//passing test
	@Test
	public void myTest1() {
		System.out.println("In myTest1 method");
	}
	
	//failing test
	@Test
	public void myTest2() {
		System.out.println("In myTest2 method");
		assertTrue(false);
	}
	
	//skipping test
	@Test
	public void myTest3() {
		throw new SkipException("myTest2 is skipped");
	}
	
	//onTestFailedButWithinSuccessPercentage test
	@Test(successPercentage=60, invocationCount=5)
	public void myTest4() {
		i++;
		System.out.println("myTest4 method, invocation count is :" +i);
		if(i==1|i==2) {
			System.out.println("fail myTest4");
			assertTrue(false);
		}else {
			System.out.println("pass myTest4");
			assertTrue(true); 
		}
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("In afterTest");
	}
}
