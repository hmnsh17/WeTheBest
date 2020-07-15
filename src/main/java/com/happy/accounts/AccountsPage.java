package com.happy.accounts;


import com.happy.base.Page;

public class AccountsPage extends Page {
	public CreateAccountPage gotoAccount() {
		click("clickdot_XPATH");
		click("dropacc_XPATH");
		click("plusbtn_XPATH");
		return new CreateAccountPage();
	}

}
