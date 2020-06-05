package com.cucumbertest.ui.test;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;

public class MyTestSteps {
	
	
	
	@Given("^Runmode is \"([^\"]*)\"$")
	public void Runmode_is(String runmode){
		if(runmode.equals("N")){
			//skips test case
			throw new PendingException("Skippping test as runmode is NO");
			//fails test case
			//throw new RuntimeException("Skippping test as runmode is NO");
		}
	}
	
}
