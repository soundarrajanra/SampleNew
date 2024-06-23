package com.tstNGAnnotations;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Samp {
	
	
	@Test(groups={"group1"}, priority=1)
	@Parameters({"userName", "password"})
	public void orange(String user, String pword) {
		
		System.out.println(user + pword);
	}
	
	@Test(groups={"group2"}, priority=2)
	@Parameters({"location"})
	public void guava(String loca) {
		
		System.out.println(loca);
		
	}

}
