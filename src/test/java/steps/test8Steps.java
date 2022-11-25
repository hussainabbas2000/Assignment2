package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class test8Steps {
	WebDriver driver = null;

	@Given("I have a user")
	public void i_have_a_user() {
		System.setProperty("webdriver.chrome.driver","C:/Users/Hussa/eclipse-workspace/Cucumber/src/test/resources/Drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.navigate().to("localhost:4000/");
	}

	@When("I click the clear filter link")
	public void i_click_the_clear_filter_link() {
	    driver.findElement(By.id("Clear List")).click();
	}

	@Then("all filters are removed")
	public void all_filters_are_removed() {
	    driver.getPageSource().contains("Filters removed");
	    driver.close();
	    driver.quit();
	}

}
