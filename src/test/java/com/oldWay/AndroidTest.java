package com.oldWay;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


public class AndroidTest{
	
	AndroidDriver driver;
	String URL;

	
		
	@BeforeClass
	public void setcapabilities() throws MalformedURLException {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();		
		capabilities.setCapability("deviceName","Galaxy S6");	
		capabilities.setCapability("udid", "0815f83236962004");
		capabilities.setCapability("androidPackage", "com.daft.ie");
		capabilities.setCapability("appActivity", "com.daft.ie.ui.main.MainActivity");		
		capabilities.setCapability("automationName","Appium");		
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("browserName", "");
		capabilities.setCapability("platformVersion","5.1.1");
		URL = "http://127.0.0.1:4723/wd/hub";
		driver = new AndroidDriver(new URL(URL), capabilities);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	}


	 @Test(priority = 1)
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
	 
	 @Test(priority = 2)
		public void loginLogout() throws Exception {
			
			//Thread.sleep(5000);		
			driver.findElement(By.id("com.daft.ie:id/login_or_welcome_text")).click();			
			driver.findElement(By.id("com.daft.ie:id/login_username")).sendKeys("jimjim101");
			driver.findElement(By.id("com.daft.ie:id/login_password")).sendKeys("jimjim101");			
			driver.findElement(By.id("com.daft.ie:id/login_button")).click();
			Thread.sleep(1000);
			WebElement element = driver.findElement(By.id("com.daft.ie:id/login_or_welcome_text"));
			String strng = element.getText();
			System.out.println(strng);
			Assert.assertEquals("Welcome\nJames", strng);
			Thread.sleep(1000);
			driver.findElement(By.id("com.daft.ie:id/main_mydaft_label")).click();	
			Thread.sleep(4000);
			driver.swipe(540, 1209, 551, 544, 600);
			driver.findElement(By.id("com.daft.ie:id/openSettingsText")).click();		    
			driver.findElement(By.id("com.daft.ie:id/settings_logout_button")).click();
			Thread.sleep(1000);	
			driver.findElement(By.id("android:id/button1")).click();
			
			
		}
   
	

	
	
	
	@AfterClass
	public void tearDown() throws Exception {

		
		driver.quit();
	}
}
