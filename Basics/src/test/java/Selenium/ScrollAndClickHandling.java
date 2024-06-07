package Selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollAndClickHandling 
{

	public static void main(String[] args) throws Throwable 
	{
        WebDriver driver=new ChromeDriver();
        //driver.get("https://www.facebook.com/");
     // WebElement scr = driver.findElement(By.xpath("//a[text()=\"Instagram\"]"));
      
 //approch1
      
      
//approch2      
      /*JavascriptExecutor js = (JavascriptExecutor)driver;
      js.executeScript("arguments[0].scrollIntoView()",scr);
      scr.click();*/
      
      
//approch3
      //down
     /* Thread.sleep(2000);
     JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	//up
	JavascriptExecutor js1 = (JavascriptExecutor)driver;
	js1.executeScript("window.scrollTo(0,-document.body.scrollHeight)");*/
	 
	
	
//robotclass
      
      driver.get("https://www.amazon.in/?tag=enin-edge-ntp-topsites-affiliates-21");
	Robot robo = new Robot();
	robo.keyPress(KeyEvent.VK_PAGE_DOWN);
	robo.keyRelease(KeyEvent.VK_PAGE_UP);
	
	
	
	
	
	
	
	
	}

}
