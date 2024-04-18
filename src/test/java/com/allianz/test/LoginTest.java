package com.allianz.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.allianz.base.AutomationWrapper;

public class LoginTest extends AutomationWrapper {
	
	@Test
	public void validLogintest()
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[contains(normalize-space(),'Login')]")).click();
		String actualtext = driver.findElement(By.xpath("//h6[contains(normalize-space(),'Dash')]")).getText();
		Assert.assertEquals(actualtext, "Dashboard");
	}

}
