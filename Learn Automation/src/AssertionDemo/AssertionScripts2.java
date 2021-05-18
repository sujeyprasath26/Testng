package AssertionDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
//Assertion -user for verification in testng
public class AssertionScripts2 {
	@Test
	
	public void test1() {
		String mystr="Sujey Prasath";
		Assert.assertTrue(mystr.contains("Sujey"),"Names are not matching");
		//true-pass,false-fail
		//verify title,error message
		
	}
@Test
	
	public void test2() {
	Assert.assertTrue(false);
	}

}
