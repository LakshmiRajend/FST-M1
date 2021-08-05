package stepDefinitions;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Activity1 {
	static WebDriver driver;
	static WebDriverWait wait;
	String title;


	@Given("^Browser is opened$")
	public void browser_is_opened() throws Throwable {
		// Create a new instance of the Firefox driver
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 200);
	}

	@When("^User is navigated to OrangeHRM website$")
	public void user_is_navigated_to_OrangeHRM_website() throws Throwable {
		// Open the browser
		driver.get("http://alchemy.hguy.co/orangehrm");
	}

	@When("^User gets the page title$")
	public void user_gets_the_page_title() throws Throwable {
		//Get title of page
		title = driver.getTitle();

	}

	@Then("^Verify title of the page is \"([^\"]*)\"$")
	public void verify_title_of_the_page_is(String arg1) throws Throwable {
		//Verify page title
		Assert.assertEquals(title, arg1);
	}

	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
		// Browser is closed
		driver.close();
	}


}
