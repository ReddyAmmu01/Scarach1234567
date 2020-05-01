package Listener;

import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.Test;

import bsh.BshClassManager.Listener;
@Test(retryAnalyzer = RetryFailedTestCaseAutomatically.class)

public class TestNgFaildTest {

	@Test
	public void test11() {
		System.out.println("The Listener of the application:");
	}
	
	@Test
	public void test12() {
		System.out.println("The Listener of the Test22");
		Scanner scr = new Scanner(System.in);
		System.out.println("Please Enter The Number :");
		int number = scr.nextInt();
		int number2 = scr.nextInt();
		int avg = number/number2;
		System.out.println(avg);
		
	}
//	@Test(retryAnalyzer = RetryFailedTestCaseAutomatically.class)
	@Test
	public void test13() {
		System.out.println("The Test of class Was in method 13 ");
		Assert.assertTrue(false);
	}
}
