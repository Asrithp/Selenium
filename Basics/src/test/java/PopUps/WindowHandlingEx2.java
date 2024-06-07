package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingEx2 
{

	public static void main(String[] args)
	{
        WebDriver driver =new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Windows.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//a[text()=\"Open New Seperate Windows\"]")).click();
        driver.findElement(By.xpath("//button[text()=\"click\"]")).click();
        
        Set<String> allId = driver.getWindowHandles();
         for (String id : allId) 
         {
			driver.switchTo().window(id);
			String title = driver.getTitle();
			System.out.println(title);
			if (title.contains("Selenium")) 
			{

				break;
			}
		 }
	        driver.findElement(By.xpath("//a[text()=\"Watch the Videos\"]")).click();
	        
	        
	        

         Set<String> allId1 = driver.getWindowHandles();

         for (String id1 : allId1) 
         {
			driver.switchTo().window(id1);
			String title1 = driver.getTitle();
			System.out.println(title1);
			if (title1.contains("SeleniumConf Chicago 2023 Playlist - YouTube\n"
					+ ""))
			{
			break;
			}
         }
			driver.findElement(By.xpath("//a[@title=\"Selenium: State of the Union - Diego Molina, Sauce Labs\"]")).click();
			
			
			

         Set<String> allId2 = driver.getWindowHandles();

         for (String id2 : allId2) 
         {
			driver.switchTo().window(id2);
			String title2 = driver.getTitle();
			System.out.println(title2);
			 if (title2.contains("Frames & windows\n"
					+ ""))
			 {
				 System.out.println("current window "+title2);
				 break;
			 }
         }	
		 driver.findElement(By.xpath("//a[text()=\"Open New Tabbed Windows \"]")).click();

	}

}
