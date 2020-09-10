package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttech.pageobjectmodel.OffersOfHiltonPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Offers {
	WebDriver driver;
	

@Given("^user navigates homepage$")
public void user_navigates_homepage() throws Throwable {
   System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
   
   driver= new ChromeDriver();
   
 //Maximize the browser window
 		driver.manage().window().maximize();
 		
 	// Implicit Wait(The Implicit Wait in Selenium is used to tell the web driver to wait for a certain amount of time before it throws a "No Such Element Exception".
 			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
   
   // Open URL
   driver.get("https://www.hilton.com/en/");
   
   
}

@When("^user click on offers button and user redirect to offers page$")
public void user_click_on_offers_button_and_user_redirect_to_offers_page() throws Throwable {
	
	OffersOfHiltonPOM POM= new OffersOfHiltonPOM(driver);
	POM.Offers().click();
   
}



@Then("^user should be able to see offers$")
public void user_should_be_able_to_see_offers() throws Throwable {
	
	OffersOfHiltonPOM POM= new OffersOfHiltonPOM(driver);
	POM.Successfully().click();
	
	
	}


	
	
	

}
