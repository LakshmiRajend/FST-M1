package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {

	public static void main(String[] args) {

		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();

		// And now use this to visit the website
		driver.get("https://training-support.net/selenium/dynamic-controls");

		// Check the title of the page
		String title = driver.getTitle();
		// Print the title of the page
		System.out.println("Page title is: " + title);

		// Find Check box input by x-path and check if is displayed
		boolean checkBoxCheck = driver.findElement(By.xpath("//input[@type='checkbox']")).isDisplayed();
		System.out.println("Check box is displayed?T/F? " + checkBoxCheck);
		// Clicks on 'Remove Checkbox' button
		driver.findElement(By.xpath("//button[text()='Remove checkbox']")).click();

		// Find Check box input by x-path and check if is displayed
		checkBoxCheck = driver.findElement(By.xpath("//input[@type='checkbox']")).isDisplayed();
		System.out.println("Check box is displayed?T/F? " + checkBoxCheck);
		// Close the browser
		driver.close();
	}

}
