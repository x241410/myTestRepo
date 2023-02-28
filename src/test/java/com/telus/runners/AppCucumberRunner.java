package com.telus.runners;


import com.test.cucumber.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = "src/test/resources/features"
		,glue = {"com.telus.bped.stepsdefinition"}
		,tags = "@MyTest1"
		,plugin = { "pretty"
			  , "com.test.cucumber.ExtentCucumberAdapter:",
			  "rerun:target/rerun.txt" }
		,monochrome = true				
		,publish = true
		
		)
public class AppCucumberRunner extends AbstractTestNGCucumberTests {
	

	
}
