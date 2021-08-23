package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_2 {

	public static void main(String[] args) {

		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();

		// And now use this to visit the website
		driver.get("https://training-support.net/selenium/tables");

		// No of rows in table - Sortable Table
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
		System.out.println("Number of rows in Sortable Table is " + rows.size());
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr[1]/td"));
		System.out.println("Number of columns in Sortable Table is " + columns.size());
		//Finds element at second row and second column
		WebElement secondEle = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
		System.out.println("Element at second row and second column is: " + secondEle.getText());
        //Clicks header f first column to sort by name
		driver.findElement(By.xpath("//th[text()='Name']")).click();
		//Finds element at second row and second column
		secondEle = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
		System.out.println("Element at second row and second column is: " + secondEle.getText());
		//Prints elements in table footer
		List<WebElement> footerElements = driver.findElements(By.xpath("//table[@id='sortableTable']//tfoot/tr/th"));
		for(WebElement e:footerElements) {
			System.out.println(e.getText());
		}
		// Close browser
		driver.close();
	}

}
