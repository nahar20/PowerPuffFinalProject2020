package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttech.pageobjectmodel.WorkStationPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WorkStation {
	
	WebDriver driver;
	
   @Given("^user is visiting homepage$")
   public void user_is_visiting_homepage() throws Throwable {
	
	// Open the browser
	   try {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		// Implicit Wait(The Implicit Wait in Selenium is used to tell the web driver to wait for a certain amount of time before it throws a "No Such Element Exception".
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		// Open URL
		driver.get("https://www.dell.com/en-us");
		
		//Explicit Wait(The Explicit Wait in Selenium is used to tell the Web Driver to wait for certain conditions (Expected Conditions) or maximum time exceeded before throwing "ElementNotVisibleException" exception
		
		 }
	   
	    catch(Exception e) {
		   System.out.println("browser is not working");
	    }
		
		
		
	 }
    

   
     @When("^click on Worstation  button$")
     public void click_on_Worstation_button() throws Throwable {
    try {	
    	 
    	WorkStationPOM POM= new  WorkStationPOM(driver);
    	 POM.Workstation().click();
    
    }
     catch(Exception e) {
    	 System.out.println("not clicking");
     }
    	 
   
    }

    @Then("^user successfully able to see Workstation$")
    public void user_successfully_able_to_see_Workstation() throws Throwable {
   
    }



    }
