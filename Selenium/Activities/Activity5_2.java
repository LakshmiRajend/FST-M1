package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {

	public static void main(String[] args) {

		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();

		// And now use this to visit the website
		driver.get("https://training-support.net/selenium/dynamic-controls");

		// Check the title of the page
		String title = driver.getTitle();
		// Print the title of the page
		System.out.println("Page title is: " + title);

		// Find Check box input by x-path and check if is selected
		WebElement checkBoxCheck = driver.findElement(By.xpath("//input[@type='checkbox']"));
		System.out.println("Check box is selected?T/F? " + checkBoxCheck.isSelected());
		// Clicks on input check box
		checkBoxCheck.click();

		// checks if the check box is selected
		System.out.println("Check box is selected?T/F? " + checkBoxCheck.isSelected());
		// Close the browser
		driver.close();
	}

}
