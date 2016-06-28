package com.androidTests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class LogInLogoutTest extends BaseClass{
	
	 
	    @Test
		public void loginLogout() throws Exception {
			
			Thread.sleep(5000);		
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
