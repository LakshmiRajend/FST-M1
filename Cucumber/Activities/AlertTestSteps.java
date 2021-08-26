package stepDefinitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AlertTestSteps {
	WebDriver driver;
	Alert alert;
	@Given("^User is on the page$")
	public void user_is_on_the_page() throws Throwable {
		driver = new FirefoxDriver();
		// Open browser
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		// Get title
		System.out.println("Title of page is: " + driver.getTitle());
	    
	    
	}

	@When("^User clicks the Simple Alert button$")
	public void user_clicks_the_Simple_Alert_button() throws Throwable {
		// Click simple alert
		driver.findElement(By.xpath("//button[@id='simple']")).click();
		
	}

	@Then("^Alert opens$")
	public void alert_opens() throws Throwable {
		alert = driver.switchTo().alert();
	    
	}

	@Then("^Read the text from it and print it$")
	public void read_the_text_from_it_and_print_it() throws Throwable {
		// get text and print it
				System.out.println("Alert text is: " + alert.getText());
	    
	}

	@Then("^Close the alert$")
	public void close_the_alert() throws Throwable {
	    
		// close alert
		alert.accept();
	}

	@Then("^Read the result text$")
	public void read_the_result_text() throws Throwable {
	    System.out.println("Alert is closed successfully");
	    
	}

	@Then("^Close Browser$")
	public void close_Browser() throws Throwable {
		// Close browser
		driver.close();
	    
	}

	@When("^User clicks the Confirm Alert button$")
	public void user_clicks_the_Confirm_Alert_button() throws Throwable {
	    
		// Click confirm alert
				driver.findElement(By.xpath("//button[@id='confirm']")).click();
	}

	@Then("^Close the alert with Cancel$")
	public void close_the_alert_with_Cancel() throws Throwable {
	    alert.dismiss();
	    System.out.println("Alert is closed with Cancel");
	    
	}
	
	@When("^User clicks the Prompt Alert button$")
	public void user_clicks_the_Prompt_Alert_button() throws Throwable {
		// Click prompt alert
		driver.findElement(By.xpath("//button[@id='prompt']")).click();
	}

	@Then("^Write a custom message in it$")
	public void write_a_custom_message_in_it() throws Throwable {
		//type into alert box
		alert.sendKeys("Yes, you are!");
	}

}
