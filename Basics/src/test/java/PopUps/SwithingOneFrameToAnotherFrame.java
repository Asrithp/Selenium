package PopUps;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwithingOneFrameToAnotherFrame 
{
    @Test
	public void swithingOneFrameToAnotherFrame()
	{
       WebDriver driver= new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.switchTo().frame(1);
       //frame inside a frame we use  driver.switchTo().parentFrame();
       driver.findElement(By.xpath("//select[@class=\"selectnav\"]")).click();
       driver.findElement(By.xpath("//option[text()=\"- Telugu\"]")).click();
       driver.switchTo().parentFrame();
	}

}
