package Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListerenerClass implements ITestListener {
	
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("The On Test TestStart"+result.getName());
	}
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("The OnTestSuccess"+result.getName());
		
	}
	
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("The OnTestFailure "+result.getName());
		
	}
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
		System.out.println("The OnTestSkipped " + result.getName());
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	System.out.println("The onTestFailedButithPercentage ");	
	}
	
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("onStart : "+context.getName());
		
	}
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("onFinish "+context.getName());
		
	}
	

	
}
