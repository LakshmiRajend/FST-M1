package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Activity10_3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        Actions actions = new Actions(driver);

        //Open browser
        driver.get("https://training-support.net/selenium/drag-drop");
        //Get title
        System.out.println("Title of page is: "+driver.getTitle());
        //Locate ball
      WebElement ball = driver.findElement(By.xpath("//img[@class='ui-draggable ui-draggable-handle']"));
      //Locate dropzone1
      WebElement dropzoneOne = driver.findElement(By.xpath("//div[@class='spaced dropzone ui-widget-header ui-droppable']"));
      //drag and drop ball to dropzone1
      actions.dragAndDrop(ball, dropzoneOne).build().perform();
      //Locate text 'Dropped'
      WebElement dropped = driver.findElement(By.xpath("//p[text()='Dropped!']"));
      //Verify ball is dropped
      Assert.assertTrue(dropped.isDisplayed());
      System.out.println("Ball is dropped to dropzone 1");
      //Locate dropzone2
      WebElement dropzoneTwo = driver.findElement(By.xpath("//div[@class='spaced dropzone ui-droppable']"));
      //drag and drop ball to dropzone1
      actions.dragAndDrop(ball, dropzoneTwo).build().perform();
      //Locate text 'Dropped'
       dropped = driver.findElement(By.xpath("//p[text()='Dropped!']"));
      //Verify ball is dropped
      Assert.assertTrue(dropped.isDisplayed());
      System.out.println("Ball is dropped to dropzone 2");
        //Close browser
        driver.close();
    }
}