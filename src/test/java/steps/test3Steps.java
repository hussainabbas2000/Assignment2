package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class test3Steps {
	WebDriver driver = null;

	@Given("I have a user")
	public void i_have_a_user() {
	    System.setProperty("webdriver.chrome.driver","C:/Users/Hussa/eclipse-workspace/Cucumber/src/test/resources/Drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.navigate().to("localhost:4000/en");
	}

	@When("I click the language drop down list")
	public void i_click_the_language_drop_down_list() {
	    driver.findElement(By.className("MuiSelect-nativeInput")).sendKeys(Keys.ENTER);
	}

	@And("I click the Deutsch as language")
	public void i_click_the_deutsch_as_language() {
	   driver.findElements(By.className("MuiButtonBase-root MuiListitem-root MuiMenuItem-root MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button")).get(1).sendKeys(Keys.ENTER);
	}

	@Then("website language is changed to dutch")
	public void website_language_is_changed_to_dutch() {
		driver.getPageSource().contains("Neueste");
	    driver.close();
	    driver.quit();
	}
}
