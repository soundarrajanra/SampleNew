package com.check1;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
		
	public static WebDriver driver;
	
	public static void browserAmazon() {
		
		driver = new ChromeDriver();
		driver.get("https://cars.tatamotors.com/");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("(//*[contains(text(),'New Safari')])[1]"));
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true);",element);
	//js.executeScript("window.scrollTo(0,1500)");
	
	//js.executeScript("window.scrollBy(0,900)");
	
	//element.click();
			
		
	}
	
	
	public static void main(String[] args) {
		
		browserAmazon();
		
		
		
		
	}


}


//[^a-zA-Z] - AiiteXX
//[^a-z] - iite
//[a-z] - A456XX
//[A-Z] - iite456
//[^A-Z] - AXX
//[^A-Za-z] - AiiteXX