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

public class FetchingEx 
{

	public static void main(String[] args) throws Throwable
	{
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		 FileInputStream fes = new FileInputStream("/Users/asrithchowdary/Downloads/datafatching.xlsx");
		 //or     
		      
		           
		        Workbook book = WorkbookFactory.create(fes);
		        
		       Sheet shet = book.getSheet("Sheet1");
		       
		       Row row = shet.getRow(0);
		       
		      Cell cell = row.getCell(0);
		      
		     String exeldata = cell.getStringCellValue();
		     
		     driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys(exeldata);
		     
	}

}
