package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OffersOfHiltonPOM {
	
	WebDriver driver;
	public  OffersOfHiltonPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	// Click on Offers
	@FindBy(xpath="//*[@id=\"NavMenu\"]/ul/li[4]/a")
	WebElement Click_Offers;
	public WebElement Offers() {
		return Click_Offers;
		
	}
	
	
	// Offers Page Validation
	@FindBy(xpath="//div[@id='main_content']")
	WebElement click_Successfully;
	public WebElement Successfully() {
		return click_Successfully;
		
	}
	
	
	
	
}
