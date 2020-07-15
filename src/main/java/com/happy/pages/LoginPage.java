package com.happy.pages;

import com.happy.base.Page;

public class LoginPage extends Page {
	
	public ZohoAppPage doLogin(String username,String password) {
	type("email_XPATH", username);
	click("nextbtn_XPATH");
	type("password_XPATH", password);
	click("signbtn_XPATH");
		return new ZohoAppPage();
	}
	
	public void gotoSalesandMarketing() {
		
	}
	
	public void gotoFinance() {
		
	}
	
}
