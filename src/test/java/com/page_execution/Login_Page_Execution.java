package com.page_execution;

import java.io.FileNotFoundException;

import org.junit.Test;

import com.basePack.Utility;
import com.locators.Login_Page_Locators;

public class Login_Page_Execution extends Login_Page_Locators {

	
	public void openWebsite() throws FileNotFoundException {

			Utility.browserLaunch(readProperTyFile("URL"));
	}
	
	public void enter_User_Name() throws InterruptedException{

		sendValues(getUsrname(),Utility.readProperTyFile("adactinUserName"));
	}
	
	public void enter_User_password(){

		sendValues(getPassword(),Utility.readProperTyFile("adactniPassword"));
	}

}
