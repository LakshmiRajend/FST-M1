package testNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Activity6 {
	WebDriver driver;

	@BeforeMethod(alwaysRun = true)
	public void setUp() {
		driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/login-form");
	}

	@Test
	@Parameters({"username","password"})
	public void login(String username, String password) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		String confirmationMessage =driver.findElement(By.id("action-confirmation")).getText();
		Assert.assertEquals(confirmationMessage,"Welcome Back, admin");
		System.out.println("Message is "+confirmationMessage);
	}
	

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		driver.close();
	}

}
