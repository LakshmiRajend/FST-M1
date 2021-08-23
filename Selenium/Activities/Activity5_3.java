package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {

	public static void main(String[] args) {

		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();

		// And now use this to visit the website
		driver.get("https://training-support.net/selenium/dynamic-controls");

		// Check the title of the page
		String title = driver.getTitle();
		// Print the title of the page
		System.out.println("Page title is: " + title);

		// Find text box and checks if it is enabled
		WebElement textField = driver.findElement(By.xpath("//input[@id='input-text']"));
		System.out.println("Text field is enabled?T/F? " + textField.isEnabled());

		// Clicks on enable input button
		driver.findElement(By.xpath("//button[text()='Enable Input']")).click();

		// checks if the text field is enabled
		System.out.println("Text field is enabled?T/F? " + textField.isEnabled());
		// Close the browser
		driver.close();
	}

}
