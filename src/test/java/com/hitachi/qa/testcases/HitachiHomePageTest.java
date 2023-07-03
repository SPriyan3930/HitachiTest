package com.hitachi.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.hitachi.qa.base.TestBase;
import com.hitachi.qa.pages.HitachiContactUS;
import com.hitachi.qa.pages.HitachiHomepage;
import com.hitachi.qa.util.TestUtil;

		public class HitachiHomePageTest extends TestBase {
	
		HitachiHomepage homePage;
		TestUtil testUtil;
		
		HitachiContactUS hitachiContactUS;

		public HitachiHomePageTest() {
			super();
		}
		
		//test cases should be separated -- independent with each other
		//before each test case -- launch the browser and login
		//@test -- execute test case
		//after each test case -- close the browser
		
		@BeforeMethod
		public void setUp() {
			initialization();
			testUtil = new TestUtil();
			homePage = new HitachiHomepage();
			hitachiContactUS = new HitachiContactUS();
			
		}
		
		
		@Test(priority=1)
		public void verifyHomePageTitleTest(){
			String homePageTitle = homePage.verifyHomePageTitle();
			
			Assert.assertEquals(homePageTitle, prop.getProperty("homePageTitle"),"Home page title not matched");
			hitachiContactUS = homePage.clickOnContactUSLink();
		}
		
//			
//		@Test(priority=2)
//		public void verifyContactsUSLinkTest(){
//			testUtil.switchToFrame();
//			hitachiContactUS = homePage.clickOnContactUSLink();
//		}
		
		
		
		@AfterMethod
		public void tearDown(){
			driver.quit();
		}
		
		


}
