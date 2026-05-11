package com.java;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemoTest {

	@Test(dataProvider = "create")
	public void testUserInfor(String username, String psw) {
		System.out.println("name: " + username + "   psw:" + psw);

	}
	
	
	@Test(dataProvider = "hobbyData")
	public void testUserHobby(String username, String hobby,int age) {
		System.out.println("name:" + username + "  hobby:" + hobby +"  age: "+ age);

	}

	@DataProvider(name="create")
	public Object[][] dataset() {
		return new Object[][] { { " Alice", "password 123" }, { " Jack", "password 134" },
				{ " Bob", "password 882" } };

	}
	
	
	@DataProvider
	public Object[][] hobbyData() {
		return new Object[][] { { " Alice", "badminton",1 }, { " Jack", "tennis",2 },
				{ " Bob", "swimming" ,3} };

	}

}
