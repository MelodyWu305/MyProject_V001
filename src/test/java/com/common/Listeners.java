package com.common;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners implements ITestListener{
	
	public void onTestStart(ITestResult result) {
		Reporter.log("Method name is  "+ result.getName());
		System.out.println("start testing");
	} 
	
	public void onTestFailure(ITestResult result) {
		System.out.println("start failed ,screenShort token");
		Reporter.log("report the test is failede");
	} 

}
