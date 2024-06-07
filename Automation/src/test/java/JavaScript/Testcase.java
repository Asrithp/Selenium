package JavaScript;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Testcase 
{
	WebDriver driver;
	
	
  @Test(priority = 0)                        //(groups = {"Smoke" ,"Functional"})                //(enabled = false) it used to stop certain test case
  public void Tc1()
  {
	  driver.findElement(By.xpath("//img[@alt=\"Mobiles\"]")).click();
	  
	  String title = driver.getTitle();
	  System.out.println("page title is  "+title);
	  
	  //to verify actual and expected
	  AssertJUnit.assertEquals(title, "Mobile Phones Online at Best Prices in India");
	  
	  
	 System.out.println("Tc1");
  }
  
  
  @Test(priority = 1)             //(groups = "Functional") this name used in testng xml file       //(dependsOnMethods = "Tc1") it used for dependency on other test case
  public void Tc2()
  {

	 String name = driver.findElement(By.xpath("(//a[@title=\"Apple iPhone 15 (Black, 128 GB)\"])[2]")).getText();
	  
	  System.out.println(name);
	  
	 String price = driver.findElement(By.xpath("(//div[@class=\"hl05eU\"])[26]")).getText();
  
	 System.out.println(price);
	 System.out.println("Tc2");
  }
  
  @Test(priority = -1)
  public void Tc3() 
  {
	  System.out.println("abhi ram 2525");
  }
  
  
  @BeforeClass(alwaysRun = true)     // here use alwaysRun = true

  public void beforeClass()
  {
	  driver = new ChromeDriver(); 
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.flipkart.com/");
  }

  
  
 
  @AfterClass(alwaysRun = true)
  public void afterClass() 
  {
    driver.quit();
  }

}
