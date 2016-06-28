package com.androidApps;

public class DaftApp implements AppInterface{

	@Override
	public String getAndroidPackage() {
		
		return "com.daft.ie";
	}

	@Override
	public String getAppActivity() {
	
		return "com.daft.ie.ui.main.MainActivity";
	}

}
