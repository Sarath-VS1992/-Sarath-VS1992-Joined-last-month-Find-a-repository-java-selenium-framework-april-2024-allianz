package com.allianz.test;

import org.testng.annotations.Test;

public class LoginUITest {

	@Test (invocationCount = 3)
	public void titleTest()
	
	{
		System.out.println("Test run successfuly");
	}
	
	@Test
	public void discriptionOfTheSite()
	{
		System.out.println("Running to get discription of the Website");
	}

}
