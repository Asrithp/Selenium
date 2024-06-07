package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseActions
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
	      // driver.get("https://www.saucedemo.com/v1/");
        
	     //WebElement move = driver.findElement(By.linkText("Today's Deals"));
       
//case 1
      /* Actions mouse = new Actions(driver);
       mouse.moveToElement(move).perform();
       
      // mouse.click(move).perform();
//or
      // mouse.moveToElement(move).perform();
       
       //right click action
       /*mouse.contextClick(move).perform();*/
       
       
//case 2
    /* mouse.moveToElement(move).contextClick(move).perform();*/
       
     /* WebElement user = driver.findElement(By.id("user-name"));
       WebElement pass = driver.findElement(By.id("password"));
       WebElement login = driver.findElement(By.id("login-button"));
// case 1
      //Actions act = new Actions(driver);
      /*act.sendKeys(user,"standard_user").perform();
      act.sendKeys(pass,"secret_sauce").perform();
      act.click(login).perform();*/
      
//case //2
     /*act.sendKeys(user,"standard_user").sendKeys(pass,"secret_sauce").click(login).build().perform();*/
       
       
//drag and drop
      /* driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
      WebElement drag = driver.findElement(By.id("draggable"));
      WebElement drop = driver.findElement(By.id("droppable"));
       
     Actions act = new Actions(driver);
       //act.dragAndDrop(drag, drop).perform();
//or
    // act.clickAndHold(drag) .release(drop).perform();*/
     
		

      
	}

}
