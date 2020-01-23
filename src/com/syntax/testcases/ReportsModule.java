package com.syntax.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReportsModule {
	
	
	@Test(priority=1, groups= {"Regression","Smoke"})
	public void validateReportModule() {
		System.out.println("This is Report Module testcase");
	}
	
	@Test(groups= {"Regression"})
	public void openReport() {
		//System.out.println("This is open report testcase");
		Assert.assertTrue(false);
	}
	
	@Test(groups= {"Regression"})
	public void closeReport() {
		System.out.println("This is close report testcase");
	}

}
