package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice2 
{

	public static void main(String[] args) throws Throwable
	{
		//Step 1: Launch the browser
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get ("http://localhost: 8888");
		
		//Step 2: Login to Application
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
		//Step 3: Navigate to contacts Link
		
		driver.findElement(By.linkText("Contacts")).click();
		
		//Step 4: Click on Create Contact Look Up Image
		
		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
		
		//Step 5: Create Contact With Mandatory fields and save
		
		driver.findElement(By.name("lastname")) . sendKeys("Asrith"); 
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		
		//Step 6: Validate for Contact
		
		String contactHeader =driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		System.out.println(contactHeader);
		
		if (contactHeader.contains("Asrith"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
	    }
		//Step 7: Logout of App
		
		 WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));	
		 
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Sign Out")).click();
		
		//step 8: close the browser
		
		driver.quit();
		
		
		
		
		
	}

}
