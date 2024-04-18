package com.allianz.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class AutomationWrapper {
	
	protected WebDriver driver;
	
	@BeforeTest
	public void browserOpen()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
	}
	
	//@AfterTest
	public void teardown()
	{
		driver.quit();
	}

}
