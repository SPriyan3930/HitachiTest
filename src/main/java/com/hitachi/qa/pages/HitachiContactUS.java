package com.hitachi.qa.pages;


import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hitachi.qa.base.TestBase;

public class HitachiContactUS extends TestBase{
	
	@FindBy(xpath = "//h1[text()='Contact Us – We’d like to hear from you!']")
	WebElement contactUSLabel;
	
	//Irvine, United States
	
	
	@FindBy(id="first_name")
	WebElement firstName;
	
	@FindBy(id="surname")
	WebElement lastName;
	
	@FindBy(name="client_lookup")
	WebElement company;
	
	@FindBy(xpath = "//input[@type='submit' and @value='Save']")
	WebElement saveBtn;
	
	
	
	// Initializing the Page Objects:
		public HitachiContactUS() {
			PageFactory.initElements(driver, this);
		}
		
		
		public boolean verifyContactsUSLabel(){
			return contactUSLabel.isDisplayed();
		}
		
		public boolean isAddressFound(String address) {
			String addressCheckXpath = "//a[contains(text(),'"+ address + "')]";
			
			WebElement addressToCheck = driver.findElement(By.xpath(addressCheckXpath));
					if 	(addressToCheck.isDisplayed()) {
						System.out.println("Desired address:" + address + " is displayed in ContactUS Page; Test PASSED");
						return addressToCheck.isDisplayed();
					}
					else 
						System.out.println("Desired address:" + address + " is NOT displayed in ContactUS Page: Test Failed");
					return (Boolean) null;
		}
		}
	


