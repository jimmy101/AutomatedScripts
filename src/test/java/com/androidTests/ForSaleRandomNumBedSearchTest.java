package com.androidTests;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class ForSaleRandomNumBedSearchTest extends BaseClass  {
	
	
	
	
	
	 
	 @Test
     public void forSaleSearchRandomNumBedrooms() throws Exception {
		 
		 Thread.sleep(5000);
		 System.out.println("second test");
    
		 driver.findElement(By.id("com.daft.ie:id/category_name")).click();
		 driver.findElement(By.id("com.daft.ie:id/btn_Left")).click();
		 Thread.sleep(3000);
		 String[] Areas = {"1 Bed", "2+ Beds", "3+ Beds", "4+ Beds", "5+ Beds"};
	     Random random = new Random();
	     int area = random.nextInt(Areas.length);
	     System.out.println(Areas[area]+area);
	     System.out.println("Area +1 "+area*2);
	     String Areaa= "//android.widget.TextView[@text='" + Areas[area] + "']";		 
		 driver.findElement(By.xpath(Areaa)).click();
		 Thread.sleep(1000);		 
		 driver.findElement(By.id("com.daft.ie:id/btn_SearchRefine")).click();
		 
	 WebElement element = driver.findElement(By.id("com.daft.ie:id/side_info_1"));
		 String num = element.getText();System.out.println(num+"cccccccccccccccc");
		 int actualNumber = Integer.parseInt(num);
		 System.out.println("Actual number is "+actualNumber+" the actual num - 1 is "+(actualNumber -1));
		 Assert.assertTrue((actualNumber -1)< actualNumber);
		 driver.swipe(665, 2315, 566, 821, 600);
		 element = driver.findElement(By.id("com.daft.ie:id/side_info_1"));
		 String num1 = element.getText();System.out.println(num1+"cccccccccccccccc");
		 int actualNumber1 = Integer.parseInt(num);
		 System.out.println("Actual number is "+actualNumber1+" the actual num - 1 is "+(actualNumber1 -1));
		 Assert.assertTrue((actualNumber1-1)< actualNumber1);
		 driver.swipe(665, 2315, 566, 821, 600);
		 element = driver.findElement(By.id("com.daft.ie:id/side_info_1"));
		 String num2 = element.getText();System.out.println(num2+"cccccccccccccccc");
		 int actualNumber2 = Integer.parseInt(num);
		 System.out.println("Actual number is "+actualNumber2+" the actual num - 1 is "+(actualNumber2 -1));
		 Assert.assertTrue((actualNumber2-1)< actualNumber2);
		 
	 
	 }
	 
	 @AfterClass
	    public void tearDown() throws Exception {
		 driver.quit();
	
	 }
	
   
}
