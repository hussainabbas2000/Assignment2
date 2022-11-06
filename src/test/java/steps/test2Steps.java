package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class test2Steps {
	WebDriver driver = null;

	@SuppressWarnings("deprecation")
	@Given("I have an admin with hussainabbas@gmail.com and ST123")
	public void i_have_an_admin_with_hussainabbas_gmail_com_and_st123() {
		driver = new ChromeDriver();
		driver.navigate().to("localhost:4080/fast");
		driver.findElement(By.className("MuiButtonBase-root MuiIconButton-root MuiIconButton-colorPrimary")).sendKeys(Keys.ENTER);
		driver.findElement(By.className("MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-fullWidth")).sendKeys(Keys.ENTER);
	    driver.findElement(By.id("email")).sendKeys("hussainabbas@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("ST123");
		driver.findElement(By.className("MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary")).sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
	}

	@When("I open the order section")
	public void i_open_the_order_section() {
		driver.navigate().to("localhost:4080/fast/orders");
	}

	@Then("order transactions are displayed as a list")
	public void order_transactions_are_displayed_as_a_list() {
		 driver.getPageSource().contains("Order ID");
		    driver.close();
		    driver.quit();
	}

}
