package com.swaglabpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpagee {
	WebDriver driver;
	@FindBy(id="user-name")
	private WebElement username;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(id="login-button")
	private WebElement login;
	public Loginpagee(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//set username
	public void setUserName(String strUserName){
	       username.sendKeys(strUserName);
	 }
	//Set password in password textbox
    public void setPassword(String strPassword){
       password.sendKeys(strPassword);
    }
  //Click on login button
    public void clickLogin(){
            login.click();
    }  
}
