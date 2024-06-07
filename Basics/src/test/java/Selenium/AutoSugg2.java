package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugg2
{

	public static void main(String[] args) throws Throwable
	{
         WebDriver driver=new ChromeDriver();
         driver.get("https://www.flipkart.com/");
         driver.findElement(By.xpath("//input[@class=\"Pke_EE\"]")).sendKeys("puma");
         List<WebElement> all = driver.findElements(By.xpath("//div[@class=\"YGcVZO _2VHNef\"]"));
    	 Thread.sleep(2000);

         for (WebElement sugg : all) 
         {
			System.out.println(sugg.getText());
			Thread.sleep(2000);
			if (sugg.getText().contains("puma flip flops")) 
			{
				sugg.click();
			}
		 }
	}

}
