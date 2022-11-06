package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class test4Steps {
	WebDriver driver = null;

	@Given("I have an administrator")
	public void i_have_an_administrator() {
		System.setProperty("webdriver.chrome.driver","C:/Users/Hussa/eclipse-workspace/Cucumber/src/test/resources/Drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.navigate().to("localhost:4080/fast/");
	}

	@SuppressWarnings("deprecation")
	@When("I open the add product section")
	public void i_open_the_add_product_section() {
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.navigate().to("localhost:4080/fast/products");
		driver.findElement(By.className("MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary")).sendKeys(Keys.ENTER);
		
	}

	@And("I enter new product information")
	public void i_enter_new_product_information() {
	    
	}

	@Then("the product is registered")
	public void the_product_is_registered() {
	   
	}

	@And("it is displayed on the storefront")
	public void it_is_displayed_on_the_storefront() {
	   
	}
}
