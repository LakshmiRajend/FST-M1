package stepDefinitions;

import static stepDefinitions.Activity1.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.When;

public class Activity7 {
	String headertitle;
	WebDriverWait wait;

@When("^User clicks on 'Qualification' option$")
public void user_clicks_on_Qualification_option() throws Throwable {
    // Qualifications option is clicked
	driver.findElement(By.xpath("//ul[@id='sidenav']//li/a[text()='Qualifications']")).click();
}

@When("^User adds Work Experience giving \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and click Save$")
public void user_adds_Work_Experience_giving_and_click_Save(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
	//Clicks Add Wrok Experience
	driver.findElement(By.xpath("//input[@id='addWorkExperience']")).click();;
	//Employer info is entered
	driver.findElement(By.xpath("//input[@id='experience_employer']")).sendKeys(arg1);
	//Job Title is entered
	driver.findElement(By.xpath("//input[@id='experience_jobtitle']")).sendKeys(arg2);
	//From date is selected
	driver.findElement(By.xpath("//input[@id='experience_from_date']")).click();
	driver.findElement(By.xpath("//input[@id='experience_from_date']")).sendKeys(arg3);
	driver.findElement(By.xpath("//td[contains(@class,'ui-datepicker-current-day')]/a")).click();
	//To date is selected
	driver.findElement(By.xpath("//input[@id='experience_to_date']")).click();
	driver.findElement(By.xpath("//input[@id='experience_to_date']")).sendKeys(arg4);
	driver.findElement(By.xpath("//td[contains(@class,'ui-datepicker-current-day')]/a")).click();
	//Comments entered
	driver.findElement(By.xpath("//textarea[@id='experience_comments']")).sendKeys(arg5);
	//Click save
	driver.findElement(By.xpath("//input[@id='btnWorkExpSave']")).click();
	System.out.println("==== Work experience is added sucessfully ====");
}

}
