package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basePack.Utility;

public class Login_Page_Locators extends Utility {
	
	public Login_Page_Locators(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement usrname;
	
	@FindBy(id="password")
	private WebElement password;

	@FindBy(id="login")
	private WebElement login;
	
	
	public WebElement getUsrname() {
		return usrname;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
	
	
	
	
}
