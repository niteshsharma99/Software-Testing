package com.testing.Itestlistener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerExample implements ITestListener {
	
	 // This method will be called when a test case starts
    public void onTestStart(ITestResult result) {
        System.out.println("Test case " + result.getName() + " started");
    }

    // This method will be called when a test case finishes successfully
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test case " + result.getName() + " passed");
    }

    // This method will be called when a test case fails
    public void onTestFailure(ITestResult result) {
        System.out.println("Test case " + result.getName() + " failed");
    }

    // This method will be called when a test case is skipped
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test case " + result.getName() + " skipped");
    }

    // This method will be called when a test case fails due to a timeout
//   public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//      System.out.println("Test case " + result.getName() + " failed due to timeout");
//    }
    
    // This method will be called when a test suite starts
    public void onStart(ITestContext context) {
        System.out.println("Test suite " + context.getName() + " started");
    }

    // This method will be called when a test suite finishes
    public void onFinish(ITestContext context) {
        System.out.println("Test suite " + context.getName() + " finished");
    }
	
}
