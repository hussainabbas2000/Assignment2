package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class test5Steps {
	WebDriver driver = null;

	@Given("I have an admin")
	public void i_have_an_admin() {
		System.setProperty("webdriver.chrome.driver","C:/Users/Hussa/eclipse-workspace/Cucumber/src/test/resources/Drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	}

	@When("I open the add tag section")
	public void i_open_the_add_tag_section() {
	  
	}

	@And("I enter new tag information")
	public void i_enter_new_tag_information() {
	
	}

	@Then("the tag is created")
	public void the_tag_is_created() {
	   
	}

	@And("it is displayed as an option")
	public void it_is_displayed_as_an_option() {
	    
	}
}
