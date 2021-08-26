package testNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
	}

	@Test
	public void getTitle() {
		String title = driver.getTitle();
		System.out.println("Title of page is: " + title);
		Assert.assertEquals(title, "Target Practice");
		System.out.println("Title of page is verified");
	}

	@Test
	public void lookForBlackButton() {
		String blackButton = driver.findElement(By.xpath("//button[text()='Black']")).getText();
		// Expected text is black, but actual is Black, so this will fail
		Assert.assertEquals(blackButton, "black");

	}

	@Test(enabled = false)
	public void checkingSkip() {
		System.out.println("This method is skipped");
	}

	@Test
	public void skipExceptionInMethod() {
		throw new SkipException("Skipping test case");
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
