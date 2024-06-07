package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSVGElements 
{

	public static void main(String[] args) 
	{
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.kayak.co.in/");
      //here we used "and" 
      driver.findElement(By.xpath("//*[name()=\"svg\" and @class=\"c8LPF-icon\"]")).click();
      
      
      
      
	}

}
