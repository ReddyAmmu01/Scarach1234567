package Pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Listener.ListerenerClass;
import Listener.TestNgMultipultBrowser;
import bsh.BshClassManager.Listener;

//@Listeners(ListerenerClass.class)
public class TestClass {
	static WebDriver driver = null;
	TestNgMultipultBrowser tn = new TestNgMultipultBrowser();
	
	
	@Test
	public void test1() {
		System.out.println("I am inside Test1");
	}
	@Test
	public void test2() {
		System.out.println("I am inside Test");
		Assert.assertTrue(false);
	}
	@Test
	public void test3() {
		System.out.println("I am inside Test3");
		throw new SkipException("This test is Skipped");
	}

}
