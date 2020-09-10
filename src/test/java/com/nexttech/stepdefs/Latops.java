package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttech.pageobjectmodel.LaptopsPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Latops {
	
	
	WebDriver driver;
	
	
	@Given("^user visits Dell homepage$")
	public void user_visits_Dell_homepage() throws Throwable {
		
		
		// Open the browser
	   try {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		
		driver= new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//maximiza window
		driver.manage().window().maximize();
		
		// Open URL
		driver.get("https://www.dell.com/en-us");
		
	   }
	   catch(Exception e) {
		   System.out.println("browser is not working");
	   }
		
		
		
	}
	   

	@Given("^user hover on product menu$")
	public void user_hover_on_product_menu() throws Throwable {
		try {
	
		
		LaptopsPOM POM= new LaptopsPOM(driver);
		POM.product().click();
	}
		
		catch(Exception e) {
			System.out.println("cursor not moving");
	}
		
	}

	@When("^user hover on Laptops$")
	public void user_hover_on_Laptops() throws Throwable {
		LaptopsPOM POM=new LaptopsPOM(driver);
		POM.laptops().click();
	}

	@When("^user clicks on for home$")
	public void user_clicks_on_for_home() throws Throwable {
		LaptopsPOM POM= new LaptopsPOM(driver);
		POM.forhome().click();
	}

	@Then("^user successfully redirect to the Laptops page$")
	public void user_successfully_redirect_to_the_Laptops_page() throws Throwable {
	    
		
		
	}


	
	
	
	

}
