package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12_1 {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 5);

        //Open browser
        driver.get("https://www.training-support.net/selenium/iframes");

        //Print title of page and heading on page
        System.out.println("Page title is: " + driver.getTitle());
        //switch to frame1 
        driver.switchTo().frame(0);
        //Locate button
        WebElement button= driver.findElement(By.xpath("(//button[text()='Click Me!'])[1]"));
        //Print button text
        System.out.println("Button text is: "+button.getText());
        //print button colour
        System.out.println("Button colour is: "+button.getCssValue("background-color"));
        //Switch back to parent page
        driver.switchTo().defaultContent();
        //switch to frame1 
        driver.switchTo().frame(1);
        //Locate button
        button= driver.findElement(By.xpath("(//button[text()='Click Me!'])[1]"));
        //Print button text
        System.out.println("Button text is: "+button.getText());
        //print button colour
        System.out.println("Button colour is: "+button.getCssValue("background-color"));
        
        //Close the browser
        driver.quit();
    }
}