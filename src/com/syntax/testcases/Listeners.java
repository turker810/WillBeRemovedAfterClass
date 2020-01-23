package com.syntax.testcases;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{

	
	
	public void onTestFailure(ITestResult result) {
	    System.err.println("I would have taken screen shot if I had the codes "+result.getName());	  }
	
	public void onTestSuccess(ITestResult result) {
	    // not implemented
	  }
	
	public void onTestStart(ITestResult result) {
	    System.out.println("I would have deleted cookies");
	  }
	
	public void onFinish(ITestContext context) {
	    // not implemented
	  }
}
