package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LaptopsPOM {

	WebDriver driver;
   public  LaptopsPOM (WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
   }
	
	
 @FindBy(xpath="//button[@id='l1']")
 WebElement hover_product;
 public WebElement product() {
	return hover_product;
	 
 }
   
 
 @FindBy(xpath="//*[@id=\"l1_1\"]/span")
 WebElement hover_laptops;
 public WebElement laptops() {
	return hover_laptops;
	 
 }
 
 
 @FindBy(xpath="//*[@id=\"dell-masthead\"]/div[3]/nav/ul/li[1]/ul/li[1]/ul/li[1]/a/span[2]")
 WebElement click_forhome;
 public WebElement forhome() {
	return click_forhome;
	 
 }
 
 
   
}
