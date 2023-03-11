package com.testing.dataprovider;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ITestContextExample {

	  @Test(dataProvider = "dataProvider")
	  public void testMethod(String data, ITestContext context) {
	    String suiteName = context.getSuite().getName();
	    String testName = context.getCurrentXmlTest().getName();

	    System.out.println("Test data: " + data);
	    System.out.println("Suite name: " + suiteName);
	    System.out.println("Test name: " + testName);
	  }

	  @DataProvider(name = "dataProvider")
	  public Object[][] provideData(ITestContext context) {
	    String data = "test data";
	    return new Object[][]{{data, context}};
	  }
}
