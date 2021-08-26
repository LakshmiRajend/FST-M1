package testNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
	}

	@Test
	public void trainingSupport() {
		String title = driver.getTitle();
		System.out.println("Title of page is: " + title);
		Assert.assertEquals(title, "Training Support");
		System.out.println("Title of page is verified");
		driver.findElement(By.id("about-link")).click();
		System.out.println("About Us link is clicked");
		title = driver.getTitle();
		System.out.println("Title of page is: " + title);
		Assert.assertEquals(title, "About Training Support");
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
