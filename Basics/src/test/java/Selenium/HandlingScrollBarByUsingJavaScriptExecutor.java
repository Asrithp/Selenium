package Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBarByUsingJavaScriptExecutor 
{

	public static void main(String[] args) 
	{
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.meesho.com/");
        driver.manage().window().maximize();
        
        JavascriptExecutor scroll = (JavascriptExecutor)driver;
       
 //scrolling down  
       for (int i = 0; i < 3; i++) 
       {
		scroll.executeScript("window.scrollBy(0,1000)");
	   }
        
 //scrolling up
       for (int i = 0; i < 3; i++) 
       {
		scroll.executeScript("window.scrollBy(0,-1000)");
	   }
        
       
        
	}

}
