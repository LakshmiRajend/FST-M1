package stepDefinitions;

import static stepDefinitions.Activity1.driver;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Activity5 {
	String headertitle;
	WebDriverWait wait;
	String firstName;
	@When("^User clicks on 'My Info' option$")
	public void user_clicks_on_My_Info_option() throws Throwable {
		//Click My Info
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']")).click();
		System.out.println("====== My Info option is clicked =====");
	    
	}

	@When("^User clicks on Edit$")
	public void user_clicks_on_Edit() throws Throwable {
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		System.out.println("====== Edit button is clicked =====");
	    
	}
	// First name, Last name, Gender, Nationality, DOB is entered
	@When("^user edits \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"and clicks Save$")
	public void user_edits_and_clicks_Save(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
		//First name is entered
		firstName=arg1;
		driver.findElement(By.id("personal_txtEmpFirstName")).clear();
		driver.findElement(By.id("personal_txtEmpFirstName")).sendKeys(firstName);
		
		//last name is entered
		driver.findElement(By.id("personal_txtEmpLastName")).clear();
		driver.findElement(By.id("personal_txtEmpLastName")).sendKeys(arg2);
		//Gender radio button is selected
		driver.findElement(By.xpath("//label[text()='"+arg3+"']/preceding-sibling::input")).click();
		//Nationality drop down is selected
		Select sel = new Select(driver.findElement(By.xpath("//select[@id='personal_cmbNation']")));
		sel.selectByVisibleText(arg4);
		//DOB is entered
		driver.findElement(By.xpath("//input[@id='personal_DOB']")).clear();
		driver.findElement(By.xpath("//input[@id='personal_DOB']")).sendKeys(arg5);
		//Clicks Save
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		System.out.println("====== User info is updated successfully =====");
	}

	@Then("^Verify user info is saved$")
	public void verify_user_info_is_saved() throws Throwable {
		//Verifies user info is updated successfully
		String nameVal= driver.findElement(By.id("personal_txtEmpFirstName")).getAttribute("value");
		Assert.assertEquals(firstName,nameVal);
	    System.out.println("===== Verified that user info is saved ======");
	}
}
