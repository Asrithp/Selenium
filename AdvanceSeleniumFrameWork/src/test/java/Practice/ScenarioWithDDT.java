package Practice;

import java.io.FileInputStream;


import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScenarioWithDDT {

	public static void main(String[] args) throws Exception 
	{
//step:1 ReadDataFromPropertyFile
        
        FileInputStream file = new FileInputStream("/Users/asrithchowdary/eclipse-workspace/AdvanceSeleniumFrameWork/src/test/resources/CommonData.properties");
        

      Properties pro = new Properties();
      pro.load(file);

    String URL = pro.getProperty("url");
   String USERNAME = pro.getProperty("username");
   String PASSWORD = pro.getProperty("password");
   
   System.out.println(URL);
   System.out.println(USERNAME);
   System.out.println(PASSWORD);
		
// step:2 ReadDataFromExcelFile test data
		
   FileInputStream fi = new FileInputStream("/Users/asrithchowdary/Downloads/datafatching.xlsx");
	
	Workbook wb = WorkbookFactory.create(fi);
	
	Sheet sheet = wb.getSheet("Sheet1");
	
	      //shortcut for reading data
	String FRISTNAME = sheet.getRow(0).getCell(0).toString();
	String LASTNAME = sheet.getRow(1).getCell(0).toString();
	
	  //To remove the decimal point and trailing zero from the PINCODE value
	
	   double PINCODENO = sheet.getRow(2).getCell(0).getNumericCellValue();
	    String PINCODE = Integer.toString((int)PINCODENO);
	    
	String CON = sheet.getRow(3).getCell(0).toString();
    System.out.println(FRISTNAME);
    System.out.println(LASTNAME);
    System.out.println(PINCODE);
    System.out.println(CON);

//step:3 code
    
    WebDriver driver=new ChromeDriver();
    driver.get(URL);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys(USERNAME);
    driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(PASSWORD);
    driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
    driver.findElement(By.xpath("(//button[@class=\"btn_primary btn_inventory\"])[1]")).click();
    driver.findElement(By.xpath("(//button[@class=\"btn_primary btn_inventory\"])[3]")).click();
    driver.findElement(By.className("shopping_cart_link")).click();
    driver.findElement(By.xpath("//a[@class=\"btn_action checkout_button\"]")).click();
    driver.findElement(By.id("first-name")).sendKeys(FRISTNAME);
    driver.findElement(By.id("last-name")).sendKeys(LASTNAME);
    driver.findElement(By.id("postal-code")).sendKeys(PINCODE);
    driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
    
        //scroll By
    
    Thread.sleep(3000);
   JavascriptExecutor js = (JavascriptExecutor)driver;
   js.executeScript("window.scrollBy(0,200)");
    
   
   driver.findElement(By.xpath("//a[@class=\"btn_action cart_button\"]")).click();
    String conf = driver.findElement(By.xpath("//div[@class=\"subheader\"]")).getText();
   
   if (conf.contains(CON)) 
   {
		System.out.println("PASS - order successfully placed");
	  }
   else
   {
		System.out.println("FAIL - order not placed");
	  }
    driver.findElement(By.xpath("//button[text()=\"Open Menu\"]")).click();
    driver.findElement(By.id("logout_sidebar_link")).click();
   
    
    driver.quit();
   
	}

}
