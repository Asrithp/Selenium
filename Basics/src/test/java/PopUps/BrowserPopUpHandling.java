package PopUps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class BrowserPopUpHandling 
{

	public static void main(String[] args)
	{
		
//handling the browser popup
	/*	 ChromeOptions hand = new ChromeOptions();
		hand.addArguments("--disable-notifications");
		
        WebDriver driver =new ChromeDriver(hand);
        driver.get("https://www.irctc.co.in/nget/train-search");*/
        
 //incognito lanching
    /*  ChromeOptions ing = new ChromeOptions();
      ing.addArguments("incognito");
      
      WebDriver driver=new ChromeDriver(ing);
      driver.get("https://www.flipkart.com");*/
		
//private lanching
		/*SafariOptions pri = new SafariOptions();
		pri.add
		
		
		SafariDriver driver = new SafariDriver(pri);
	      driver.get("https://www.flipkart.com");
	      
	      
//edge
	   /* EdgeOptions priva = new EdgeOptions();
	    priva.addArguments("InPrivate");
	    
	   EdgeDriver driver = new EdgeDriver(priva);
	   driver.get("https://www.flipkart.com");*/

	}

}
