package listenersdemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGlisterner implements ITestListener{
	@Override
	public void onFinish(ITestContext result) {
		
	}
	@Override
	public void onStart(ITestContext result) {
		
	}
  @Override
   public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("TestCases failed and TestCase details are"+result.getName());
	}
		
	@Override
		public void onTestSkipped(ITestResult result) {
			System.out.println("TestCases skipped and TestCase details are"+result.getName());
				
	}
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("TestCases started and TestCase details are"+result.getName());
			
}
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TestCases success and TestCase details are"+result.getName());
		
	}

}
