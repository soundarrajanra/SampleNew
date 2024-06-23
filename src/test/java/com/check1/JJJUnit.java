package com.check1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JJJUnit {
	
	
	@BeforeClass
	public static void moon() {
		
		System.out.println("Beautiful Moon");
	}
	@AfterClass
	public static void sun() {
		
		System.out.println("Warmth Sun");
	}
	@Test
	public void fullMoonDay() {
		
		System.out.println("It is a wonderful full moon day");
	}
	@Before
	public void newMoon() {
		
		System.out.println("It is a dark new moon day");
	}
	@After
	public void allDay() {
		
		System.out.println("every day is a wonderful day");
	}
	@Test
	public void auspicious() {
		System.out.println("It is a wonderful auspicious day");
	}
	
}
