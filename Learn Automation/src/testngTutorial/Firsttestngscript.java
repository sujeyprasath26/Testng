package testngTutorial;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Firsttestngscript {
	
	@Test(priority=1 ,description="This test case will verify login functionality")
	public void loginApplication() {
		System.out.println("login into Application");
		Assert.assertEquals(12, 11);
		
	}
	@Test(priority=2,description="This test case will add certain items in basket")
	public void selectItems() {
		System.out.println(" Item Selection");
		
	}
	@Test(priority=-3,description="This test case will perform checkout operation")
	public void checkOut() {
		System.out.println(" Checkout completed");
		
	}
}
