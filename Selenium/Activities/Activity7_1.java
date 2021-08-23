package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_1 {

	public static void main(String[] args) {

		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();

		// And now use this to visit the website
		driver.get("https://training-support.net/selenium/dynamic-attributes");

		// Check the title of the page
		String title = driver.getTitle();
		// Print the title of the page
		System.out.println("Page title is: " + title);

		// Username & Password field is located
		WebElement userName = driver.findElement(By.xpath("(//input[@placeholder='Username'])[1]"));
		WebElement password = driver.findElement(By.xpath("(//input[@placeholder='Password'])[1]"));

		userName.sendKeys("admin");
		password.sendKeys("password");

		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		WebElement loginMessage = driver.findElement(By.xpath("//div[@id='action-confirmation']"));
		WebDriverWait wait = new WebDriverWait(driver, 500);
		wait.until(ExpectedConditions.visibilityOf(loginMessage));
		System.out.println("Login message is displayed as: " + loginMessage.getText());

		// Close browser
		driver.close();
	}

}
