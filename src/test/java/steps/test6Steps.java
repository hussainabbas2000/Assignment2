package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
		 driver.navigate().to("localhost:4080/");
	}

	@When("I click the create account button")
	public void i_click_the_create_account_button() {
		 driver.findElement(By.id("Create Account")).sendKeys(Keys.ENTER);

	}

	@And("I enter details")
	public void i_enter_details() {
	    driver.findElement(By.id("input field")).sendKeys("Nooh Javed");
	    driver.findElement(By.id("input field 2")).sendKeys("123");
	    driver.findElement(By.id("Submit")).sendKeys(Keys.ENTER);
	}

	@Then("my account is created")
	public void my_account_is_created() {
	    driver.getPageSource().contains("Orders");
	    driver.close();
	    driver.quit();
	}
}
