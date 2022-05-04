package runner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener{
	long startTime;
	@Override
	public void onTestStart(ITestResult result) {
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		startTime = System.currentTimeMillis();
		System.out.println("Execution Starting........" + startTime * (1000 / 60));
		System.out.println("Test Method :: " + context.getName());
		
	}

	@Override
	public void onFinish(ITestContext context) {
		long end = System.currentTimeMillis();
		int totalTime = (int) (end - startTime) * (1000 / 60 );
		System.out.println("Execution Stopped :: " + totalTime);
		
	}

}
