package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.Registration;

public class TC_Registerpage_002 extends BaseClass {
	@Test(priority =1)
	public void test1() {
		TC_linkTest_001 tc1 = new TC_linkTest_001();
		tc1.linkTest();
	}
	@Test(priority =2)
	public void test2() {
		Registration reg = new Registration(driver);
		reg.register("abc", "ys", "ysabc1@gmail.com", "abc#123", "abc#123");
		
	}
	@Test(priority=3)
	public void testUserVerify() {
		Registration reg = new Registration(driver);
		String actualUser = reg.user();
		System.out.println("actual user name is = "+actualUser);
		String expUser = "ysabc1@gmail.com";
		Assert.assertEquals(actualUser, expUser);
		
	}
}
