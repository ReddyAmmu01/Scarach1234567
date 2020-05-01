package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Descired_Capabulity {
	
	static WebDriver driver = null;
	
	public static void main(String[] args) {

		
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("ignoreProtectedModeSettings", true);
		
		
	String path = System.getProperty("user.dir");
	System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\Drivers\\IEDriverServer.exe");
	driver = new InternetExplorerDriver(dc);
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("Selenium Automation");
	driver.findElement(By.name("btnk")).sendKeys(Keys.ENTER);
	
	}
	

}
