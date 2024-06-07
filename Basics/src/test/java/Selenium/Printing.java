package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printing 
{

	public static void main(String[] args) 
	{
         WebDriver driver=new ChromeDriver();
         driver.get("https://www.flipkart.com/");
         driver.findElement(By.xpath("//span[@role=\"button\"]")).click();
         driver.findElement(By.xpath("//input[contains(@title,\"S\")]")).sendKeys("apple",Keys.ENTER);
         String product = driver.findElement(By.xpath("(//a[@class=\"s1Q9rs\"])[1]")).getText();
         System.out.println("Product Name :"+  product);
         String discount = driver.findElement(By.xpath("(//div[@class=\"_3Ay6Sb\"])[1]")).getText();
         System.out.println("discount : "+ discount);
         driver.quit();
         
         
	}

}
