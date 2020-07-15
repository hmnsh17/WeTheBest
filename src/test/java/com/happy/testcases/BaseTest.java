package com.happy.testcases;

import org.testng.annotations.AfterSuite;

import com.happy.base.Page;

public class BaseTest {
	
	@AfterSuite
	public void tearDown() {
		Page.quit();
	}

}
