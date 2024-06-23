package com.tstNGAnnotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailCases {

	
	@Test(retryAnalyzer = Retries.class)
	public void pen() {
		
		Assert.assertTrue(false);
		System.out.println("Assert True Condition");
	}
	
	@Test
	public void pencil() {
		
		System.out.println("I'm method of pencil");
	}
	
	
}
