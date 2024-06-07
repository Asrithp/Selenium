package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragDropFramesPopUps 
{

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		/*driver.get("https://jqueryui.com/droppable/");
		
//iframe with index value
		driver.switchTo().frame(0);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
	 Actions dd = new Actions(driver);
	 dd.dragAndDrop(drag, drop).perform();*/
	 
		
//1)swithing and sending values
		driver.get("https://demo.automationtesting.in/Frames.html");
		/*driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("hello");*/
	 
		
//2)frame by using string id and name only possible
		/*driver.switchTo().frame("singleframe");
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("asrith");*/
		
		
//3)frame by using web element
	 WebElement ele = driver.findElement(By.xpath("//iframe[@name=\"SingleFrame\"]"));
	 driver.switchTo().frame(ele);
	 driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("asrith");	 
	}

}
