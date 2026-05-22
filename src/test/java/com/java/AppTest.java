package com.java;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;

import myproject.App;


public class AppTest {
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("this is before test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("this is after test@@@@@@@@@@@@@@@@@@@@@");
	}
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("this is @BeforeMethod！！！！！！！！！！！");
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("this is @AfterMethod！！！！！！！");
	}
	
	@Test(priority=2,description="test logout ")
	public void testLogOut() {
		App myapp= new App();
		System.out.println("this is  testcase 2");
		SoftAssert softassert=new SoftAssert();
		softassert.assertEquals(1, 1,"1=1?");
		
		Assert.assertEquals(1, myapp.userLogin("melody", "123456"));
		softassert.assertAll();
		
		
	}


	@Test(priority=1,description="test log in ")
	public void testLogIn() {
		App myapp= new App();
		System.out.println("this is  testcase 1");
		AssertJUnit.assertEquals(1, myapp.userLogin("melody", "123456"));
	}
	
}
