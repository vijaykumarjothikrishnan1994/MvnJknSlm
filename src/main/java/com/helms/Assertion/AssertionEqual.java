package com.helms.Assertion;

import org.testng.asserts.Assertion;

import com.helms.testclass.LoginTest;

public class AssertionEqual {
	LoginTest lgobj;
	
	public void AssertGetTitlevalue() {
		
		Assertion assertequal=new Assertion();
		assertequal.assertEquals("Home | Salesforce","Home | Salesforce", "Getting worng page");
		
		
		
	}
	
	

}
