package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_3 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();

		// Open browser
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		// Get title
		System.out.println("Title of page is: " + driver.getTitle());
		// Click prompt alert
		driver.findElement(By.xpath("//button[@id='prompt']")).click();
		Alert alert = driver.switchTo().alert();
		// get text and print it
		System.out.println("Alert text is: " + alert.getText());
		//type into alert box
		alert.sendKeys("Yes, you are!");
		// close alert
		alert.accept();
		System.out.println("Alert is closed");
		// Close browser
		driver.close();
	}
}