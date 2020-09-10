package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkStationPOM {
  WebDriver driver;
  public  WorkStationPOM(WebDriver driver) {
	  
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
	  
  }
  
  
  
  @FindBy(xpath="//*[@id=\"category-bar\"]/div[3]/a/div")
  WebElement Click_Workstation;
  public WebElement Workstation() {
	return Click_Workstation;
	  
  }
  
  
  @FindBy(xpath="")
  WebElement click_successfully;
  public WebElement successfully() {
	return click_successfully;
	  
  }
}
