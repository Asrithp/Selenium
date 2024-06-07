package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Locaters_Testing
{

	public static void main(String[] args) 
	{
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        
       /* driver.get("https://www.saucedemo.com/");
        driver.findElement(By.cssSelector("[placeholder=\"Username\"]")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("secret_sauce");*/
        
        driver.get("https://www.amazon.in");
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("hello");
        
        
        
        
        
        
        
        
        /*driver.findElement(By.id("email")).sendKeys("8519824712");
        driver.findElement(By.id("pass")).sendKeys("UZd6bfV2--K2Ihd");
        //driver.findElement(By.id("loginbutton")).click();
        driver.findElement(By.name("login")).click();*/
	}

}
