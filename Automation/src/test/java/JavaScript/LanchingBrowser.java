package JavaScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class LanchingBrowser {

	public static void main(String[] args) 
	{
        WebDriver driver = new ChromeDriver();
        driver.get("https://internshala.com/grand-summer-fair-2024?utm_source=eap_copylink&utm_medium=26981044");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//input[@placeholder=\"john@example.com\"]")).sendKeys("asriythsai23@gmail.com");
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Ajhd@8565");
        driver.findElement(By.xpath("//input[@id=\"first_name\"]")).sendKeys("sai");
        driver.findElement(By.xpath("//input[@id=\"last_name\"]")).sendKeys("kumar");
        driver.findElement(By.xpath("//button[@id=\"registration_submit\"]")).click();
        
	}
}
	