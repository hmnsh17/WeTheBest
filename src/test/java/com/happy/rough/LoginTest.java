package com.happy.rough;

import com.happy.accounts.AccountsPage;

import com.happy.accounts.CreateAccountPage;
import com.happy.pages.HomePage;
import com.happy.pages.LoginPage;
import com.happy.pages.ZohoAppPage;

public class LoginTest {
	public static void main(String[] args) {
		/*HomePage home=new HomePage();
		home.goToLogin();
		LoginPage login=new LoginPage();
		login.doLogin("hmnshgrvr@gmail.com", "himanshu@mg");
		ZohoAppPage zp=new ZohoAppPage();
		zp.gotoCRM();
		AccountsPage acc=new AccountsPage();
		acc.gotoAccount();
		CreateAccountPage cap=new CreateAccountPage();
		cap.CreateAccount("Himanshu");*/
		
		HomePage home=new HomePage();
		LoginPage lp=home.goToLogin();
		ZohoAppPage zp=lp.doLogin("hmnshgrvr@gmail.com", "himanshu@mg");
		AccountsPage acc=zp.gotoCRM();
		CreateAccountPage cap=acc.gotoAccount();
		cap.CreateAccount("Himanshu");
		
	}
}
