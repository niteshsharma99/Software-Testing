package com.testing.maven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class MavenTestNGExample {
	
	@Test
	public void myTest() {
		System.out.println("I am in my Test method");
	}
	
	@BeforeClass
	public void myBeforeClass() {
		System.out.println("I am in my Before Class method");
	}
	
	@AfterClass
	public void myAfterClass() {
		System.out.println("I am in my After Class method");
	}

}
