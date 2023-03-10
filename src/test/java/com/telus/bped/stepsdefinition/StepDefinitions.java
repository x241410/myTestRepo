package com.telus.bped.stepsdefinition;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.intuit.karate.core.FeatureResult;
import com.telus.api.test.utils.APIJava;
import com.test.reporting.Reporting;
import com.test.ui.actions.BaseTest;
import com.test.ui.actions.WebDriverSession;
import com.test.utils.Status;
import com.test.utils.SystemProperties;

import io.cucumber.java.en.Given;

/**
 * ***************************************************************************
 * DESCRIPTION: This class contains the steps implementations for the BPED
 * application smoke tests AUTHOR: x241410
 * ***************************************************************************
 */

public class StepDefinitions extends BaseTest {

	@Given("check able to read cred from github")
	public void check_able_to_read_cred_from_github() {

		String a = SystemProperties.getStringValue("myVar");
		Reporting.logReporter(Status.INFO, "SYS Key: SystemProperties.getStringValue(\"myVar\")" + a);

		String str = System.getenv("GITHUB_SECRET_GH_TEST");
		System.out.println("===================================================");
		System.out.println("GITHUB_SECRET_GH_TEST :" + str);
		System.out.println("===================================================");

		String str2 = System.getenv("GH_TEST");
		System.out.println("GH TEST:" + str2);
		System.out.println("===================================================");
		
		
		
		if(str2==null) {
			System.out.println("GH String is NULL");
		}

		if (str2.contains("demo")) {
			System.out.println("********Condition Check Passed");
		}
	}

	
}
