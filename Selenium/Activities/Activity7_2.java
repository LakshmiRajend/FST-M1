package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_2 {

	public static void main(String[] args) {

		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();

		// And now use this to visit the website
		driver.get("https://training-support.net/selenium/dynamic-attributes");

		// Check the title of the page
		String title = driver.getTitle();
		// Print the title of the page
		System.out.println("Page title is: " + title);

		// Username, Password, Confirm Password and email field is located
		WebElement userName = driver.findElement(By.xpath("(//input[@placeholder='Username'])[2]"));
		WebElement password = driver.findElement(By.xpath("(//input[@placeholder='Password'])[2]"));
		WebElement confirmPassword = driver.findElement(By.xpath("(//input[@placeholder='Password'])[3]"));
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		WebElement signUp = driver.findElement(By.xpath("//button[text()='Sign Up']"));
		userName.sendKeys("Jeeva");
		password.sendKeys("password");
		confirmPassword.sendKeys("password");
		email.sendKeys("jee@gmail.com");
		signUp.click();
		WebElement successMessage = driver.findElement(By.xpath("//div[@id='action-confirmation']"));
		WebDriverWait wait = new WebDriverWait(driver, 500);
		wait.until(ExpectedConditions.visibilityOf(successMessage));
		System.out.println("Success message is displayed as: " + successMessage.getText());

		// Close browser
		driver.close();
	}

}
