package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class test1Steps {
	WebDriver driver = null;
	@Given("I have a user with AffanMalik@gmail.com and ST123")
	public void i_have_a_user_with_AffanMalik_gmail_com_and_st123() {
	    System.setProperty("webdriver.chrome.driver","C:/Users/Hussa/eclipse-workspace/Cucumber/src/test/resources/Drivers/chromedriver.exe");

	    driver = new ChromeDriver();
		driver.navigate().to("localhost:4080/");
		driver.findElement(By.className("MuiButtonBase-root MuiIconButton-root MuiIconButton-colorPrimary")).sendKeys(Keys.ENTER);
	}

	@When("I enter login credentials")
	public void i_enter_login_credentials() {
		driver.findElement(By.className("MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-fullWidth")).sendKeys(Keys.ENTER);
	    driver.findElement(By.id("email")).sendKeys("AffanMalik@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("ST123");
		driver.findElement(By.className("MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary")).sendKeys(Keys.ENTER);
	}

	@Then("user dashboard is displayed")
	public void user_dashboard_is_displayed() {
		driver.getPageSource().contains("Shop Name");
	    driver.close();
	    driver.quit();
	}

}
