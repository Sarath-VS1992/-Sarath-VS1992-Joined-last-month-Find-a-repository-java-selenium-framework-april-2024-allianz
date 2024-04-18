package com.allianz.utils;

import org.testng.annotations.DataProvider;

public class DataUtils {
	@DataProvider
	public Object[][] invalidData()
	{
		//creating object array, Which will allow the array to take both string or int or  Data types
		//In Array first[2] means Number of Test data E.g how many times it have to run , Second[3] means number of arguments we need to pass e.g -Saul ,saul123 etc
		Object[][] data = new Object[2][3];
		data[0][0] = "saul";
		data[0][1] = "saul123";
		data[0][2] = "Invalid credentials";

		data[1][0] = "peter";
		data[1][1] = "peter123";
		data[1][2] = "Invalid credentials";

		return data;
		
	}

}
