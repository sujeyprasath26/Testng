package testngTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyErrormessage {
	@Test
	public  void errorverify() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\inc2011\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gmail.com/");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]")).click();
		Thread.sleep(2000);
		String actual_error=driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[2]/div[2]/div")).getText();
		System.out.println("Actual Error Message is:"+" "+actual_error);
		String expected_error="Enter an email or phone number";
		//Type1
		
	Assert.assertEquals(actual_error, expected_error);
	 //Type2
	
		Assert.assertTrue(actual_error.contains("Enter an email or phone number"));
		
	System.out.println("Error Captured");
		driver.quit();
	}

}
