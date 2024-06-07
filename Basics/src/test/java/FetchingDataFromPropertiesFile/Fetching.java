package FetchingDataFromPropertiesFile;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetching 
{

	public static void main(String[] args) throws Throwable 
	{
          WebDriver driver= new ChromeDriver();
          
          
          
// path of document to featch
          
        FileInputStream file = new FileInputStream("/Users/asrithchowdary/Desktop/ProprtiesData.properties.applescript");
        
//to load from the document
      Properties pro = new Properties();
      pro.load(file);
 //fetching data from file
    String URL = pro.getProperty("url");
   String USERNAME = pro.getProperty("username");
   String PASSWORD = pro.getProperty("password");
   
   driver.get(URL);
   
   
   driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys(USERNAME);
   driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(PASSWORD);
   driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
   
     
	}

}
