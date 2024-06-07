package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assginment 
{

	public static void main(String[] args)
	{
        WebDriver driver = new ChromeDriver();
        /*driver.get("https://www.flipkart.com/account/login");
        //1)getcssvalue
        WebElement col = driver.findElement(By.xpath("//span[text()=\"Login\"]"));
       String color = col.getCssValue("color");
        System.out.println(color);
        WebElement siz = driver.findElement(By.xpath("//span[text()=\"Login\"]"));
        String size = col.getCssValue("font-size");
         System.out.println(size);
        
        //2)sendkeys,3)clear
       WebElement clas = driver.findElement(By.xpath("//label[@class=\"_1fqY3P\"]"));
       clas.sendKeys("9493621039");
       clas.clear();
       clas.sendKeys("8008529943");*/
        
        //4)submit 
        /*driver.get("https://www.amazon.in");
        WebElement search = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        search.sendKeys("nike");
        search.submit();*/
        
        //5)click
       /* driver.get("https://www.saucedemo.com/v1/");
        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@value=\"LOGIN\"]")).click();
        
        //6)getlocation-----x-axis,y-axis
        /*driver.get("https://www.facebook.com/");
       WebElement loc = driver.findElement(By.xpath("//*[text()=\"తెలుగు\"]"));
      Point location = loc.getLocation();
      System.out.println(location.getX());
      System.out.println(location.getY());*/
      
      //7)getsize
       /* WebElement siz = driver.findElement(By.xpath("//*[text()=\"తెలుగు\"]"));
        Dimension size = siz.getSize();
       System.out.println(size.getHeight());
       System.out.println(size.getWidth());*/
        
       // 8)getrect commbination 6 & 7
        /*WebElement rec = driver.findElement(By.xpath("//*[text()=\"తెలుగు\"]"));
       Rectangle rect = rec.getRect();
       System.out.println(rect.getX());
       System.out.println(rect.getY());
       System.out.println(rect.height);
       System.out.println(rect.width);*/
        
        
         //9)isdisplayed
      //driver.get("https://www.amazon.in");
       /* WebElement logo = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        if(logo.isDisplayed())
        {
        	System.out.println("logo is displayed");
        }
        else
        {
        	System.out.println("logo is not displayed");
        }*/

        //10)isenbled
     /* WebElement textBox = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
      if(textBox.isEnabled())
      {
    	  System.out.println("is enabled");
      }
      else
      {
    	  System.out.println("not enabled");
      }*/
      
      //11)isselected
        /*driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
        WebElement radio = driver.findElement(By.xpath("//input[@value=\"2\"]"));
        if(radio.isSelected())
        {
        	System.out.println("selected");
        }
        else
        {
        	System.out.println("not selected");
        }*/
        
        //12)getattribute
        //driver.get("https://www.amazon.in");
     /* attribute = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        System.out.println(attribute.getAttribute("name"));
        //if not present it will show null*/
        
      
        //13)gettagname  html tag name
      /* WebElement element = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        System.out.println(element.getTagName());*/
        //need to run this
       
        
        
        //14)getaccessiblename   visable text will print  or shown text on web element
      /* driver.get("https://www.facebook.com/");
       WebElement name = driver.findElement(By.xpath("//input[@aria-label=\"Email address or phone number\"]"));
        System.out.println(name.getAccessibleName());*/
        
        
        
        //15)getariarole  what type of attribute it is
       /* System.out.println(name.getAriaRole());*/
        
        
        //16)gettext
       // driver.get("https://www.amazon.in");
       /*String name = driver.findElement(By.xpath("//a[@data-csa-c-slot-id=\"nav_cs_1\"]")).getText();
        System.out.println(name);*/
        
        
        //17)getdomattribute     if we give attribute name it will print attribute value, it will get from the dom document
      /* WebElement name = driver.findElement(By.xpath("//a[@data-csa-c-slot-id=\"nav_cs_1\"]"));
        System.out.println(name.getDomAttribute("class"));*/

       
        //18)getdomproperties    it will get value from properties
       /* System.out.println(name.getDomProperty("baseURI"));*/
        
        
        driver.quit();
	}

}
