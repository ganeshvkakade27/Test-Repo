package Day46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListrner implements ITestListener {
	
	public void onStart(ITestContext context) 
	{
	    System.out.println("Test Execution is Started");
	  }
	
	public void onTestStart(ITestResult result) 
	{
		System.out.println("Test Started");
	  }
	
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test Execution is Passed");
	  }
	
	
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("Test Execution is Failed");
	  }
	
	
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("Test Execution is Skiped");
		  }
	 
	
	public void onFinish(ITestContext context)
	{
		System.out.println("Test Execution is Finished");
		  
	}
	

}
