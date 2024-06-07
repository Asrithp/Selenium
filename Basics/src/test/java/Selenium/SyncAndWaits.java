package Selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SyncAndWaits
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
//1.java wait
        //thread.sleep(1000);
		
//2.implicit wait
		//for version 3
		           //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//for version 4
		          // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//3.explicit wait
	/*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(stored variable name:- login));
	login.click();*/
		
//4 fluent wait
	/*FluentWait wait = new FluentWait(driver);
	wait.pollingEvery(Duration.ofSeconds(1));
	wait.withTimeout(Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(stored variable name:- login));
	login.click();*/
			
	}

}
