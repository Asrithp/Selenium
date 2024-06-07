package Practice;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 
{

	public static void main(String[] args) throws Throwable 
	{
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.saucedemo.com/");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
       driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
       driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
       driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
       driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
       driver.findElement(By.className("shopping_cart_link")).click();
       driver.findElement(By.id("checkout")).click();
       driver.findElement(By.id("first-name")).sendKeys("Asrith");
       driver.findElement(By.id("last-name")).sendKeys("chowdary");
       driver.findElement(By.id("postal-code")).sendKeys("500072");
       driver.findElement(By.id("continue")).click();
       driver.findElement(By.id("finish")).click();
       String conf = driver.findElement(By.className("title")).getText();
      
      if (conf.contains("Complete")) 
      {
		System.out.println("PASS");
	  }
      else
      {
		System.out.println("FAIL");
	  }
       driver.findElement(By.id("back-to-products")).click();
       
      
       
       driver.quit();
	}

}
