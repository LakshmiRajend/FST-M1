package stepDefinitions;

import static stepDefinitions.Activity1.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Activity8 {
	String headertitle;
	WebDriverWait wait;

	@When("^User Navigates to Dashboard$")
	public void user_Navigates_to_Dashboard() throws Throwable {
		//Navigate to Dashboard
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='menu_dashboard_index']")).click();
		System.out.println("====== Navigated to DashBoard successfully =====");
	}

	@When("^User Clicks Apply Leave option$")
	public void user_Clicks_Apply_Leave_option() throws Throwable {
        //Apply Leave is clicked
		driver.findElement(By.xpath("//div[@class='quickLaunge']/a[contains(@href,'applyLeave')]")).click();
		System.out.println("====== Clciked on Apply Leave successfully =====");
		
	}

	@When("^User selects Leave Type,\"([^\"]*)\",\"([^\"]*)\" and Clicks Apply$")
	public void user_selects_Leave_Type_and_Clicks_Apply(String arg1, String arg2) throws Throwable {
		//Leave type is selected
		Select type = new Select(driver.findElement(By.xpath("//select[@id='applyleave_txtLeaveType']")));
		type.selectByValue("1");
		//From date is selected
		driver.findElement(By.xpath("//input[@id='applyleave_txtFromDate']")).sendKeys(arg1);
		driver.findElement(By.xpath("//td[contains(@class,'ui-datepicker-current-day')]/a")).click();
		//To Date is selected
		driver.findElement(By.xpath("//input[@id='applyleave_txtToDate']")).sendKeys(arg2);
		driver.findElement(By.xpath("//td[contains(@class,'ui-datepicker-current-day')]/a")).click();
		//Apply button is selected
		driver.findElement(By.xpath("//input[@id='applyBtn']")).click();
		System.out.println("===== Leave is applied successfully ====");

	}

	@When("^User navigates to My Leave page$")
	public void user_navigates_to_My_Leave_page() throws Throwable {
		//Navigate to My Leave page
		driver.findElement(By.xpath("//a[@id='menu_leave_viewMyLeaveList']")).click();
		System.out.println("====== Navigated to My Leave page successfully =====");

	}

	@When("^User searches with \"([^\"]*)\",\"([^\"]*)\" and clicks Search$")
	public void user_searches_with_and_clicks_Search(String arg1, String arg2) throws Throwable {
        //Search with fromDate and Todate
		driver.findElement(By.xpath("//input[@id='calFromDate']")).sendKeys(arg1);
		driver.findElement(By.xpath("//td[contains(@class,'ui-datepicker-current-day')]/a")).click();
		driver.findElement(By.xpath("//input[@id='calToDate']")).sendKeys(arg2);
		driver.findElement(By.xpath("//td[contains(@class,'ui-datepicker-current-day')]/a")).click();
		//Click search
		driver.findElement(By.xpath("//input[@id='btnSearch']"));
		System.out.println("====== Leave application is searched successfully =====");

	}

	@Then("^Check status of application$")
	public void check_status_of_application() throws Throwable {
       //Get application status from search results
		String applicationStatus = driver
				.findElement(By.xpath("//input[contains(@id,'hdnLeaveRequestStatus')]/preceding-sibling::a")).getText();
		System.out.println("======= Application status: " + applicationStatus + " is displayed successfully ======");
	}

}
