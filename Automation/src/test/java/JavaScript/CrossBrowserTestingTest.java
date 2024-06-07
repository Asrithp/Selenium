package JavaScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class CrossBrowserTestingTest 
{

	WebDriver driver;
	
  @Test
  public void Tc1Test() 
  {
    
	  
	  
	  
	  
	  
  }

@BeforeClass()

public void beforecalss()
{
	driver  = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("");
}

@AfterClass()

public void Afterclass() 
{
	driver.quit();
}








}
