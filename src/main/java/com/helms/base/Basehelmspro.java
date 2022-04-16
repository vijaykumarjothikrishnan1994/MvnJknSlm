package com.helms.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Basehelmspro {

	WebDriver driver;
public	FileInputStream fisi;
	
public	Properties Baseprop;
	@Test(enabled = false)
	public void TestDryRun() {
		
		System.out.println("This is first program");
	}
	
	@Test
	public void PropertiesTest() throws IOException {
	 
	}
	
	public Basehelmspro() throws IOException {
		// TODO Auto-generated constructor stub
		fisi=new FileInputStream("C:\\Users\\VI20228228\\Desktop\\Software\\NewLocation\\HelmsAutomationPro\\MasterReadData\\testUserData.properties");
		Baseprop=new Properties();
		Baseprop.load(fisi);
		System.out.println(Baseprop.get("Browser"));
	}
	
	
	@BeforeTest(enabled = false)
	@Parameters("browser")
	public void RunBroswer(String browser) 
	{
		
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.out.println("Launchong chrome browser");
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--disable-notifications");
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\VI20228228\\Desktop\\Software\\Drivers\\chromedriver.exe");
			 driver=new ChromeDriver(option);
			 driver.manage().window().maximize();
			 driver.get("https://www.google.com/");
			 
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.out.println("Launchong Firefox browser");
			FirefoxProfile ffprofile = new FirefoxProfile();
			ffprofile.setPreference("dom.webnotifications.enabled", false);
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\VI20228228\\Desktop\\Software\\Drivers\\geckodriver.exe");
			 driver= new FirefoxDriver();
			 driver.manage().window().maximize();
			 driver.get("https://www.google.com/");
		}
		
		else if(browser.equalsIgnoreCase("edge"))
		{
			System.out.println("Launchong Edge browser");
			System.setProperty("webdriver.edge.driver","C:\\Users\\VI20228228\\Desktop\\Software\\Drivers\\msedgedriver.exe");
			//create Edge instance
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
		}
		else
		{
			System.out.println("Please use the available browsers:");
		}
		
	}
}
