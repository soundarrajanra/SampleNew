package com.tstNGAnnotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Samp3 {
	
	@Test
	@Parameters("Browser")
	public void browser1(String brs) {
		
		WebDriver driver = null;
		
		if (brs.equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.google.com");
			
			System.out.println(Thread.currentThread().getId());
			System.out.println("Samp3 Chrome is executed");
			}
		}
		
	@Test
		public void browser2() {
			
			System.out.println("Samp3 Funky Money");
			System.out.println(Thread.currentThread().getId());
			
		}
		
	}

