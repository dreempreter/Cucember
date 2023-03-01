package com.neotech.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineSteps {
	@When("Login with {string} and {string}")
	public void login_with_and(String username, String password) {
	   System.out.println("Login with " + username + " and " + password);
	}
	@When("Click on the login button")
	public void click_on_the_login_button() {
	  System.out.println("Click on logib button ");
	}
	@Then("Validate that {string} is displayed")
	public void validate_that_is_displayed(String string) {
		 System.out.println("Validate welcome message");
	}
	@Then("We want to say Bye {string}")
	public void we_want_to_say_bye(String fullName) {
	   System.out.println(" We are saying bye " + fullName);
	}


}
