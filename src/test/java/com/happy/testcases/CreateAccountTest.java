package com.happy.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.happy.accounts.AccountsPage;
import com.happy.accounts.CreateAccountPage;
import com.happy.pages.ZohoAppPage;
import com.happy.utilities.TestUtil;

public class CreateAccountTest {
	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void createAccountTest(Hashtable<String,String> data){
		
		ZohoAppPage zp=new ZohoAppPage();
		AccountsPage acc=zp.gotoCRM();
		CreateAccountPage cap=acc.gotoAccount();
		cap.CreateAccount(data.get("accountname"));
	}

}
