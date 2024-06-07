package Practice;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelFile 
{

	public static void main(String[] args) throws Throwable 
	{
         //step:1 open the document in java readable format
		FileInputStream fi = new FileInputStream("/Users/asrithchowdary/Downloads/datafatching.xlsx");
		
		//step:2 create workbook
		Workbook wb = WorkbookFactory.create(fi);
		
		//step:3 Navigate to required sheet
		Sheet sh = wb.getSheet("Sheet1");
		
		//step:4 Navigate to required row
		Row rw = sh.getRow(0);
		
		// step:5 Navigate to required cell
		Cell cl = rw.getCell(0);
		
		//step:6 Capture the Data 
		String value = cl.getStringCellValue();
		System.out.println(value);
		
		// step: 7 close the workbok
		wb.close();
		
		
	}

}
