package com.tstNGAnnotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XBrowser {
	
	
	@Test
	@Parameters("Browser")
	public void browser1(String brs) {
		
		WebDriver driver = null;
		
		if (brs.equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.google.com");
			System.out.println("XBrowser Chrome is executed");
			System.out.println(Thread.currentThread().getId());
			
		}else if (brs.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get("https://www.google.com");
			System.out.println(Thread.currentThread().getId());
			System.out.println("XBrowser Edge is executed");
			
		}}
		
	@Test
		public void browser2() {
			
			System.out.println("Funky");
			System.out.println(Thread.currentThread().getId());
			
		}
		
	}


