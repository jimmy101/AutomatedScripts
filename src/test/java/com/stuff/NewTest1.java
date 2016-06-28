package com.stuff;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import java.io.File;
import java.net.URL;
import java.util.Random;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest1 {
	public static IOSDriver<MobileElement> driver;


	@BeforeClass
	public void setUp() throws Exception {


		File app = new File("/Users/james/Library/Developer/Xcode/DerivedData/Daft-gjuiwuireksavbdrudvnepggxarj/Build/Products/Debug-iphonesimulator/Daft.Debug.app");

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.3.2");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "James’s iPhone");
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		capabilities.setCapability("udid","a5d1d4a6e8558ac7f5df08dbdf2b7969d0c9d022");

		driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		




	}


	@Test(priority = 1)
	public  void Registration() throws Exception {
		
		//Generating Random Text
				int leftLimit = 97; 
			    int rightLimit = 122; 
			    int targetStringLength = 3;
			    StringBuilder buffer = new StringBuilder(targetStringLength);
			    for (int i = 0; i < targetStringLength; i++) {
			        int randomLimitedInt = leftLimit + (int) 
			          (new Random().nextFloat() * (rightLimit - leftLimit));
			        buffer.append((char) randomLimitedInt);
			    }
			    String generatedString = buffer.toString();
			 
			    System.out.println(generatedString);
				
				//Registration
				driver.findElement(By.xpath("//*[@name=\"Login\"]")).click();
				driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[4]/UIAButton[1]")).click();
				driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[2]/UIATextField[1]")).sendKeys("iostest" + generatedString);
				driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[3]/UIASecureTextField[1]")).sendKeys("iostest1" + generatedString);
				driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[4]/UIATextField[1]")).sendKeys("iostest" + generatedString + "@gmail.com");
		
		
		}
	
	
	
	
	@Test(priority = 2)
	public  void Rental_AdCreation() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATabBar[1]/UIAButton[4]")).click();
	}
}
