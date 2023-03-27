package dataprovider;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample1 {
	
	@Test (dataProvider = "SecondDataSet")
	public void testAddition(int actual, int expected){
		int actualValue = actual + 20;
		Assert.assertEquals(actualValue, expected);
		}
	
	@DataProvider (name = "FirstDataSet")
	public Object[][] getData1()
	{
		return new Object[][]
				{
					{100, 120},
					{200, 220},
					{250, 270},
					{400, 420},
					{500, 520}
				};
	}
	
	@DataProvider (name = "SecondDataSet")
	public Object[][] getData2()
	{
		return new Object[][]
				{
			{10, 30},
			{20, 40}
				};
	}
}
