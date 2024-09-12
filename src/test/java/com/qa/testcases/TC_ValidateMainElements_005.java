package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.HomePage;

@Test(priority=1)
public class TC_ValidateMainElements_005 extends BaseClass {
	public void Test1() {
		TC_linkTest_001 tc1 = new TC_linkTest_001();
		tc1.linkTest();
	}
	
	@Test(priority=2)
	public void Test2() {
		HomePage hp = new HomePage(driver);
		hp.validateTexts();
	}
	
	@Test(priority=3)
	public void Test3() {
		HomePage hp = new HomePage(driver);
		int expect =7;
		int actual = hp.elementsCount();
		
		Assert.assertEquals(expect, actual);
	}
	
}
