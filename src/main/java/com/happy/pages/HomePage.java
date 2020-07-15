package com.happy.pages;

import org.openqa.selenium.By;

import com.happy.base.Page;

public class HomePage extends Page {
	
	
	public void goToSupport() {
		driver.findElement(By.xpath("//a[@class='zh-support']")).click();
	}
	
	public void goToSignUp() {
		driver.findElement(By.xpath("//a[@class='zh-signup']")).click();
	}
	public LoginPage goToLogin() {
		click("login_XPATH");
//		System.out.println();
		return new LoginPage();
	}
	public void goToCustomers() {
		driver.findElement(By.xpath("//a[@class='zh-customers']")).click();
	}
	public void goToContactSales() {
		driver.findElement(By.xpath("//a[@class='zh-contact']")).click();
	}
	public void vallidateFooterLinks() {
		
	}
	}