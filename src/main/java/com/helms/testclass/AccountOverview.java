package com.helms.testclass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.helms.pageclass.AccountOverViewPage;


public class AccountOverview extends LoginTest{
	
	WebDriver driver;
	AccountOverViewPage oppage;
	LoginTest loginOptyobj;

	
	@BeforeTest
	public void AccountOverview() {
		
		System.out.println("Browser gonna initialize");
		loginOptyobj=new LoginTest();
		loginOptyobj.Login();
		
		
	}
	
	
	
	@Test
	public void OprationonOpportunity() {
		
		
		AccountOverViewPage oppage=new AccountOverViewPage(LoginTest.driver);
		oppage.ClickAccountOverviewButton();
		oppage.AccountDeatils();
	}
	
	@AfterTest(enabled = false)
	public void tearDownOppty() {
		
		System.out.println("Application working fine");
		//AccountOverview oppage=new AccountOverview(LoginTest.driver);
		driver.quit();
		System.out.println("Browser gonna quite");
	}
}
