package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class test9Steps {
	WebDriver driver = null;

	@Given("that I have an administrator")
	public void that_i_have_an_administrator() {
		System.setProperty("webdriver.chrome.driver","C:/Users/Hussa/eclipse-workspace/Cucumber/src/test/resources/Drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	}

	@When("I click the create group option")
	public void i_click_the_create_group_option() {
	    
	}

	@And("I add members")
	public void i_add_members() {
	    
	}

	@Then("a group is created")
	public void a_group_is_created() {
	    
	}
}
