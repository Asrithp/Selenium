package JavaScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google 
{

	public static void main(String[] args) 
	{
       
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/lifecycle/steps/signup/name?continue=https://mail.google.com/mail/&dsh=S-670225976:1713713917313030&flowEntry=SignUp&flowName=GlifWebSignIn&service=mail&theme=glif&TL=AEzbmxxieOabnJFc3XSJhEgV_ufKZ7MmB5F9Bmwv1goxQ4Xw9iGzJ0PTzwQbeXuf");
        String pass = "Qwet@23";
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.findElement(By.xpath("//input[@name=\"firstName\"]")).sendKeys("sai");
        driver.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys("krae");
        driver.findElement(By.xpath("//span[@jsname=\"V67aGc\"]")).click();
        driver.findElement(By.xpath("(//option[@value=\"3\"])[1]")).click();
        driver.findElement(By.xpath("//input[@id=\"day\"]")).sendKeys("9");
        driver.findElement(By.xpath("//input[@id=\"year\"]")).sendKeys("1995");
        driver.findElement(By.xpath("(//option[@value=\"1\"])[2]")).click();
        driver.findElement(By.xpath("(//div[@jsname=\"CeL6Qc\"])[1]")).clear();
        driver.findElement(By.xpath("//span[@jsname=\"V67aGc\"]")).click();
        driver.findElement(By.xpath("//input[@aria-label=\"Password\"]")).sendKeys(pass);
        driver.findElement(By.xpath("//input[@aria-label=\"Confirm\"]")).sendKeys(pass);
        driver.findElement(By.xpath("//div[@class=\"VfPpkd-RLmnJb\"]")).click();
        
	}

}
