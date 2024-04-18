package com.allianz.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.allianz.base.AutomationWrapper;
import com.allianz.utils.DataUtils;

public class DataProviderTest extends AutomationWrapper{
	
	
	
	@Test (dataProvider = "invalidData", dataProviderClass = DataUtils.class)
	public void invalidLogintest(String username, String password, String expectedError)
	{
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[contains(normalize-space(),'Login')]")).click();
		String actualError = driver.findElement(By.xpath("//p[text() ='Invalid credentials']")).getText();
		System.out.println(actualError);
		org.testng.Assert.assertEquals(actualError, expectedError);
		
	}

}