package FrameWorkTestNG;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POMRepo.FlipkartProduct;

public class Ex2 
{
     @Test
		public void ex2() throws Throwable
		{
	       FileInputStream fil = new FileInputStream("/Users/asrithchowdary/Downloads/datafatching.xlsx");
		  Workbook book = WorkbookFactory.create(fil);
		 Sheet shee = book.getSheet("Sheet1");
		 Row row = shee.getRow(0);
		Cell cell = row.getCell(1);
		String url = cell.getStringCellValue();
		System.out.println(url);
		
		Row row1 = shee.getRow(6);
		Cell cell1 = row1.getCell(5);
		String mob = cell1.getStringCellValue();
		System.out.println(mob);
		
		 
		WebDriver driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	      FlipkartProduct pro = new FlipkartProduct(driver);
	      pro.getSearchBar().sendKeys(mob,Keys.ENTER);
	      pro.getIphone().click();

	      Set<String> AllId = driver.getWindowHandles();
	       for (String Id : AllId)
	         {
		       driver.switchTo().window(Id);
		       String title = driver.getTitle();
		       System.out.println(title);
		       if (title.contains("Apple iPhone 15")) 
		          {
			        break;
		          }
	         }
	      String name = pro.getName().getText();
	      String price = pro.getPrice().getText();

	 	 Sheet shee1 = book.getSheet("Sheet2");

	     Row row3 = shee1.createRow(11);
	    Cell cell3 = row3.createCell(8);
	  cell3.setCellValue(name);
	  System.out.println(name);
	  
	  
	  Row row4 = shee1.createRow(12);
	 Cell cell4 = row4.createCell(9);
	 cell4.setCellValue(price);
	 System.out.println(price);
	  
	  
	   
	  FileOutputStream fil1 = new FileOutputStream("/Users/asrithchowdary/Downloads/datafatching.xlsx");
	  book.write(fil1);
	  book.close();
	}

}
