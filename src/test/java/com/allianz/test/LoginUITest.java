package com.allianz.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.allianz.base.AutomationWrapper;

public class LoginUITest extends AutomationWrapper {

	@Test
	public void textPrintingTest()

	{
		
		String actualtextVersion = driver.findElement(By.xpath("//p[contains(normalize-space(),'OS')]")).getText();
		System.out.println(actualtextVersion);
	}

	@Test
	public void footerOfTheSite() {
		
		String actualfootertextVersion = driver.findElement(By.xpath("//p[contains(normalize-space(),'HRM OS')]"))
				.getText();
		System.out.println(actualfootertextVersion);
	}

}
