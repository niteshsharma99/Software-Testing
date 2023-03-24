package com.testng.dataprovider2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	
	@Test(dataProvider="dataSet2")
	public void test(String username, String password)
	{
		System.out.println(username+"======"+password);
	}
	
	@Test(dataProvider="create")
	public void test1(String username, String password, String browser)
	{
		System.out.println(username+"======"+password+"==="+browser);
	}
	
	@DataProvider(name= "create")
	public Object[][] dataSet1()
	{
		return new Object[][]
				{
			{"username","password","browser1"},
			{"username1","password1","browser2"},
			{"username2","password2","browser3"},
			{"username3","password3","browser4"},
				};
	}
	
	@DataProvider
	public Object[][] dataSet2()
	{
		Object[][] dataset = new Object[4][2];
		
		//first row
		dataset[0][0]="user1";
		dataset[0][1]="pass1";
		
		//second row
		dataset[1][0]="user2";
		dataset[1][1]="pass2";
		
		//third row
		dataset[2][0]="user3";
		dataset[2][1]="pass3";
		
		//forth row
		dataset[3][0]="user4";
		dataset[3][1]="pass4";
		
		return dataset;
	}
}
