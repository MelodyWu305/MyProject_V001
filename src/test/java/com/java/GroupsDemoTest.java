package com.java;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import myproject.App;

@Test(groups="User-regression")
public class GroupsDemoTest {


	@Test(groups="group1")
	public void test1() {
		System.out.println("group1 test1");
	}
	
	@Test(groups="group2")
	public void test2() {
		System.out.println("group2 test2");
	}
	

	@Test(groups={"group2","group3"})
	public void test3() {
		System.out.println("group2 /group3 test3");
	}

}
