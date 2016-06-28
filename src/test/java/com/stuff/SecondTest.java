package com.stuff;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SecondTest {
	
	public static IOSDriver<MobileElement>driver;
	
	@BeforeClass
	public void setUp() throws Exception{
	
	  File app = new File("/Users/james/Library/Developer/Xcode/DerivedData/Daft-gjuiwuireksavbdrudvnepggxarj/Build/Products/Debug-iphonesimulator/Daft.Debug.app");
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"");
	  capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9.3.1");
	  capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"iOS");
	  capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"james's iPhone");
	  capabilities.setCapability("udid","a5d1d4a6e8558ac7f5df08dbdf2b7969d0c9d022");
	  capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	  
	  driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	  
	  
	
	  
	  
	
	}
	
	
  @Test
  public void f() {
	  
	  driver.findElementByXPath("//*[@name=\"My Daft\"]").click();
	  driver.findElementByXPath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[2]/UIATextField[1]").sendKeys("jimjim101");
	  driver.findElementByXPath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[3]/UIASecureTextField[1]").sendKeys("jimjim101");
	  driver.findElementByXPath("//*[@name=\"Login\"]").click();
	  driver.findElementByXPath("//*[@name=\"For sale\"]").click();
	  
  }
}
