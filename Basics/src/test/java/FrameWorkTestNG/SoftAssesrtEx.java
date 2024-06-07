package FrameWorkTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssesrtEx
{
    @Test
	public void softAssesrtEx()
	{
         System.out.println("asrith");
         System.out.println("Bobby");
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(true, false);
         System.out.println("ramoji");
         System.out.println("Chowdary");
         System.out.println("kumar");
         soft.assertAll();
	}
     @Test
	public void m1()
	{
		String exdata = "Asrith";
		String actdata = "Asrith";
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(exdata, actdata);
		soft.assertAll();
	}
	
	
	
	
}
