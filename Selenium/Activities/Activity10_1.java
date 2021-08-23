package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_1 {

	public static void main(String[] args) throws InterruptedException {

		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();

		// And now use this to visit the website
		driver.get("https://www.training-support.net/selenium/input-events");

        //Check the title of the page
        String title = driver.getTitle();
        //Print the title of the page
        System.out.println("Page title is: " + title);
        WebElement cube = driver.findElement(By.xpath("//div[@id='D3Cube']"));
        Actions action = new Actions(driver) ;
        //Clicks on cube and print the value of the side in front
		action.click(cube).build().perform();
		System.out.println("Clicking on cube....");
	
		String valueOnFront = driver.findElement(By.xpath("//div[@id='D3Cube']/div[@class='active']/h1")).getText();
	    System.out.println("Value of side in the front is: "+valueOnFront);
	    //Double click on left
	    System.out.println("Double Clicking on cube....");
	    action.doubleClick(cube).build().perform();
	   
		valueOnFront = driver.findElement(By.xpath("//div[@id='D3Cube']/div[@class='active']/h1")).getText();
	    System.out.println("Value of side in the front is: "+valueOnFront);
	    System.out.println("Right Clicking on cube....");
	    //Right click
	    action.contextClick(cube).build().perform();
	 
		valueOnFront = driver.findElement(By.xpath("//div[@id='D3Cube']/div[@class='active']/h1")).getText();
	    System.out.println("Value of side in the front is: "+valueOnFront);
		// Close browser
		driver.close();
	}

}
