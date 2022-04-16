package com.helms.library;

import org.openqa.selenium.WebDriver;

import com.helms.pageclass.LoginPage;

public class Library extends LoginPage {
	WebDriver driver;
	public Library(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//WebDriver driver=null;
	public void Get_Title() {
		
		LoginPage lp=new LoginPage(driver);
		
		
		System.out.println(driver.getTitle());
		
		
	}

}
