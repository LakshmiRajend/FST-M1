package stepDefinitions;

import static stepDefinitions.Activity1.driver;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Activity6 {
	String headertitle;
	WebDriverWait wait;

	@When("^User Locates the navigation menu$")
	public void user_Locates_the_navigation_menu() throws Throwable {
		//Navigation menu is located
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='menu']/ul")).isDisplayed());
		System.out.println("===== Navigation Menu is located =====");
	}

	@Then("^Verify Directory menu item is visible and clickable$")
	public void verify_Directory_menu_item_is_visible_and_clickable() throws Throwable {
		//Verifying Directory menu item is visible and clickable
		Assert.assertTrue(driver.findElement(By.xpath("//a[@id='menu_directory_viewDirectory']")).isDisplayed());
		System.out.println("====== Directory menu is visible =====");
		Assert.assertTrue(driver.findElement(By.xpath("//a[@id='menu_directory_viewDirectory']")).isEnabled());
		System.out.println("====== Directory menu is clickable =====");
	}

	@Then("^Click 'Directory' menu$")
	public void click_Directory_menu() throws Throwable {
		//Directory menu is clicked
		driver.findElement(By.xpath("//a[@id='menu_directory_viewDirectory']")).click();
	}

	@Then("^Verify that the heading of the page$")
	public void verify_that_the_heading_of_the_page() throws Throwable {
		//Heading of page is verified
		String heading = driver.findElement(By.xpath("//div[@class='head']/h1")).getText();
		Assert.assertEquals(heading, "Search Directory");
		System.out.println("====== Heading of the page is verified =====");
	}
}
