package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity4_1 {

	public static void main(String[] args) {

		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();

		// And now use this to visit the website
		driver.get("https://www.training-support.net");

		// Check the title of the page
		String title = driver.getTitle();
		// Print the title of the page
		System.out.println("Page title is: " + title);

		// Find the About Us link using xpath() and click it
		driver.findElement(By.xpath("//a[@id='about-link']")).click();
		// Wait until the new page loads completely
		WebDriverWait wait = new WebDriverWait(driver, 5000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='About Us']")));

		// Check the title of the page
		title = driver.getTitle();
		// Print the title of the page
		System.out.println("Page title is: " + title);

		// Close the browser
		driver.close();
	}

}
