package com.helms.pageclass;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.helms.testclass.LoginTest;

public class OpenAccountPage extends LoginTest{
	//LoginTest lgntest;
	WebDriver driver;
	WebDriverWait waitlogin;
	//WebDriverWait waits=new WebDriverWait(driver,30);
	//LoginTest objectLT=new LoginTest();
	@FindBy(linkText  = "Open New Account")
	
	WebElement OpenNewQAccountbutton;
	
	@FindBy(xpath = "Open New Account")
	WebElement ClickNewButton;
	
	@FindBy(xpath = "//label[text()='First Name']")
	WebElement FristName;
	@FindBy(xpath = "//button[@aria-label='Search']")
	WebElement Searchbtn;
	
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement LastName;
	
	@FindBy(xpath = "//select[@id='type']")
	WebElement SelectTypeofAccountDD;
	
	
	@FindBy(xpath = "//select[@id='fromAccountId']")
	WebElement SelectAccountNum;
	@FindBy(xpath = "//input[@value='Open New Account']")
	WebElement clickOpenNewAccountconfirmbutton;
	
	  public OpenAccountPage(WebDriver driver) { // TODO Auto-generated constructor stub
	  
	  this.driver =driver;
	  PageFactory.initElements( LoginTest.driver,this); }
	 

	
	public void clickOpenNewQAccountbutton() {
		
		try {driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			JavascriptExecutor javsScript=(JavascriptExecutor)driver;
			javsScript.executeScript("arguments[0].click();", OpenNewQAccountbutton);
			
			System.out.println("Js is working ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Js is not working ");
			OpenNewQAccountbutton.click();
			System.out.println("Normal click is working ");
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	public void ClickOpenNewButton2() {
		waitlogin=new WebDriverWait(driver,Duration.ofSeconds(30));
		waitlogin.until(ExpectedConditions.visibilityOf(OpenNewQAccountbutton));
		
		try {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", OpenNewQAccountbutton);
			System.out.println("Clicked by js");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Not working");
		}
		
		
	
		
	}
	
	
	public void Searchbtn(String ValuetobeEnterd) {
		
		//WebDriverWait waits=new WebDriverWait(WebDriver, 20);
		/*
		 * WebElement
		 * SearchbtnEw=waits.until(ExpectedConditions.presenceOfElementLocated(Searchbtn
		 * ));
		 */
		try {
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			Searchbtn.sendKeys(ValuetobeEnterd);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Searchbtn.sendKeys(ValuetobeEnterd);
	}
	
	public void ClickNewbtn() {
		
		//driver.findElement(By.xpath("//span[text()='Leads']")).click();
		try {
			System.out.println("Click worked fine");
			ClickNewButton.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//driver.findElement(By.xpath("//a[@title='Leads']")).click();
		
	}

	public void FirstName() {
		try {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOf(FristName));
			FristName.sendKeys("Vijaykumar");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Actions Sendkey is not working ");
			FristName.sendKeys("Vijaykumar");
			System.out.println("Normal Sendkey is working ");
			e.printStackTrace();
		}
	}
	
	
	public void Lastname(String P_Lastname)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(LastName));
		LastName.sendKeys(P_Lastname);
		
	}
	
	public void SelectAccountNumber(String ObjAccountNumber) {
		
		
		
		try {
			Select sle=new Select(SelectAccountNum);
			
			sle.selectByVisibleText(ObjAccountNumber);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
public void SelectTypeofAccount(String objTypeofAcount) {
		
		
		
		Select sle=new Select(SelectTypeofAccountDD);
		
		sle.selectByVisibleText(objTypeofAcount);
		
	}

public void CalllOpenNewAccountButton()
{
//	loginbtn.click();
	waitlogin=new WebDriverWait(driver,Duration.ofSeconds(30));
	waitlogin.until(ExpectedConditions.visibilityOf(clickOpenNewAccountconfirmbutton));
	
	try {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", clickOpenNewAccountconfirmbutton);
		System.out.println("Clicked by js");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("Not working");
	}
	
	
}
	
}
