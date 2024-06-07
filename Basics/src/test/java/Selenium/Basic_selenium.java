package Selenium;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

 //io.github.bonigarcia.wdm.WebDriverManager;

public class Basic_selenium
{

	public static void main(String[] args)
	{
        // this is not req for new versions (WebDriverManager.chromedriver().setup();)
		
         WebDriver driver=new ChromeDriver();
         
         //launching url or app
         
         driver.get("https://www.amazon.in");
         
         // fetching the title
         
        String title = driver.getTitle();
        System.out.println(title);
        
        //to get url
        
       String url = driver.getCurrentUrl();
       System.out.println(url);
       
       //source code
       
       /*String source = driver.getPageSource();
       System.out.println(source);
       
       // maximizing the window
        
      /* Options opt = driver.manage();
       Window win = opt.window();
       win.maximize();*/
       
       // or 
       
       driver.manage().window().maximize();
       
    // minimizing the window
       
       /* Options opt = driver.manage();
        Window win = opt.window();
        win.minimize();*/
       
        // or 
        
        /*driver.manage().window().minimize();*/
        
        //to close current tab
       
       /* driver.close();*/
        
        
        // to close hole tab with browser
       
        /*driver.quit();*/
        
         
	}

}
