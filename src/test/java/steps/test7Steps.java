package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class test7Steps {
	WebDriver driver = null;

	@Given("that I have a user")
	public void that_i_have_a_user() {
		System.setProperty("webdriver.chrome.driver","C:/Users/Hussa/eclipse-workspace/Cucumber/src/test/resources/Drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	}

	@When("I select the sorting type")
	public void i_select_the_sorting_type() {
	    
	}

	@Then("the products are sorted accordingly")
	public void the_products_are_sorted_accordingly() {
	    
	}

}
