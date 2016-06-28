package com.androidTests;

import io.appium.java_client.android.AndroidDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import com.androidApps.AppFactory;
import com.androidDevices.DeviceFactory;

public class BaseClass {	
	AndroidDriver driver ;
	String URL;
	





	@BeforeClass
	public void setUp()  throws Exception{					
		DeviceFactory device = new DeviceFactory() ;
		AppFactory app = new AppFactory();
		
		
		
		DesiredCapabilities capabilities = new DesiredCapabilities(); 
		capabilities.setCapability("deviceName", device.getDevice("Galaxy S6").getDeviceName());
		capabilities.setCapability("udid",  device.getDevice("Galaxy S6").getUdid());
		capabilities.setCapability("platformName",device.getDevice("Galaxy S6").getPlatformName());
		capabilities.setCapability("androidPackage", app.getDevice("Daft.ie").getAndroidPackage()); 
		capabilities.setCapability("appActivity",  app.getDevice("Daft.ie").getAppActivity());	
		capabilities.setCapability("automationName", "Appium");
		
		
		URL = "http://127.0.0.1:4723/wd/hub";		
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(20L,TimeUnit.SECONDS);
		

	}







}
