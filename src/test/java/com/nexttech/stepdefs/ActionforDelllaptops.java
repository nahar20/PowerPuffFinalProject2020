package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.nexttech.pageobjectmodel.LaptopsPOM;

public class ActionforDelllaptops {
 WebDriver driver;
 @Test
	
 public void dropdown() throws Throwable {
	 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		// Open URL
		driver.get("https://www.dell.com/en-us");
		
		Actions Act=new Actions(driver);// creating object
		LaptopsPOM POM=new LaptopsPOM(driver);
		
		Thread.sleep(4000);
		Act.moveToElement(driver.findElement(By.xpath("//button[@id='l1']"))).build().perform();
		
		Thread.sleep(2000);
		Act.moveToElement(driver.findElement(By.xpath("//*[@id=\\\"l1_1\\\"]/span"))).build().perform();
		
		POM.forhome().click();
		
 }
}
