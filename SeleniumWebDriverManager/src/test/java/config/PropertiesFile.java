package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import selenium_test.SeleniumTest;

public class PropertiesFile {
	
	static Properties properties = new Properties();
	static String pathProject = "C:\\Users\\Igor\\git\\SeleniumWebDriverManager\\SeleniumWebDriverManager";
	
	public static void main(String[] args) {
		readPropertiesFile();
		writePropertiesFile();
//		readPropertiesFile();
	}
	
	public static void readPropertiesFile() {
		
		try {
			InputStream inputStream = new FileInputStream(pathProject+"\\src\\test\\java\\config\\config.properties");
			properties.load(inputStream);
//			System.out.println(properties.getProperty("browser"));
			SeleniumTest.browser = properties.getProperty("browser");
			System.out.println(SeleniumTest.browser);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void writePropertiesFile() {
		try {
			OutputStream outputStream = new FileOutputStream(pathProject+"\\src\\test\\java\\config\\config.properties");
//			properties.setProperty("browser", "Chrome");
			properties.setProperty("result", "pass");
			properties.store(outputStream, "set browser = Chrome");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
