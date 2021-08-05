package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static stepDefinitions.Activity1.driver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Activity3 {
	String headertitle;

	@When("^User provides username as \"([^\"]*)\"$")
	public void user_provides_username_as(String arg1) throws Throwable {
		// User enters user name in 'Username' field
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(arg1);

	}

	@When("^User provides password as \"([^\"]*)\"$")
	public void user_provides_password_as(String arg1) throws Throwable {
		// User enters password in 'Password' field
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(arg1);

	}

	@When("^User clicks Login$")
	public void user_clicks_Login() throws Throwable {
		// User clicks on Login button
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	}

	@Then("^Verify HomePage is opened$")
	public void verify_HomePage_is_opened() throws Throwable {
		// Verify that 'Welcome' is displayed on top right banding
		WebElement welcome = Activity1.driver.findElement(By.xpath("//a[@id='welcome']"));
		Assert.assertTrue(welcome.isDisplayed());
		System.out.println("===== User is logged in successfully =====");
	}
}
