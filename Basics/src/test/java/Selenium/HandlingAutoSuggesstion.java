package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggesstion
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("puma");
		List<WebElement> sea = driver.findElements(By.className("s-suggestion-container"));
		
		for (WebElement all : sea) 
		{
			System.out.println(all.getText());
			if (all.getText().contains("puma slippers for men"))
			{
				all.click();
				break;
			}
		}
		
		
	}

}
