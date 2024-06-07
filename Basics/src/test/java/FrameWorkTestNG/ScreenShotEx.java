package FrameWorkTestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShotEx 
{
      @Test
      
	public void screenShotEx() throws Throwable
	{
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.amazon.in");
      TakesScreenshot ss = (TakesScreenshot)driver;
      File src = ss.getScreenshotAs(OutputType.FILE);
     File dest = new File("failedScripts.png");
     FileUtils.copyFile(src, dest);
	}

}
