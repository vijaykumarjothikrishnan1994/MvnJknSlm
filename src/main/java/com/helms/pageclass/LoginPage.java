package com.helms.pageclass;

//import java.sql.Driver;
import java.time.Duration;

//import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriver driver;
	WebDriverWait waitlogin;
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	
	@FindBy(xpath = "//input[@name='username']")
	WebElement username;
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	@FindBy(xpath = "//input[@value='Log In']")
	WebElement loginbtn;
	
	
	/*
	 * public void LaunchApplicationwithBrowser() {
	 * 
	 * 
	 * 
	 * System.out.println("launch the application");
	 * 
	 * }
	 */
	
	
	
	
	
	@FindBy(xpath = "//a[@title='Women']")
	
	WebElement ClickWomentab;
	
	
	
	
	
	
	
	
	
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public String Callusername(String Username)
	{ waitlogin=new WebDriverWait(driver,Duration.ofSeconds(30));
	waitlogin.until(ExpectedConditions.visibilityOf(username));
		username.sendKeys(Username);
		//System.out.println(Username);
		return Username;
	}
	public String Callpassword(String Passsword)
	{
		waitlogin=new WebDriverWait(driver,Duration.ofSeconds(30));
		waitlogin.until(ExpectedConditions.visibilityOf(password));
		password.sendKeys(Passsword);
		return Passsword;
	}
	public void Callloginbtn()
	{
	//	loginbtn.click();
		waitlogin=new WebDriverWait(driver,Duration.ofSeconds(30));
		waitlogin.until(ExpectedConditions.visibilityOf(loginbtn));
		
		try {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", loginbtn);
			System.out.println("Clicked by js");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Not working");
		}
		
		
	}
}
