package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_2 {

	public static void main(String[] args) {

		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();

		// And now use this to visit the website
		driver.get("https://training-support.net/selenium/selects");

		// Identify multi select drop down element in page
		WebElement dropdownEle = driver.findElement(By.xpath("//select[@id='multi-select']"));
		//Select class object is created
		Select sel = new Select(dropdownEle);
		if(sel.isMultiple()) {
			//Select Javscript by visible text
			sel.selectByVisibleText("Javascript");
			System.out.println("Javascript is selected by visible text");
			//Select nodejs by value
			sel.selectByValue("node");
			System.out.println("NodeJS is selected by value");
			//Select 4,5,6 options by index
			sel.selectByIndex(4);
			sel.selectByIndex(5);
			sel.selectByIndex(6);
			//de-select NodeJS option by value
			sel.deselectByValue("node");
			System.out.println("NodeJS is deselected by value attribute");
			//deselect 7th option by index
			sel.deselectByIndex(7);
			System.out.println("Seventh opton is deselected by index");
			//Print first selected option
			System.out.println("First selected option is "+sel.getFirstSelectedOption().getText());
			//Print all selected options
			List<WebElement>allOptions = sel.getAllSelectedOptions();
			for(WebElement e:allOptions) {
				System.out.println(e.getText());
			}
			//Deselect all options
			sel.deselectAll();
			System.out.println("All options are deselected");
			
		}
		
		// Close browser
		driver.close();
	}

}
