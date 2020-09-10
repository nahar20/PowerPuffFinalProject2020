package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttech.pageobjectmodel.LocationsPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Locations {
	
	WebDriver driver;
@Given("^user visits homepage$")
public void user_visits_homepage() throws Throwable {

	try {
//Open Browser		
      System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
       driver=new ChromeDriver();

//Maximize the browser window
		driver.manage().window().maximize();
		
// Implicit Wait(The Implicit Wait in Selenium is used to tell the web driver to wait for a certain amount of time before it throws a "No Such Element Exception".
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				

//open URL
         driver.get("https://www.hilton.com/en/");
	}
	     catch(Exception e) {
		System.out.println("URL is not working");
	}
    
}

@When("^click on Locations button$")
public void click_on_Locations_button() throws Throwable {
	try {
	 LocationsPOM POM=new  LocationsPOM(driver);
	 POM.Locations().click();
	}
	catch(Exception f) {
		System.out.println("Not Clicking");
	}
	
    }
	
   


@Then("^user successfully redirect to locations page$")
public void user_successfully_redirect_to_locations_page() throws Throwable {
	
	 LocationsPOM POM=new  LocationsPOM(driver);
	 POM.Locationssuccessfully().click();
}


	

}
