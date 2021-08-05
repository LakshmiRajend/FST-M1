package stepDefinitions;

import static stepDefinitions.Activity1.driver;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Activity4 {
	String headertitle;
	WebDriverWait wait;
	String employeeId;

	@When("^User clicks on PIM option$")
	public void user_clicks_on_PIM_option() throws Throwable {
		//PIM option in menu is clicked
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
		System.out.println("===== PIM option in menu is clicked =====");
	}

	@When("^User clicks on Add$")
	public void user_clicks_on_Add() throws Throwable {
		wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='btnAdd']")));
		//Add button is clicked to add a new employee
		driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
		System.out.println("===== Add Button to add a new employee is clicked =====");
	}

	@When("^user provides \"([^\"]*)\", \"([^\"]*)\" and clicks Save$")
	public void user_provides_and_clicks_Save(String arg1, String arg2) throws Throwable {
		//username and password is provided
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(arg1);
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(arg2);
		
		//Capturing employee id auto-assigned in 'Add Employee' Page
		employeeId= driver.findElement(By.xpath("//input[@id='employeeId']")).getAttribute("value");
		//Click Save
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		System.out.println("===== Employee record with employee id : "+employeeId+" is created ======");

	}

	@Then("^Verify Employee is added$")
	public void verify_Employee_is_added() throws Throwable {
		//Verify Personal Detail of new employee created is displayed
		WebElement employee = driver.findElement(By.xpath("//input[@id='personal_txtEmpFirstName']"));
		Assert.assertTrue(employee.isDisplayed());
		System.out.println("===== Employee creation is verified =====");
		

	}

	@When("^User navigates to Employee List tab in PIM page$")
	public void user_navigates_to_Employee_List_tab_in_PIM_page() throws Throwable {
		//Navigate to 'Employee List' tab in PIM page
		driver.findElement(By.xpath("//a[@id='menu_pim_viewEmployeeList']")).click();
		wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@id='empsearch_employee_name_empName']")));
		System.out.println("===== User is navigated to Employee List tab in PIM page =====");
	}

	@When("^Searches for employee created using \"([^\"]*)\", \"([^\"]*)\"$")
	public void searches_for_employee_created_using(String arg1, String arg2) throws Throwable {
		//Search for employee using employee name in Employee List tab
		String empName = arg1 + " " + arg2;
		driver.findElement(By.xpath("//input[@id='empsearch_employee_name_empName']")).click();
		driver.findElement(By.xpath("//input[@id='empsearch_employee_name_empName']")).clear();
		driver.findElement(By.xpath("//input[@id='empsearch_employee_name_empName']")).sendKeys(empName);
		//Employee ID is provided
		driver.findElement(By.xpath("//input[@id='empsearch_id']")).sendKeys(employeeId);
		Thread.sleep(2000);
		//Click Search
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
		System.out.println("===== Employee record:"+empName+" is searched successfully ======");
	}

	@Then("^Employee Creation is verified$")
	public void employee_Creation_is_verified() throws Throwable {
		// Capture employee id from search results
		String empIDInResults = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[1]/td[2]/a")).getText();
		System.out.println("===== Employee id in search results is :"+empIDInResults+" ======");
		//Verifying employee id in search results, to verify the employee creation is successful
		Assert.assertEquals(employeeId, empIDInResults);
		System.out.println("===== Employee id:"+employeeId+" is displayed correctly in search results======");
		System.out.println("===== Employee creation is verified in Employee List tab =====");
		
	}

}
