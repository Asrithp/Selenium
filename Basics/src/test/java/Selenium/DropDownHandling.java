package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling 
{

	public static void main(String[] args) throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement year = driver.findElement(By.id("yearbox"));
		year.click();
		year.sendKeys(Keys.ARROW_DOWN);
		year.sendKeys(Keys.ARROW_DOWN);
		year.sendKeys(Keys.ARROW_DOWN);
		
		WebElement month = driver.findElement(By.xpath("//select[@placeholder=\"Month\"]"));
		month.click();
		month.sendKeys(Keys.ARROW_DOWN);
		month.sendKeys(Keys.ARROW_DOWN);
		month.sendKeys(Keys.ARROW_DOWN);
		
		
		
		WebElement day = driver.findElement(By.id("daybox"));
		day.click();
		day.sendKeys(Keys.ARROW_DOWN);
		day.sendKeys(Keys.ARROW_DOWN);
		day.sendKeys(Keys.ARROW_DOWN);*/
		
//dropdown another method selectbyindex
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(2000);
		
		/*WebElement day = driver.findElement(By.xpath("//select[@title=\"Day\"]"));
		Select select = new Select(day);
		select.selectByIndex(22);
		
		WebElement month = driver.findElement(By.id("month"));
		Select select1 = new Select(month);
		select1.selectByIndex(7);
		
		WebElement year = driver.findElement(By.id("year"));
		Select select2 = new Select(year);
		select2.selectByIndex(1);*/
//or
		
//dropdown another method selectbyvalue
		
/*WebElement day = driver.findElement(By.xpath("//select[@title=\"Day\"]"));
		Select select = new Select(day);
		select.selectByValue("23");
		
		WebElement month = driver.findElement(By.id("month"));
		Select select1 = new Select(month);
		select1.selectByValue("8");
		
		WebElement year = driver.findElement(By.id("year"));
		Select select2 = new Select(year);
		select2.selectByValue("2001");*/
		
//dropdown another method selectbyvisabletext
		
		WebElement day = driver.findElement(By.xpath("//select[@title=\"Day\"]"));
		Select select = new Select(day);
		select.selectByVisibleText("23");
		
		WebElement month = driver.findElement(By.id("month"));
		Select select1 = new Select(month);
		select1.selectByVisibleText("Aug");
		
		WebElement year = driver.findElement(By.id("year"));
		Select select2 = new Select(year);
		select2.selectByVisibleText("2001");
		
		
	}
	
}
