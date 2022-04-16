package com.helms.pageclass;

import java.time.Duration;
import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.helms.testclass.LoginTest;
import com.helms.utilities.Utilities;

public class AccountOverViewPage extends LoginTest{
	Utilities utAp;
	WebDriver driver;
	
	@FindBy(linkText =   "Accounts Overview")
	WebElement ClickAccountOverviewBtn;
	
	
	@FindAll(@FindBy(how =How.XPATH,using = "//table//tbody//td"))
	List<WebElement> XpathTable;
	
	
	
	public AccountOverViewPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(LoginTest.driver, this);
	}
	
	public void ClickAccountOverviewButton() {
		
		WebDriverWait waitopty=new WebDriverWait(driver,Duration.ofSeconds(30));
		waitopty.until(ExpectedConditions.visibilityOf(ClickAccountOverviewBtn));
		JavascriptExecutor jsoptypage=(JavascriptExecutor)driver;
		jsoptypage.executeScript("arguments[0].click();", ClickAccountOverviewBtn);
		System.out.println("Clicked opty successfully");
		
	}
	
	public void AccountDeatils() {
		
		utAp=new Utilities();
		utAp.Globalwait(4000);
		System.out.println(XpathTable.size());
		XpathTable.size();
		
		for (WebElement webElement : XpathTable) {
			
			
			//System.out.println(webElement.getText());
			
		String listTotalValues=	webElement.getText().toString();
			
			if(listTotalValues.contains("$"))
			{
				//System.out.println(listTotalValues);
				
				
				String strremoved=listTotalValues.replace('$', ' ');
				System.out.println(strremoved);
				
				
				
				/*
				 * int totalintvalues=Integer.parseInt(strremoved);
				 * System.out.println(totalintvalues);
				 */
				
				
			}
			else
			{
				//System.out.println("Displaying Account number");
			}
			
			
			
			
			
			
			
		}
		
		
		
	}

}
