package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class test6Steps {
	WebDriver driver = null;

	@Given("I have an user")
	public void i_have_an_user() {
		 System.setProperty("webdriver.chrome.driver","C:/Users/Hussa/eclipse-workspace/Cucumber/src/test/resources/Drivers/chromedriver.exe");
		 driver = new ChromeDriver();
	}

	@When("I click the create account button")
	public void i_click_the_create_account_button() {
	    
	}

	@And("I enter details")
	public void i_enter_details() {
	    
	}

	@Then("my account is created")
	public void my_account_is_created() {
	    
	}
}
