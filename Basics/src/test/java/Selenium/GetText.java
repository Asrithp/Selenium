package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetText 
{

	public static void main(String[] args)
	{
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
       /* driver.get("https://www.meesho.com/");
        driver.findElement(By.xpath("//div[@class=\"sc-gKPRtg ioznrq\"]")).click();
        driver.quit();*/
        driver.get("https://fast.com/");
       // driver.findElement(By.xpath("//span[@class=\"start-text\"]")).click();
       // driver.findElement(By.xpath("//span[@class=\"result-data-large number result-data-value download-speed\"]")).getText();
        
        
        String DownloadSpeed = driver.findElement(By.className("\"bordered-speed-container\"")).getText();
        System.out.println(DownloadSpeed);
        driver.quit();
        
	}

}
