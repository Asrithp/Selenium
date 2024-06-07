package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_contains
{

	public static void main(String[] args) throws Throwable 
	{ 
       WebDriver driver=new ChromeDriver();
       driver.get("https://amazon.in");
       driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("puma shoe",Keys.ENTER);
       driver.findElement(By.xpath("//span[contains(text(),\"Men's Dazzler Sneakers\")]")).click();
       // it will open new tab
       driver.findElement(By.xpath("//input[@id=\"gift-wrap\"]")).click();
       driver.findElement(By.id("submit.add-to-cart-announce")).click();
       driver.findElement(By.xpath("//span[@class=\"nav-icon nav-sprite\"]")).click();
       driver.findElement(By.xpath("(//span[@data-action=\"sc-update-quantity\"])[2]")).click();
       driver.findElement(By.xpath("//input[@name=\"submit.delete.Cdcdad28b-619a-4635-8224-4fd64eb74399\"]")).click();
       driver.quit();
    }

}
