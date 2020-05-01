package Listener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgMultipultBrowser {

	
	WebDriver driver = null;
	String path = System.getProperty("user.dir");

	@BeforeTest
	@Parameters("browser")
	public void initializeBrowser(String browser) {
		System.out.println("The Browser Name Is : "+ browser);
		System.out.println("Thread id : "+Thread.currentThread().getId());
		System.out.println("Thread Name : "+Thread.currentThread().getName());
		if(browser.equalsIgnoreCase("chrome")) {
//			System.setProperty("webdriver.driver.chrome",path+"Drivers/chromedriver.exe");
//			DesiredCapabilities dc = new DesiredCapabilities();
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("The Browser was not able connect ");
		}
	}
	@Test
	public void testdata() {
		driver.get("https://www.google.com/");
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	
	}
}
