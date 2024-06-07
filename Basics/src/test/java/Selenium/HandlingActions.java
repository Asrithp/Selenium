package Selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions 
{

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		
//doule click action
		/*driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement ece = driver.findElement(By.xpath("//button[text()=\"Double-Click Me To See Alert\"]"));
	    Actions act = new Actions(driver);
	    
	    act.doubleClick(ece).click().perform();*/
	    
		
//for popups		
	   /* driver.get("url");
       driver.manage().window().maximize();
        Actions act = new Actions(driver);
        act.moveByOffset(20, 10).perform();*/
	
//dropdown arrow down and arrow down
		
	driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("Create new account")).click();
	
	
//with keys
	Thread.sleep(2000);
	WebElement day = driver.findElement(By.xpath("//select[@aria-label=\"Day\"]"));
	day.click();
	day.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(1000);
	day.sendKeys(Keys.ARROW_DOWN);
	day.sendKeys(Keys.ARROW_DOWN);

	WebElement month = driver.findElement(By.xpath("//select[@aria-label=\"Month\"]"));
	month.click();
	month.sendKeys(Keys.ARROW_DOWN);	
	month.sendKeys(Keys.ARROW_DOWN);	
	month.sendKeys(Keys.ARROW_DOWN);	

	WebElement year = driver.findElement(By.id("\"year\""));
	year.click();
	year.sendKeys(Keys.ARROW_DOWN);
	year.sendKeys(Keys.ARROW_DOWN);
	year.sendKeys(Keys.ARROW_DOWN);

//robotclass
	/*WebElement day = driver.findElement(By.xpath("//select[@aria-label=\"Day\"]"));
	day.click();
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_DOWN);*/

	
	
	
	
	
	}

}
