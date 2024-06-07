package FetchingDataFromPropertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMRepo.LoginPage;

public class FetchigFromPOM 
{

	public void fetchigFromPOM() throws Throwable
	{
		FileInputStream fil = new FileInputStream("/Users/asrithchowdary/Downloads/datafatching.xlsx");
        
	       Workbook book = WorkbookFactory.create(fil);
	      Sheet sheet = book.getSheet("Sheet1");
	      
	     Row row = sheet.getRow(0);
	   Cell cell = row.getCell(0);
	  String username = cell.getStringCellValue();
	  System.out.println(username);
	  
	  
	 Row row1 = sheet.getRow(1);
	Cell cell1 = row1.getCell(0);
	String password = cell1.getStringCellValue();
	System.out.println(password);



	Row row2 = sheet.getRow(2);
	Cell cell2 = row2.getCell(0);
	String url = cell2.getStringCellValue();
	System.out.println(url);


	WebDriver driver = new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	
	LoginPage login = new LoginPage(driver);
	login.getUserTextField().sendKeys(username);
	login.getPasswordTextField().sendKeys(password);
	login.getLoginButton().click();
	
	
	
	/*driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys(username);
	 driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(password);
	 driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();*/
	 
	 
	}

}
