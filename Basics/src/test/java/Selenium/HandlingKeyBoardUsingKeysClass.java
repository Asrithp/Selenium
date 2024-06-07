package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingKeyBoardUsingKeysClass
{

	public static void main(String[] args) throws Throwable 
	{
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.saucedemo.com/v1/");
  // approch 1
       //case:1
      /* driver.findElement(By.name("user-name")).sendKeys("standard_user");
       WebElement ent = driver.findElement(By.name("password"));
       ent.sendKeys("secret_sauce");
       ent.sendKeys(Keys.ENTER);*/

       //case:2
      /* driver.findElement(By.name("user-name")).sendKeys("standard_user");
       WebElement ent = driver.findElement(By.name("password"));
       ent.sendKeys("secret_sauce",Keys.ENTER);*/
       
       
       //case:3
       /*driver.findElement(By.name("user-name")).sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.ENTER);*/
       
       
  //approch 2
       
       /*driver.findElement(By.name("user-name")).sendKeys("standard_user");
        
        Robot robot = new Robot();
        
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_A);
        
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_C);
        
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);*/
        
        
        


       
	}

}
