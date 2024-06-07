package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibibo 
{

	public static void main(String[] args) 
	{
		 WebDriver driver= new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.goibibo.com/flights/?utm_source=bing&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Only%20Goibibo&utm_term=!SEM!DF!B!Brand!RSA!150035352!1211662109442708!!e!goibibo!c!&msclkid=d125ce5152f611ea4f95abce1e81e28a");
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       driver.findElement(By.xpath("//span[@class=\"logSprite icClose\"]")).click();
	       driver.findElement(By.xpath("//p[@class=\"sc-jlwm9r-1 ewETUe\"]")).click();
	      // driver.findElement(By.xpath("(//p[@class=\"sc-12foipm-20 bhnHeQ\"])[1]")).sendKeys("Hyderabad",Keys.ENTER);
	       driver.findElement(By.xpath("//span[text()=\"Departure\"]")).click();
           String month = "January 2024";
            String date = "23";

	       driver.findElement(By.xpath("//div[text()=\"January 2024\"]/ancestor::div[@class=\"DayPicker-Month\"]/descendant::p[text()=\"23\"]")).click();
	       driver.findElement(By.xpath("//span[text()=\"Done\"]")).click();
	       
	       
	
	
	
	
	
	
	}

}
