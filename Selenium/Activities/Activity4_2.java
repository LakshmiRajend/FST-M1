package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {
	
	    public static void main(String[] args) {

	        //Create a new instance of the Firefox driver
	        WebDriver driver = new FirefoxDriver();
	        
	        //And now use this to visit the website
	        driver.get("https://training-support.net/selenium/simple-form");
	        
	        //Check the title of the page
	        String title = driver.getTitle();
	        //Print the title of the page
	        System.out.println("Page title is: " + title);
	        
	        //Find the first name and last name using id
	        WebElement fName = driver.findElement(By.xpath("//input[@id='firstName']"));
	        WebElement lName = driver.findElement(By.xpath("//input[@id='lastName']"));
	        //Enter first name and last name
	        fName.sendKeys("Lakshmi");
	        lName.sendKeys("Rajendran");
	        //Enter email and contact number
	        WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	        WebElement number = driver.findElement(By.xpath("//input[@id='number']"));
	        email.sendKeys("lraj@in.ibm.com");
	        number.sendKeys("897098787");
            //Click submit
	        driver.findElement(By.xpath("//input[@value='submit']")).click();
	        
	        //Close the browser
	        driver.close();
	    }
	
}
