package Selenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation
{

	public static void main(String[] args) throws Throwable 
	{
      WebDriverManager.chromedriver().setup();
      WebDriver driver=new ChromeDriver();
      
      //to open url or app
      
      driver.navigate().to("https://www.hotstar.com");
      
      // Backword
      driver.navigate().back();
      
      // forword
      Thread.sleep(1000);
      driver.navigate().forward();
      
      // refresh the page
      Thread.sleep(1000);
      driver.navigate().refresh();
      
      // slow down action
      Thread.sleep(3000);
       driver.quit();
	}

}
