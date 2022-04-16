package com.helms.testclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.helms.Assertion.AssertionEqual;
import com.helms.library.Library;
import com.helms.pageclass.LoginPage;
import com.helms.utilities.Utilities;

public class LoginTest {

	public static WebDriver driver = null;
	LoginPage lp;
	Library objlib;
	AssertionEqual objassert;

	WebDriverWait waitlogin;

	//@Test
	public void Login() {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vijay Krishnan\\Desktop\\Software\\Driver\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver(option);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		// driver.get("https://americanhondamotorcohelms--ahmqa.my.salesforce.com/index.jsp?a=a&ec=20037&eco=1");

		String GetUrl = "https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC";
		// driver.get("https://mindful-unicorn-wg4v33-dev-ed.my.salesforce.com/");
		driver.get(GetUrl);
		// driver.manage().deleteAllCookies();
		// driver.quit();

		// lp.LaunchApplicationwithBrowser();
		lp = new LoginPage(driver);
		Utilities utobj = new Utilities();
		utobj.Globalwait(3000);

		driver.navigate().refresh();
		utobj.Globalwait(5000);

		
		System.out.println("Before feeding name");
		  
		  lp.Callusername("Vijayusername"); //utobj.Globalwait(3000);
		  lp.Callpassword("Vijay#12345"); //utobj.Globalwait(3000); lp.Callloginbtn();
		  utobj.Globalwait(4000); //driver.quit(); objlib=new Library(driver);
		  
		  System.out.println( driver.getTitle()); String strgetTitle=driver.getTitle();
		  
		  objassert=new AssertionEqual(); objassert.AssertGetTitlevalue();
		  
		  //Login2();
			System.out.println("After feeding name");
		  lp.Callloginbtn();
		 

	}

}
