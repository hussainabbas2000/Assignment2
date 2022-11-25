package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
	    driver.navigate().to("localhost:4080/fast/");
	}

	@When("I open the add tag section")
	public void i_open_the_add_tag_section() {
		driver.navigate().to("localhost:4080/fast/tags");
		driver.findElement(By.className("MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary")).sendKeys(Keys.ENTER);
	}

	@And("I enter new tag information")
	public void i_enter_new_tag_information() {
	    driver.findElement(By.xpath("input field")).sendKeys("XYZ");

	}

	@Then("the tag is created")
	public void the_tag_is_created() {
	    driver.findElement(By.xpath("button")).sendKeys(Keys.ENTER);

	}

	@And("it is displayed as an option")
	public void it_is_displayed_as_an_option() {
	    driver.getPageSource().contains("XYZ");
	    driver.close();
	    driver.quit();
	}
}
