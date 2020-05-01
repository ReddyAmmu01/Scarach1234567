package demo;

import org.testng.annotations.Test;
@Test(groups = {"AllOfTheClassLevelOfTheApplication"})

public class TestNgGroups {

	@Test(groups = {"sanity"})
	public void Test1() {
		System.out.println("Test of Test1 Method");
	}
	
	@Test(groups = {"sanity","smoke"})
	public void Test2() {
		System.out.println("Test of Test2 Method");
	}
	@Test(groups = {"smoke","regression"})
	public void Test3() {
		System.out.println("Test of Test3 Method");
	}
	@Test
	public void Test4() {
		System.out.println("Test of Test4 Method");
	}
	
	@Test(groups = {"Windows.SanityTest"})
	public void Test5() {
		System.out.println("Test of Test5 Method On Windows Of the Appliction");
	}
	
}
