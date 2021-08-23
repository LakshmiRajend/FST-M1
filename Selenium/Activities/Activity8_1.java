package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_1 {

	public static void main(String[] args) {

		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();

		// And now use this to visit the website
		driver.get("https://training-support.net/selenium/tables");

		// No of rows in table - Static Table
		List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr"));
		System.out.println("Number of rows in Static Table is " + rows.size());
		List<WebElement> columns = driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr[1]/td"));
		System.out.println("Number of columns in Static Table is " + columns.size());

		System.out.println("Elements in third row of Static Table are:");
		List<WebElement> thirdRow = driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr[3]/td"));
		for (WebElement e : thirdRow) {
			System.out.println(e.getText());
		}

		WebElement secondEle = driver.findElement(By.xpath("//table[contains(@class,'striped')]/tbody/tr[2]/td[2]"));

		System.out.println("Element at second row and second column is: " + secondEle.getText());

		// Close browser
		driver.close();
	}

}
