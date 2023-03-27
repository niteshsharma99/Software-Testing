package com.package1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoClass1 {
	
	@Test
    public void testAdd() {
        int a = 2;
        int b = 3;
        int result = a + b;
        Assert.assertEquals(result, 5);
    }
 
    @Test
    public void testSubtract() {
        int a = 5;
        int b = 3;
        int result = a - b;
        Assert.assertEquals(result, 2);
    }

}
