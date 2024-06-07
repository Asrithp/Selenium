package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentBB 
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.bigbasket.com/");
        driver.findElement(By.xpath("(//input[contains(@class,\"flex-1\")])[2]")).sendKeys("lays");
       List<WebElement> all = driver.findElements(By.xpath("//span[contains(@class,\"Label-sc-15v1nk5-0 QuickSearch___StyledLabel2-s\")]"));
        for (WebElement water : all) 
       {
			System.out.println(water.getText());
			if (water.getText().contains("West Indies Hot N Sweet Potato Chips - Crispy Chips & Snacks")) 
			{
				water.click();
				break;
			}
	   }
	WebElement name = driver.findElement(By.xpath("//h1[@class=\"Description___StyledH-sc-82a36a-2 bofYPK\"]"));
	String pro = name.getText();
	System.out.println("product name :-" +pro);
	WebElement amount = driver.findElement(By.xpath("//td[@class=\"Description___StyledTd-sc-82a36a-4 fLZywG\"]"));
	String amo = amount.getText();
	System.out.println("amount:- "+amo );
	driver.quit();
	}
}
