package com.check1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test1 {
	
	public static WebDriver driver;
	
	String sou = "Soundarrajan R";
	
	public static void launch (String value) {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(value);
	}
	
	public static String propRead(String data) {
		
		String value = null;
		
		try {
			File fle = new File("C:\\Users\\admin\\eclipse-workspace\\Adactin\\Test_Data\\config.properties");
			FileReader fr = new FileReader(fle);
			Properties prop = new Properties();
			prop.load(fr);
			
			value = prop.getProperty(data);
		}
		
		 catch (IOException e) {

			e.printStackTrace();
		}
		
		return value;
		
	
	}
	
	public static void main(String[] args) {
		
		
		
	}
	}


