package testNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity5 {
	WebDriver driver;

	@BeforeMethod(alwaysRun = true)
	public void setUp() {
		driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
	}

	@Test(groups = {"HeaderTests", "ButtonTests"})
	public void verifyTitle() {
		String title = driver.getTitle();
		System.out.println("Title of page is: " + title);
		Assert.assertEquals(title, "Target Practice");
		System.out.println("Title of page is verified");
		
	}
	
	@Test(dependsOnMethods = {"verifyTitle"},groups= {"HeaderTests"})
	public void headerTest1() {
		String thirdHeader = driver.findElement(By.id("third-header")).getText();
		Assert.assertEquals(thirdHeader,"Third header");
		System.out.println("Text in H3 tag is verified as: "+thirdHeader);	
	}
	
	@Test(dependsOnMethods = {"verifyTitle"},groups= {"HeaderTests"})
	public void headerTest2() {
		String fifthHeader = driver.findElement(By.cssSelector("h5.ui.green.header")).getCssValue("color");
		System.out.println(fifthHeader);
		Assert.assertEquals(fifthHeader,"rgb(33, 186, 69)");
		System.out.println("Color of fifth header is verified as: "+fifthHeader);	
	}
	
	@Test(dependsOnMethods = {"verifyTitle"},groups= {"ButtonTests"})
	public void buttonTest1() {
		String oliveColor = driver.findElement(By.cssSelector("button.olive")).getCssValue("background-color");
		System.out.println(oliveColor);
		Assert.assertEquals(oliveColor,"rgb(181, 204, 24)");
		System.out.println("Color of Olive button is verified as: "+oliveColor);	
	}
	
	@Test(dependsOnMethods = {"verifyTitle"},groups= {"ButtonTests"})
	public void buttonTest2() {
		String brownColor = driver.findElement(By.cssSelector("button.brown")).getCssValue("background-color");
		System.out.println(brownColor);
		Assert.assertEquals(brownColor,"rgb(165, 103, 63)");
		System.out.println("Color of Brown button is verified as: "+brownColor);	
	}
	

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		driver.close();
	}

}
