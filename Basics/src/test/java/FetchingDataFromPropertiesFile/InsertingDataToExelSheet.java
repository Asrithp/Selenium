package FetchingDataFromPropertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class InsertingDataToExelSheet 
{

	public static void main(String[] args) throws Throwable
	{
          FileInputStream fes = new FileInputStream("/Users/asrithchowdary/Downloads/datafatching.xlsx");
           
         Workbook book = WorkbookFactory.create(fes);
	     
         Sheet shee = book.getSheet("Sheet1");
         
        Row row = shee.createRow(6);
        
       Cell cel = row.createCell(5);
       
       cel.setCellValue("iphone 15");
	
FileOutputStream fos = new FileOutputStream("/Users/asrithchowdary/Downloads/datafatching.xlsx");
 
book.write(fos);
book.close();	
	}

}
