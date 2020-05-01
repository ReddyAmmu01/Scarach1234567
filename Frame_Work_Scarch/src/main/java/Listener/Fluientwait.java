package Listener;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.math3.stat.ranking.TiesStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fluientwait {
	public static WebDriver driver;
	
//	public static void main(String[] args) {
//		testclass() ;
//	}

	@Test(retryAnalyzer = RetryFailedTestCaseAutomatically.class)
	public static void testclass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("abcd");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		 // for its presence once every 5 seconds.
			
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(30, TimeUnit.SECONDS)
		       .pollingEvery(2, TimeUnit.SECONDS)
		       .ignoring(NoSuchElementException.class);

		   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		     WebElement linkText = driver.findElement(By.linkText("ABCD | Alphabet Song | ABCD Song | Cartoon Video | ABCD ..."));
		     if(linkText.isEnabled()) {
		    	 System.out.println("Element Found");
		     }
		     return linkText;
		     
		     }
		   });
		   foo.click();
		   driver.close();
		   driver.quit();
		   System.out.println("The Successfuly compleated : Applicaton ");

	}
}
