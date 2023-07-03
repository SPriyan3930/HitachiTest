package com.hitachi.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.hitachi.qa.base.TestBase;
import com.hitachi.qa.pages.HitachiContactUS;
import com.hitachi.qa.pages.HitachiHomepage;
import com.hitachi.qa.util.TestUtil;




public class HitachiContactUSTest extends TestBase{

	HitachiHomepage homePage;
	TestUtil testUtil;

	HitachiContactUS hitachiContactUS;
	
	//String sheetName = "contacts";
	public HitachiContactUSTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		
		initialization();
		testUtil = new TestUtil();
		homePage = new HitachiHomepage();
		hitachiContactUS = new HitachiContactUS();
		hitachiContactUS = homePage.clickOnContactUSLink();
		
	}
	
//	@Test(priority=1)
//	public void verifyContactsUsPage(){
//		Assert.assertTrue(hitachiContactUS.verifyContactsUSLabel(), "contactsUS label is missing on the page");
//	}
	
	
	@Test(priority=1)
	public void verifyAddressFound(){
		String getAddress = prop.getProperty("addressToVerify");
		hitachiContactUS.isAddressFound(getAddress);
		
	}
	
	
}
