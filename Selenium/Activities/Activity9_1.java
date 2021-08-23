package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_1 {

	public static void main(String[] args) {

		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();

		// And now use this to visit the website
		driver.get("https://training-support.net/selenium/selects");

		// Identify drop down element in page
		WebElement dropdownEle = driver.findElement(By.xpath("//select[@id='single-select']"));
		//Select class object is created
		Select sel = new Select(dropdownEle);
		//Select second option by visible text
		sel.selectByVisibleText("Option 2");
		System.out.println("Second element is selected by visible text");
		//Select third option by index
		sel.selectByIndex(3);
		System.out.println("Third element is selected by index");
		//Select fourth option by value
		sel.selectByValue("4");
		System.out.println("Fourth element is selected by value");
		//Get all options and print to console
		List<WebElement>options =sel.getOptions();
		for(WebElement e:options) {
			System.out.println(e.getText());
		}
		
		// Close browser
		driver.close();
	}

}
