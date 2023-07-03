package com.hitachi.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hitachi.qa.base.TestBase;

public class HitachiHomepage extends TestBase{


		@FindBy(xpath = "//*[@id='primary-nav']/ul[1]/li/a[@class='hitachi-solutions-logo']")
		@CacheLookup
		WebElement homePage;

		@FindBy(xpath = "//*[@id='primary-nav']/ul[3]/li/a[@href = '/contact-us']")
		WebElement contactsUSLink;
		
		@FindBy(xpath = "//a[contains(text(),'New Contact')]")
		WebElement newContactLink;
		

		@FindBy(xpath = "//a[contains(text(),'Deals')]")
		WebElement dealsLink;

		@FindBy(xpath = "//a[contains(text(),'Tasks')]")
		WebElement tasksLink;
		
		// Initializing the Page Objects:
		public HitachiHomepage() {
			PageFactory.initElements(driver, this);
		}
		
		public String verifyHomePageTitle(){
			return driver.getTitle();
			
		}	
			
		public HitachiContactUS clickOnContactUSLink(){
				contactsUSLink.click();
				return new HitachiContactUS();
		}
			
			

}
