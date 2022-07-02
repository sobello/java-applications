package com.session.six;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertyExample {
static Properties properties;
	static {
		try{
			properties = new Properties();
			properties.load(new FileInputStream("configuration.properties"));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static String getProperty(String key) {
		return properties.getProperty(key);
	}
	
}
