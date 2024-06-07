package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPopUps
{
	public static void main(String[] args) 
	{
         WebDriver driver = new ChromeDriver();
         driver.get("https://www.foundit.in/");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
         driver.findElement(By.xpath("//div[contains(text(),\"Upload Resume\")]")).click();
         driver.findElement(By.xpath("//input[@name=\"file\"]")).sendKeys("/Users/asrithchowdary/Downloads/LORs.docx");
         driver.findElement(By.xpath("//input[@id=\"pop_upload\"]")).click();
    }
}
