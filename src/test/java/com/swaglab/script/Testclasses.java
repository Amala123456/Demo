package com.swaglab.script;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.swaglabconstant.Automationconstants;
import com.swaglabpages.Loginpagee;
import com.swaglabsutility.ExcelUtility;

public class Testclasses extends Testbases {
Loginpagee objLogin;
	
	@Test(priority=0)
    public void verifyValidLogin() throws IOException {
    //Create Login Page object
    objLogin = new Loginpagee(driver);
    //login to application

    String username = ExcelUtility.getCellData(0, 0);
    String password = ExcelUtility.getCellData(0, 1);
    objLogin.setUserName(username);
    objLogin.setPassword(password);
    objLogin.clickLogin();
    String expectedTitle =Automationconstants.HOMEPAGETITLE;
    String actualTitle =driver.getTitle();
    Assert.assertEquals(expectedTitle,actualTitle);
    }


}
