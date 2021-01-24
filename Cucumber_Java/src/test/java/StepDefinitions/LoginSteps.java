package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {



	@Given("login page")
	public void login_page() {
		System.out.println("Inside Steps-user is on login page");
	}

	@When("enetr user and password")
	public void enetr_user_and_password() {
		System.out.println("Inside Steps-user enters username and password");
	}

	@And("submit login page")
	public void submit_login_page() {
		System.out.println("Inside Steps-click on login button");
	}

	@Then("go to homepage")
	public void go_to_homepage() {
		System.out.println("Inside Steps-user is navigated to webpage");
	}


}
