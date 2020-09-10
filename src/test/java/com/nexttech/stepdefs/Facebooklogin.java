package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttech.pageobjectmodel.Facebook;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Facebooklogin {

	
	WebDriver driver;
	
	@Given("^user visiting homepage$")
	public void user_visiting_homepage() throws Throwable {
	
		
		
	// Open the browser
   try {
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	
	driver= new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	// Open URL
	driver.get("https://www.facebook.com/");
	//driver.get("https://login.yahoo.com/");
   }
   catch(Exception e) {
	   System.out.println("browser is not working");
   }
	
   
	}

	
	
	@When("^user enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_valid_and(String arg1, String arg2) throws Throwable {
		try {
	
	Facebook POM= new Facebook(driver);
	POM.EmailAddress().sendKeys(arg1);
	POM.Password().sendKeys(arg2);
		}
		catch(Exception e) {
			System.out.println("email and password is wrong");
			
		}
	
	}

    @When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
    try {	
	Facebook POM=new Facebook(driver);
	 POM.Login().click();
    }
	catch(Exception e) {
		System.out.println("login button is not working");
	}
	  
	}

    
    
	@Then("^user successfully login to the system$")
	public void user_successfully_login_to_the_system() throws Throwable {
		try {
		Facebook POM=new Facebook(driver);
		POM.successfully().click();
		}
		catch(Exception e) {
			System.out.println("user is not successfully login");
		}
		
	}


	
    }
