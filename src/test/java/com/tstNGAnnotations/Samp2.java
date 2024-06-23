package com.tstNGAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Samp2 {

	@BeforeTest
	public void coconut() {

		System.out.println("BeforeTest");
	}

	@Test
	public void tenderCoconut() {

		System.out.println("Test");
	}

	@AfterTest
	public void overGrownCoconut() {

		System.out.println("AfterTest");
	}

	@BeforeMethod
	public void coconutWater() {

		System.out.println("BeforeMethod");
	}

	@AfterMethod
	public void coconutMilk() {

		System.out.println("AfterMethod");
	}

	@Test
	public void doubleCoconut() {

		System.out.println("Test");
	}
	@BeforeClass
	public void greenCoconut() {
		
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	public void greyCoconut() {
		
		System.out.println("AfterClass");
	}
	
	@BeforeSuite
	public void yellowCoconut() {
		
		System.out.println("BeforeSuite");
	}
	
	@AfterSuite
	public void redCoconut() {
		
		System.out.println("AfterSuite");
	}
	
}
