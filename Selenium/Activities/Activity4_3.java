package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {
	
	    public static void main(String[] args) {

	        //Create a new instance of the Firefox driver
	        WebDriver driver = new FirefoxDriver();
	        
	        //And now use this to visit the website
	        driver.get("https://www.training-support.net/selenium/target-practice");
	        
	        //Check the title of the page
	        String title = driver.getTitle();
	        //Print the title of the page
	        System.out.println("Page title is: " + title);
	        
	        //Find elements by xpath
	        WebElement thirdHeader = driver.findElement(By.xpath("//h3[@id='third-header']"));
	        System.out.println("Third Header text is "+thirdHeader.getText());
	        WebElement fifthHeader = driver.findElement(By.xpath("//h5[@class='ui green header']"));
	        System.out.println("Fifth Header text is "+fifthHeader.getText());
	        String colorCSS=fifthHeader.getCssValue("color");
	        System.out.println(" Colour CSS Property of fifth header is "+colorCSS);
	        
	        WebElement voilet = driver.findElement(By.xpath("//button[text()='Violet']"));
	        System.out.println("Class attributes of voilet button is : "+voilet.getAttribute("class"));
	        
	        WebElement grey = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]"));
	        System.out.println(" Grey button text is : "+grey.getText());
	        //Close the browser
	        driver.close();
	    }
	
}
