package com.syntax.testcases;

import org.testng.annotations.Test;

public class PimModule {
	
	
	@Test(groups= {"Regression","Smoke"})
	public void validatePimModule() {
		System.out.println("This is Pim Module testcase");
	}
	
	@Test(groups= {"Regression"})
	public void validateAddEmployee() {
		System.out.println("This is Add employee testcase");
	}
	
	@Test(groups= {"Regression"})
	public void validateRemoveEmployee() {
		System.out.println("This is Remove employee testcase");
	}

}
