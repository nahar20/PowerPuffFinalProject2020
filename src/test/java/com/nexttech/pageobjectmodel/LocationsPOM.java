package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocationsPOM {

	WebDriver driver;
	public LocationsPOM(WebDriver driver) {
		
		this.driver=driver;
		 PageFactory.initElements(driver, this);
		
}
	
@FindBy(xpath="//*[@id=\"NavMenu\"]/ul/li[2]/a")
WebElement Click_Locations;
public WebElement Locations() {
	return Click_Locations;

	
}
@FindBy(xpath="//*[@id=\"__next\"]")
WebElement Click_Locationssuccessfully;
public WebElement Locationssuccessfully() {
	return Click_Locationssuccessfully;
	
}
	



}
