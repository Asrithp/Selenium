package Qspiders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount 
{

	public static void main(String[] args) 
	{
             WebDriver driver = new ChromeDriver();
             driver.get("https://student.qspiders.com/registration");
             driver.manage().window().maximize();
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
             driver.findElement(By.name("email")).sendKeys("");
	}

}
