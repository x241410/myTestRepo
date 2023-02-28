package com.telus.bped.stepsdefinition;

import com.test.reporting.Reporting;
import com.test.ui.actions.BaseTest;
import com.test.utils.Status;

import io.cucumber.java.en.Given;

/**
 * ***************************************************************************
 * DESCRIPTION: This class contains the steps implementations for the Test
 * application smoke tests AUTHOR: x241410
 * ***************************************************************************
 */

public class StepDefinitions extends BaseTest {

	
	
	@Given("check able to read cred from github")
	public void check_able_to_read_cred_from_github() {
		System.out.println("AAAAAAAAA");
		Reporting.logReporter(Status.INFO, "AAAAAAAAAAAAAAAAAA");
		
		String str = "${secrets.CHECKVAR}";
		
		Reporting.logReporter(Status.INFO, str);
	}

}
