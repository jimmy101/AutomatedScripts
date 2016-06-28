package com.androidDevices;

public class DeviceFactory {
	

	public DevicesInterface getDevice(String device){


		if(device.equalsIgnoreCase("Galaxy S6")){
			return new GalaxyS6();
		}

		if(device.equalsIgnoreCase("Nexus 5")){
			return new Nexus();
		}

		if(device.equalsIgnoreCase("Motorola G")){
			return new MotorolaG();
		}
		if(device.equalsIgnoreCase("Huawei7")){
			return new Huawei7();
		}
		return null;

	}

}
