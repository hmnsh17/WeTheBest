package com.happy.testcases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.happy.pages.HomePage;
import com.happy.pages.LoginPage;
import com.happy.pages.ZohoAppPage;
import com.happy.utilities.TestUtil;

public class LoginTest extends BaseTest {
	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void loginTest(Hashtable<String,String> data) {
		
		//Using plugin
		HomePage home=new HomePage();
		LoginPage lp=home.goToLogin();
		ZohoAppPage zp=lp.doLogin(data.get("username"), data.get("password"));
		Assert.fail("Failed due to login issue");
	}
}
