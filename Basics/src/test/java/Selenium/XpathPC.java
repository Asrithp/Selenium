package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathPC 
{

	public static void main(String[] args) throws Throwable
	{
       WebDriverManager.edgedriver().setup();
       WebDriver driver=new EdgeDriver();
       driver.get("https://www.flipkart.com/");
        // pipe line for multipile selectors " | "
       
       /*//html[@attribute="attributeValue"]
       driver.findElement(By.xpath("//input[@autocapitalize=\"none\"]")).sendKeys("standard_user");
       driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("secret_sauce");
       driver.findElement(By.xpath("//input[@class=\"submit-button btn_action\"]")).click();*/
       
       driver.findElement(By.xpath("//span[@role=\"button\"]")).click();
       driver.findElement(By.xpath("//span[text()=\"Appliances\"]")).click();
       Thread.sleep(3000);
       driver.quit();
	}

}
