package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWebElements
{

	public static void main(String[] args) 
	{
         WebDriver driver=new ChromeDriver();
         driver.get("https://www.amazon.com");
         List<WebElement> links = driver.findElements(By.xpath("//a"));
         int count=0;
         for (WebElement Ele : links) 
         {
			System.out.println(Ele.getText());
			count++;
		 }
         System.out.println("total no of links" + count);
	}

}
