package com.neotech.testcases;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {

	@Test
	public void test1()
	{
		String expected = "Ferhat";
		String actual = "Burak";
		
		Assert.assertEquals(actual, expected);
		
		//if this test fails, whatever comes after this will not execute
		System.out.println("hi There");
		
	}
	
	@Test
	public void test2()
	{
		int expected = 15; 
		int actual = 5; 
		
		Assert.assertEquals(actual, expected, "Numbers did NOT match!");
		
	}
	
	@Test
	public void test3()
	{
		//when we log in to the dashboard we expect this menu:
		ArrayList<String> expectedList = new ArrayList<>();
		
		expectedList.add("Admin");
		expectedList.add("PIM");
		expectedList.add("Time");
		expectedList.add("About");
		
		
		//let us assume that we run the test, we get the elements and we have populated
		//the list with values
		
		ArrayList<String> actualList = new ArrayList<>();
		actualList.add("Admin");
		actualList.add("PIM");
		actualList.add("About");
		actualList.add("Time");
		
		
		
		Assert.assertEquals(actualList, expectedList);
		
	}
	
	@Test
	public void test4()
	{
		boolean result = true;
		
		//We expect it to be false, but it is true --> test fails
		
		Assert.assertFalse(result);
	}
	
	@Test
	public void softAssert()
	{
		
		SoftAssert softAssert = new SoftAssert();
		
		String expected = "Sefa";
		String actual = "Arin";
		
		softAssert.assertEquals(actual, expected); //this will fail
		
		
		//because it is a soft assert, we can continue execution
		
		boolean result = false;
		softAssert.assertFalse(result); //this will pass
		
		
		
		int num1 = 6;
		int num2 = 6;
		
		softAssert.assertEquals(num1, num2); //this passes
		
		
		//this is the REAL CHECK!!!!
		softAssert.assertAll(); 
		
	}
	
	
	
	
	
	
	
	
	
	
}
