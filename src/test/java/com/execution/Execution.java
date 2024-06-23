package com.execution;

import java.io.FileNotFoundException;

import org.junit.Test;

import com.page_execution.Login_Page_Execution;

public class Execution extends Login_Page_Execution {
	
	@Test
	public void login_exec() throws InterruptedException {
		
		try {
			openWebsite();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		enter_User_Name();
		//enter_User_password();
	}

}
