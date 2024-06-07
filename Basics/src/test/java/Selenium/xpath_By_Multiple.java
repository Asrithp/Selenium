package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_By_Multiple 
{

	public static void main(String[] args)
	{
         WebDriver driver=new ChromeDriver();
         /*driver.get("https://www.saucedemo.com/v1/");
         
         // and operater //htmltag[@attritube name= "attribute value" and @attritube name= "attribute value"]  if two attributes ture then it will work
         driver.findElement(By.xpath("//input[@class=\"form_input\" and @id=\"password\"]")).sendKeys("asrith");
         
         // or operater //htmltag[@attritube name= "attribute value" or @attritube name= "attribute value"]  if any one  attributes ture then it will work
         driver.findElement(By.xpath("//input[@type=\"text\" or @a=\"login-button\"]")).sendKeys("bobby");*/
         
         
         driver.get("https://www.amazon.in/");
         driver.findElement(By.xpath("//input[@aria-label=\"Search Amazon.in\"]")).sendKeys("puma shoe",Keys.ENTER);
         driver.findElement(By.xpath("//span[text()=\"Mens Ultimate Ease Walking Shoe\"]")).click();
         String price = driver.findElement(By.xpath("//span[contains(@class,\"a-size-large a\")]")).getText();
         System.out.println(price);
         driver.quit();
	}

}
