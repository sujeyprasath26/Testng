package testngTutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitles {
	
	WebDriver driver;
	@Test
	public void verifyApplicationTitle() {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\inc2011\\eclipse-workspace\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://learn-automation.com/");
		//Actual Title
		//String my_title=driver.getTitle();
		String my_title=driver.getPageSource();
		
		System.out.println("Title is"+"  "+ my_title );
		String expected_title="Automation - Selenium WebDriver tutorial Step by Step";
		//Assert.assertEquals(my_title, expected_title);
		Assert.assertTrue(my_title.contains("Automation - Selenium WebDriver tutorial"));
		
		System.out.println("Test Completed-page verified");
		
		
		
		
	}

}
