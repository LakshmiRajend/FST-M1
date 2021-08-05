package stepDefinitions;

import static stepDefinitions.Activity1.driver;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Activity9 {
	String headertitle;
	WebDriverWait wait;

	@When("^User clicks on Emergency Contacts$")
	public void user_clicks_on_Emergency_Contacts() throws Throwable {
		driver.findElement(By.xpath("//a[text()='Emergency Contacts']")).click();
		System.out.println("====== Emergency Contacts is clicked successfully =====");
	}

	@When("^User Retrieve information about all the contacts listed in the table and print to console$")
	public void user_Retrieve_information_about_all_the_contacts_listed_in_the_table_and_print_to_console() throws Throwable {
		//Store the table header web elements to a 'list of web elements'
		List<WebElement> headers = driver.findElements(By.xpath("//table[@id='emgcontact_list']/thead/tr/th"));
		List<String> tableHeaders = new ArrayList<String>();
		//Iterate through the header elements, getting the text and adding it to list of strings
		for (WebElement we : headers) {
			String heading = we.getText();
			tableHeaders.add(heading);

		}
		System.out.println(tableHeaders);
		//Find the number of rows in the table
		int rowSize = driver.findElements(By.xpath("//table[@id='emgcontact_list']/tbody/tr")).size();
		//Find the number of columns in the table
		int columnSize = driver.findElements(By.xpath("//table[@id='emgcontact_list']/tbody/tr[1]/td")).size();
		List<String> tableVal = new ArrayList<String>();
		//Iterating through all the rows in the table
		for (int rowCount = 1; rowCount <= rowSize; rowCount++) {
			tableVal.clear();
			//Iterating through the columns in each row and adding the cell values to a list
			for (int columnCount = 2; columnCount <= columnSize; columnCount++) {
				//Adding the cell value to a list of string
				tableVal.add(driver
						.findElement(By.xpath(
								"//table[@id='emgcontact_list']/tbody/tr[" + rowCount + "]/td[" + columnCount + "]"))
						.getText());
			}
			System.out.println(tableVal);
		}
	}

}
