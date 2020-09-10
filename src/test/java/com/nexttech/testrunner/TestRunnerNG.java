
package com.nexttech.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestRunnerNG {
	
	// features folder and stepdef can communicate through TestRunner
	
	@CucumberOptions(
			
	features = {"Features"},
	glue = {"com.nexttech.stepdefs"},
	tags= {"@sc1"}
	)
	
	public class Testrunner extends AbstractTestNGCucumberTests{}
	

}
