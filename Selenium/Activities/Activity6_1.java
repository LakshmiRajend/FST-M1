package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_1 {

	public static void main(String[] args) {

		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();

		// And now use this to visit the website
		driver.get("https://training-support.net/selenium/dynamic-controls");

		// Check the title of the page
		String title = driver.getTitle();
		// Print the title of the page
		System.out.println("Page title is: " + title);

		// Clicks on checkbox toggle button
		WebElement toggleCheck = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
		WebElement checkBoxCheck = driver.findElement(By.xpath("//input[@type='checkbox']"));
		toggleCheck.click();
		//Wait till invisibility of checkbox
		WebDriverWait wait = new WebDriverWait(driver, 5000);
		wait.until(ExpectedConditions.invisibilityOf(checkBoxCheck));
		// Clicks on toggle button again
		toggleCheck.click();
		//wait till visibility of checkbox
		wait.until(ExpectedConditions.visibilityOf(checkBoxCheck));
		checkBoxCheck.click();
		// checks if the check box is selected
		System.out.println("Check box is selected?T/F? " + checkBoxCheck.isSelected());
		// Close the browser
		driver.close();
	}

}
