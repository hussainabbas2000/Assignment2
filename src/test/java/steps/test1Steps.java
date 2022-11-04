package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class test1Steps {
	WebDriver driver = null;
	@Given("user is on login page")
	public void user_is_on_login_page() {
	   System.out.println("User is on Login Page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		   System.out.println("User enters credentials");

	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		   System.out.println("User clicks login button");
	}

	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
		   System.out.println("User is sent to homepage");

	}

}
