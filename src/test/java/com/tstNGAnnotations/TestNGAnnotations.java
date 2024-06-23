package com.tstNGAnnotations;

import org.testng.annotations.Test;

public class TestNGAnnotations {

	@Test(priority = 0)
	public void onion() {

		System.out.println("This is a method of onion");
	}
	
	@Test(priority = 1, groups="group1")
	public void tomato() {

		System.out.println("This is method of tomato");
	}
	@Test(priority = 3, groups={"group1", "group2"})
	public void brinjal() {

		System.out.println("this is method of brinjal");
	}
	@Test(priority = 2)
	public void radish() {

		System.out.println("this is method of radish");
	}
	@Test(priority = 4, groups="group1")
	public void spinach() {

		System.out.println("this is method of spinach");
	}

}
