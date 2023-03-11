package com.testing.dataprovider;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ITestContextExample2 {
	
    @DataProvider(name = "testData")
    public Object[][] testData(ITestContext context) {
        Object[][] data = null;
        String testName = context.getName();
        if (testName.equals("testMethod1")) {
            // Provide data for testMethod1
            data = new Object[][] { {"John", 25}, {"Mary", 30} };
        } else if (testName.equals("testMethod2")) {
            // Provide data for testMethod2
            data = new Object[][] { {"Tom", 40}, {"Anna", 35} };
        }
        return data;
    }

    @Test(dataProvider = "testData")
    public void testMethod(String name, int age, ITestContext context) {
        // Test method implementation   	
        System.out.println("Name: " + name + ", Age: " + age);
    }

}
