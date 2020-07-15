package com.happy.pages;


import com.happy.accounts.AccountsPage;
import com.happy.base.Page;

public class ZohoAppPage extends Page {
	
	
	public void gotoChat() {
		
	}
	
	public AccountsPage gotoCRM() {
		click("crmlink_XPATH");
		return new AccountsPage();
	}
	
	public void gotoSalesIQ() {
		
	}

}
