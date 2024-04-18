package com.allianz.test;

import java.io.File;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.allianz.base.AutomationWrapper;

public class AddEmployeeTest extends AutomationWrapper{
	
	@DataProvider
	public Object[][] validData()
	{
		//creating object array, Which will allow the array to take both string or int or  Data types
		//In Array first[2] means Number of Test data E.g how many times it have to run , Second[3] means number of arguments we need to pass e.g -Saul ,saul123 etc
		Object[][] data = new Object[1][3];
		data[0][0] = "Admin";
		data[0][1] = "admin123";
		data[0][2] = "File type not allowed";

		return data;
		
	}

	@Test(dataProvider = "validData")
	public void uploadDisplayPicTest(String username, String passWord, String errroMsg)
	{
		File file = new File("src/test/resources/Files/dummy.pdf");
		String path =file.getAbsolutePath();
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(passWord);
		driver.findElement(By.xpath("//button[contains(normalize-space(),'Login')]")).click();
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(path);
		String actualError = driver.findElement(By.xpath("//span[contains(normalize-space(),'File type')]")).getText();
		Assert.assertTrue(actualError.contains(errroMsg));
	}
}
