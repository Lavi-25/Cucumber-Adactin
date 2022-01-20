package com.helper.com;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class configuration_Reader {
	
public static Properties j;
	
	public configuration_Reader() throws Throwable {
		
		File f=new File("C:\\Users\\HP\\eclipse-workspace\\Projectabc\\src\\test\\java\\com\\prop\\com\\Adactinprop.properties");
		FileInputStream Fis=new FileInputStream(f);
		
		 j=new Properties();
		j.load(Fis);	
	}
	public String getbroswer() {
		
	 String u=j.getProperty("browser");
	 return u;
	 
	}
     public String geturl() {
    	 
    	 String f=j.getProperty("url");
    	 return f;
		
	}
     public String username() {
    	 String b=j.getProperty("username");
    	 return b;
		
	}
     public String password() {
    	 String c=j.getProperty("password");
    	 return c;
	}

	

}
