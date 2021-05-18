package crossBrowsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerifyTitle {
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void verifypageTitle(String browserName) {
		if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\inc2011\\eclipse-workspace\\geckodriver.exe");
			driver=new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\inc2011\\eclipse-workspace\\chromedriver.exe");
			driver=new ChromeDriver();
		}
	else if(browserName.equalsIgnoreCase("IE")) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\inc2011\\eclipse-workspace\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
	}
		
		driver.manage().window().maximize();
		driver.get("http://r1.tdesk.dev1:8020/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		//System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("sakthi.b@tauedu.org");
		driver.findElement(By.id("password")).sendKeys("Welcome@12345");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/section/div/div/div/div[2]/div/div[2]/div/form/div[2]/button")).click();
		System.out.println("Login successfully");
		driver.close();
	}

}
