package FetchingDataFromPropertiesFile;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class FetchDataFromExel 
{
@Test
	public void fetchDataFromExel() throws Throwable
	{
// import poi and poi-ooxml from maveen respository
		
		
      FileInputStream fes = new FileInputStream("/Users/asrithchowdary/Downloads/datafatching.xlsx");
 //or     
      
           
        Workbook book = WorkbookFactory.create(fes);
        
       Sheet shet = book.getSheet("Sheet1");
       
       Row row = shet.getRow(7);
       
      Cell cell = row.getCell(6);
      
     String exeldata = cell.getStringCellValue();
     
     System.out.println(exeldata);
     
       
       
       
       
       
       
	}

}
