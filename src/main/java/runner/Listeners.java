package runner;


import org.testng.ITestContext;

public class Listeners extends TestResultAdapter{
private long start;
private String testStatus;
private int timeElapsed;
public void onStart(ITestContext context) {
	System.out.println("Execution starting......... ");
	start = System.currentTimeMillis();
	
}
public int getNumberOfTestPassed() {
	return this.getPassedTests().size();
}
@Override
public void onFinish(ITestContext testContext) {
	long end = System.currentTimeMillis();
	timeElapsed = (int) ((end - start) * (1000 / 60));
	testStatus = String.format("Total test run %d %n passed tests %d Total time taken %d", getNumberOfTestPassed(),getNumberOfTestPassed());
	System.setProperty("testStatus", testStatus);
	System.out.println("Test Status :: " + testStatus);
}


}
