package com.neotech.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundSteps {
	@Given("Precondition1")
	public void precondition1() {
	   System.out.println("Precondition1");
	}

	@Given("Precondition2")
	public void precondition2() {
		  System.out.println("Precondition2");
	}

	@When("Test step nr1")
	public void test_step_nr1() {
	   System.out.println("Test step nr1");
	}
	@When("Test step nr1 firstName is {string} and lastName is {string}")
	public void test_step_nr1_first_name_is_and_last_name_is(String firstName, String lastName) {
	 System.out.println(firstName + " " + lastName);
	}
	
	
	
	@When("Test step nr2")
	public void test_step_nr2() {
		   System.out.println("Test step nr2");
	}

	@When("Test step nr3 age is {int}")
	public void test_step_nr3() {
		   System.out.println("Test step nr3");
	}

	@Then("Validation nr1")
	public void validation_nr1() {
		   System.out.println("Test step nr1");
	}

	@Then("Validation nr2")
	public void validation_nr2() {
		   System.out.println("Test step nr2");
	}

	@When("Test Step nr4")
	public void test_step_nr4() {
		   System.out.println("Test step nr4");
	}

	@When("Test Step nr5")
	public void test_step_nr5() {
		   System.out.println("Test step nr5");
	}

	@When("Test Step nr6")
	public void test_step_nr6() {
		   System.out.println("Test step nr6");
	}

	@Then("Validation nr3")
	public void validation_nr3() {
		   System.out.println("Test step nr3");
	}

	@Then("Validation nr4")
	public void validation_nr4() {
		   System.out.println("Test step nr4");
	}
}
