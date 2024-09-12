package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.Login;

public class TC_LoginTest_003 extends BaseClass{
	
	public Login lp;
	
	@Test(priority=1)
	public void test1() {
		TC_linkTest_001 tc1 = new TC_linkTest_001();
		tc1.linkTest();
	}
	
	
	@Test(priority=2)
	public void test2() {
		lp= new Login(driver);
		lp.loginCredentials("ysabc1@gmail.com", "abc#123");
		lp.login();
	}
	
	@Test(priority=3)
	public void test3() {
		lp = new Login(driver);
		String actUserId= lp.accountVerify();
		System.out.println("actual user id = "+actUserId);
		String expUserId = "ysabc1@gmail.com";
		System.out.println("expected user id = "+expUserId);
		
		Assert.assertEquals(actUserId, expUserId);
		
				
	}
}
