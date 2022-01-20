package com.helper.com;

public class file_ReadManager {
	
	public static  file_ReadManager getInstanceFR() {
		 file_ReadManager fr = new  file_ReadManager();
		return fr;
	}

	public  configuration_Reader getInstanceCR() throws Throwable {
		configuration_Reader cr = new configuration_Reader();
		return cr;

	}

	

}
