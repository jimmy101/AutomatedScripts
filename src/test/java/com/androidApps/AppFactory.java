package com.androidApps;



public class AppFactory {
	
	public AppInterface getDevice(String app){


		if(app.equalsIgnoreCase("Daft.ie")){
			return new DaftApp();
		}

		if(app.equalsIgnoreCase("MyHome.ie")){
			return new MyHomeApp();
		}
		return null;
	}

}
