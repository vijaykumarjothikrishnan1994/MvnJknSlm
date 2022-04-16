package com.helms.testclass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import com.helms.base.Basehelmspro;

import com.helms.pageclass.LoginPage;
import com.helms.pageclass.OpenAccountPage;
import com.helms.utilities.Utilities;



public class OpenAccounttest extends LoginTest{


	WebDriver driver;
	OpenAccountPage lpobj=null;
Utilities utobj;
WebDriverWait waits;
Basehelmspro baseLCobj;






  //public OpenAccounttestt() { // TODO Auto-generated constructor stub
  
		/*
		 * ehrSparkeport=new ExtentSparkReporter(System.getProperty("user.dir")+
		 * "/HelmsAutomationPro/Reports/ExtentReportsResult.html");
		 * ehrSparkeport.config().setDocumentTitle("AutomationReport");
		 * ehrSparkeport.config().setReportName("Funcational Report");
		 * ehrSparkeport.config().setTheme(Theme.DARK); Exreports=new ExtentReports();
		 * Exreports.attachReporter(); Exreports.attachReporter(ehrSparkeport);
		 * //testR=Exreports.startTest("LeadCreation");
		 * Exreports.setSystemInfo("testername", "Vijay");
		 */
  
  
	/*
	 * this.driver=driver; PageFactory.initElements(LoginTest.driver, this);
	 */
  
 // }
 
 


@Test
public void LeadCreation() throws IOException {
	
	
	
	
	

	
	LoginTest ltest=new LoginTest();
	Login();
	
	
	 utobj=new Utilities();
	
	 
	lpobj=new OpenAccountPage(LoginTest.driver);
	
lpobj.ClickOpenNewButton2();
	

lpobj.SelectTypeofAccount("SAVINGS");

lpobj.SelectAccountNumber("14232");
	
	
	
	
	utobj.Globalwait(2000);
	//lpobj.FirstName();
	lpobj.CalllOpenNewAccountButton();
	

	
	
	
}

}
