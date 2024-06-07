package BasicAuto;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KvkAuto {

	public static void main(String[] args) 
	{
        WebDriver driver = new ChromeDriver();
        driver.get("https://kvkapps-angular-demo.azurewebsites.net/");
        
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        WebElement head = driver.findElement(By.xpath(" //h2[text()=\" Welcome to KVKApps \"]"));
       
        if (head.getText().equals("Welcome to KVKApps")) 
      {
			
		
        //user name
       // driver.findElement(By.xpath("//input[@id=\"mat-input-0\"]")).sendKeys("admin@software.com");
        
        //password
       // driver.findElement(By.xpath("//input[@id=\"mat-input-1\"]")).sendKeys("admin@123");
        
        //password unhide
        driver.findElement(By.xpath("//a[@onclick=\"return false;\"]")).click();
        
        //password hide
        driver.findElement(By.xpath("//a[@onclick=\"return false;\"]")).click();

        //checbox for remember me 
        driver.findElement(By.xpath("//span[@class=\"check\"]")).click();
        
        //click on login button
        driver.findElement(By.xpath("//span[text()=\"Login\"]")).click();
        
       WebElement home = driver.findElement(By.xpath("//h4[text()=\"Dashboad\"]"));
        
            if (home.getText().equals("Dashboad")) 
            {
			System.out.println("Login sucessful");
			
			
			  
			
			
			
			
			
			
			
			
		}
        else 
        {
            System.out.println("Login Failed");
		}
     
        
      }
        else 
        {
			System.out.println("login page failed");
		}
         
        
        
        
        
        driver.quit();
        
	}

}
