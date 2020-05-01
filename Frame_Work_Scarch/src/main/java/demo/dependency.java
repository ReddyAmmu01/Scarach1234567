package demo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class dependency {
	
	@Test
	public void test1() {
		System.out.println("the Test test10");
		
	}

	@Test
	@Ignore
	public void test2() {
		System.out.println("The test 2 Methods ");
	}
}
