package Practice;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadDataFromPropertyFile 
{

	public static void main(String[] args) throws Throwable 
	{
		// path of document to fetching
        
        FileInputStream file = new FileInputStream("/Users/asrithchowdary/eclipse-workspace/AdvanceSeleniumFrameWork/src/test/resources/CommonData.properties");
        
//to load from the document
      Properties pro = new Properties();
      pro.load(file);
 //fetching data from file
    String URL = pro.getProperty("url");
   String USERNAME = pro.getProperty("username");
   String PASSWORD = pro.getProperty("password");
   
   System.out.println(URL);
   System.out.println(USERNAME);
   System.out.println(PASSWORD);
	}

}
