package com.happy.accounts;

import com.happy.base.Page;

public class CreateAccountPage extends Page {
	
	public void CreateAccount(String accountName) {
		type("crtacc_XPATH",accountName);
		
	}

}
