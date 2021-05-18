package AssertionDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
//Assertion -user for verification in testng
public class AssertionScripts {
	@Test
	
	public void test1() {
		Assert.assertEquals(12, 13);
		//Verify count,string
		//Hard Assertion
	}
@Test
	
	public void test2() {
	System.out.println("Test case2 Started");
		Assert.assertEquals(12, 13,"Dropdown count doesnot match please check with developer");
		System.out.println("Test case2 Completed");
	}
@Test

public void test3() {
	System.out.println("Test case3 Started");
	Assert.assertEquals("Hello", "Hello","Words doesn not match please raise a bug");
	
	System.out.println("Test case3 Completed");
}

}
