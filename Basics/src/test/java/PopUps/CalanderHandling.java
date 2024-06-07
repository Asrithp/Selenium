package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalanderHandling 
{

	public static void main(String[] args) 
	{
		 WebDriver driver= new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.airvistara.com/in/en/ninth-anniversary-sale?utm_source=bing&utm_medium=search&utm_campaign=Festive_Sale_PMX_Brand_Dom_Search_Nov23&ef_id=:G:s&s_kwcid=AL!596!3!!e!!o!!vistara&s_kwcid=AL!596!3!!e!!o!!vistara&msclkid=fd062ceeca18179454894970cdd68bc2&utm_term=vistara&utm_content=Brand");
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
           driver.findElement(By.xpath("//label[@id=\"oneway-trip-container\"]")).click();       
	       driver.findElement(By.xpath("//input[@placeholder=\"Select Departure City\"]")).sendKeys("Hyderabad",Keys.ENTER);
	       driver.findElement(By.xpath("//input[@placeholder=\"Select Arrival City\"]")).sendKeys("delhi",Keys.ENTER);
	       driver.findElement(By.xpath("//input[@id=\"departCalendar\"]")).click();
	       driver.findElement(By.id("cookieModalCloseBtn")).click();
	       
	      
	      
	      
	      
	      
	      
	}

}
