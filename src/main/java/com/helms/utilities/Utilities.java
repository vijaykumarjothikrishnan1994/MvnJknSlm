package com.helms.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.helms.pageclass.LoginPage;
import com.helms.testclass.LoginTest;

public class Utilities {
	
 WebDriver driver=null;
 LoginTest loginTstut;
	public void Globalwait(int waitforglobal) {
		
		try {
			Thread.sleep(waitforglobal);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public void Implicit_Wait(int showtime) {
		loginTstut=new LoginTest();
		driver.manage().timeouts().implicitlyWait(showtime,TimeUnit.SECONDS);
		
		
	}

}
