package Selenium;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing 
{

	public static void main(String[] args) throws Throwable 
	{
         WebDriverManager.chromedriver().setup();
         WebDriver driver=new ChromeDriver();
         
         /* 1)id
          * 2)name
          * 3)className
          * 4)LinkText
          * 5)partialLinkText
          * 6)cssSelector
          * 7)xpath
          * 8)tagName */
         
         driver.get("https://www.flipkart.com/");
         
         //class name 
         driver.findElement(By.className("_30XB9F")).click();
         driver.findElement(By.className("H6-NpN _3N4_BX")).click();
         driver.findElement(By.className("_2iLD__")).click();
         
         //linkText
         driver.findElement(By.linkText("Today's Deals")).click();
         
         //id
         driver.findElement(By.id("nav-search-submit-button")).click();
         driver.findElement(By.id("password")).sendKeys("secret_sauce");
         driver.findElement(By.id("login-button")).click(); 
         driver.findElement(By.id("login-button")).click();

         
         //name
         driver.findElement(By.name("user-name")).sendKeys("standard_user");
         driver.findElement(By.name("password")).sendKeys("secret_sauce");
         
         //partiaLinkText     (if this starts with '<a> to </a>' then only we consider)
         // it refers linktext but not fully of it one sentence
         //ex:- linktext is ">Asrith Kumar Chowdary<" then with partiaLinktext we use"asrith or kumar or chowdary" any one of then that is partialink text
         driver.findElement(By.partialLinkText("Today'")).click();

         //cssSelector
         /*2 types of cssSelector 
          * [attributeName="attributeValue"]
          * htmlTag[attributeNmae="attributeValue"] */
         driver.findElement(By.cssSelector("[placeholder=\"Username\"]")).sendKeys("standard_user");
         driver.findElement(By.cssSelector("[input[type=\"password\"]")).sendKeys("secret_sauce");
         //cssSelector for
         //#id shortcuts
         driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("hello");
         //#attributeValue
         
         

         
         
         
         
         Thread.sleep(3000);
         driver.quit();

	}

}
