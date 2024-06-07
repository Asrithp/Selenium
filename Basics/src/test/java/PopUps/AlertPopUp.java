package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp
{

	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        //case:1
        /*driver.findElement(By.xpath("//button[text()=\"Click for JS Alert\"]")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();*/
        
        
        //case:2
       /* driver.findElement(By.xpath("//button[text()=\"Click for JS Confirm\"]")).click();
       Alert alret = driver.switchTo().alert();
       //alret.accept();
       //alret.dismiss();*/
        
        //case:3
        driver.findElement(By.xpath("//button[text()=\"Click for JS Prompt\"]")).click();
        Alert alret = driver.switchTo().alert();
        alret.sendKeys("hello");
        String text = alret.getText();
        alret.accept();
        System.out.println(text);
        
        
        
        
        
        
	}

}
