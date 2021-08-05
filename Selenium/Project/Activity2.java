package stepDefinitions;

import org.openqa.selenium.By;
import static stepDefinitions.Activity1.driver;
import cucumber.api.java.en.Then;

public class Activity2 {
	String headertitle;
	Activity1 activity1 = new Activity1();

	@Then("^Get the url of the header image$")
	public void get_the_url_of_the_header_image() throws Throwable {
		//Get url of the header image
		headertitle = driver.findElement(By.xpath("//div[@id='divLogo']/img")).getAttribute("src");
		System.out.println("header:" + headertitle);
	}

	@Then("^Print the url of header image to console$")
	public void print_the_url_of_header_image_to_console() throws Throwable {
		//Print header image url to console
		System.out.println("=== Url of header image is: " + headertitle);
	}
}
