package testngTutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MyApplication2 {
	
	WebDriver driver;
	@BeforeClass
	public void startBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\inc2011\\eclipse-workspace\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("---------Browser Started-------------");
		
	}
	
	
	@Test
	public void startApp() {
		
		
		driver.get("http://r1.tdesk.dev1:8020/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		String currentURL=driver.getCurrentUrl();
		Assert.assertTrue(currentURL.contains("login"));
		
		System.out.println("---------App Loaded------------");
	}
	@Test(dependsOnMethods="startApp")
	
	public void loginApp() {
		driver.findElement(By.id("email")).sendKeys("sakthi.b@tauedu.org");
		driver.findElement(By.id("password")).sendKeys("Welcome@12345");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/section/div/div/div/div[2]/div/div[2]/div/form/div[2]/button")).click();
		boolean status=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[2]/div/nav/div/ul/li[4]/a/div/span/strong")).isDisplayed();
		Assert.assertTrue(status);
		System.out.println("---------Login Successfully----------");
	}
	@Test(dependsOnMethods="loginApp")
	public void logoutApp() {
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[2]/div/nav/div/ul/li[4]/a/div/span/strong")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[2]/div/nav/div/ul/li[4]/div/a[3]/span")).click();
		Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[2]/div/div/section/div/div/div/div[2]/div/p")).isDisplayed());
		System.out.println("---------Logout Done----------");
	}
	
	@AfterClass
	public void closeApp() {
		driver.quit();
		System.out.println("---------Browser Closed----------");
	}
	
	

}
