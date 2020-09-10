package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook {
	
 WebDriver driver;
 
 // Creating constructor
 public Facebook(WebDriver driver) {
	 
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
	 
 }
	
 // enter email
@ FindBy(xpath="//*[@id=\"email\"]")
 WebElement Type_EmailAddress;
public WebElement EmailAddress() {
	return Type_EmailAddress;
	
}
 
// enter password
 @FindBy(xpath="//*[@id=\"pass\"]")

 WebElement Type_Password;
 public WebElement Password() {
	return Type_Password;
	 
 }
 
 
 // login 
 @FindBy(xpath="//*[@id=\"u_0_b\"]")
 WebElement Click_Login;
 public WebElement Login() {
	return Click_Login;
	 
 }
 
 //@FindBy(xpath="//*[@id=\"facebook\"]/body")
 WebElement click_successfully;
 
public WebElement successfully() {
	return click_successfully;
	
	 
	 
 }
 
 


}
