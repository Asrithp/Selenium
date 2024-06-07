package JavaScript;

//JavaScript.NewTest (this is package name.class name add to testng.xml file in class name)

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test
  public void f() 
  {
	  System.out.println("main test cases area");
  }
  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("pre condition area");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("post condition area");
	  
  }

  @BeforeMethod
  public void beforemethod() 
  {
	System.out.println("before method page url");  
  }
  @AfterMethod
  public void aftermethod()
  {
	  System.out.println("after method to close page or quit browser");
	  
  }
  
  
  
  
  
  
}
