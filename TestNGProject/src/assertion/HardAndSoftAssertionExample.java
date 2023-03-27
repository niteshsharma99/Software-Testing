package assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAndSoftAssertionExample {
	
	 @Test
	  public void hardAssertionExample() {
	    int expected = 10;
	    int actual = 5 + 3;
	    Assert.assertEquals(actual, expected); // this is a hard assertion
	    System.out.println("This line won't execute if the assertion fails");
	  }
	  
	  @Test
	  public void softAssertionExample() {
	    SoftAssert softAssert = new SoftAssert();
	    int expected1 = 10;
	    int actual1 = 5 + 3;
	    softAssert.assertEquals(actual1, expected1); // this is a soft assertion
	    System.out.println("This line will execute even if the assertion fails");
	    
	    int expected2 = 7;
	    int actual2 = 2 + 5;
	    softAssert.assertEquals(actual2, expected2); // this is also a soft assertion
	    System.out.println("This line will execute even if the assertion fails");
	    
	    softAssert.assertAll(); // this will report all the failures together
	  }
}
