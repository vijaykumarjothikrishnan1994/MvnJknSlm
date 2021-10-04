package com.mainBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Runprograme {
	
	WebDriver driver;
	@Test
	public void testRun() {
		System.out.println("This is my First programe");
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Vijay Krishnan\\\\Desktop\\\\Selenium\\\\SeleniumDriver\\\\94\\\\chromedriver_win32 (9)\\\\chromedriver.exe");
		 driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.navigate().to("http://www.seleniumframework.com/Practiceform/");
			
		
	}

}
