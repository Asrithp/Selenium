package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment 
{

	public static void main(String[] args) throws Throwable
	{
       WebDriverManager.chromedriver().setup();
       WebDriver driver=new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.findElement(By.cssSelector("[ng-model=\"FirstName\"]")).sendKeys("sai");
        driver.findElement(By.cssSelector("[placeholder=\"Last Name\"]")).sendKeys("kumar");
        driver.findElement(By.cssSelector("[ng-model=\"Adress\"]")).sendKeys("road no 8 addaguta, kukatpally,hyderabad,telanagana,500072");
        driver.findElement(By.cssSelector("[type=\"email\"]")).sendKeys("asrith@gmail.com");
        driver.findElement(By.cssSelector("[type=\"tel\"]")).sendKeys("9999999999");
        driver.findElement(By.cssSelector("[value=\"Male\"]")).click();
        driver.findElement(By.cssSelector("[value=\"Cricket\"]")).click();
        driver.findElement(By.cssSelector("[value=\"Movies\"]")).click();
        driver.findElement(By.cssSelector("[value=\"Hockey\"]")).click();
         
        driver.findElement(By.id("msdd")).click();
        
        driver.findElement(By.linkText("Hindi")).click();
        
       
        driver.findElement(By.cssSelector("[type=\"tel\"]")).click();

        driver.findElement(By.id("Skills")).click();
        driver.findElement(By.cssSelector("[value=\"Mac\"]")).click();
        
        
        driver.findElement(By.cssSelector("[role=\"combobox\"]")).click();
        driver.findElement(By.className("select2-search__field")).sendKeys("India");
        driver.findElement(By.id("select2-country-results")).click();
        
        
        
        driver.findElement(By.id("yearbox")).click();
        driver.findElement(By.cssSelector("[value=\"2001\"]")).click();
        
        driver.findElement(By.cssSelector("[placeholder=\"Month\"]")).click();
        driver.findElement(By.cssSelector("[value=\"August\"]")).click();
        driver.findElement(By.id("daybox")).click();
        driver.findElement(By.cssSelector("[value=\"23\"]")).click();
        driver.findElement(By.cssSelector("[onblur=\"validatepattern(this)\"]")).sendKeys("Asrith@4712");
        driver.findElement(By.cssSelector("[onblur=\"validatepasswords(this)\"]")).sendKeys("Asrith@4712");
        driver.findElement(By.id("submitbtn")).click();

    }

}
