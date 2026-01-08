package Day46;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


	
	public class ExtentReportManager implements ITestListener  {
		
		
	    public ExtentSparkReporter spartreprt;
		public ExtentReports extentR;
		public ExtentTest testR;
		
		String repName;
		public void onStart(ITestContext context) 
		{
			
			
			String timeStamp= new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
			repName="Test-Report-"+timeStamp+".html";  
			
			//set look and fill 
			spartreprt=new ExtentSparkReporter(".\\Report\\"+repName);
			//location of report
			
			spartreprt.config().setDocumentTitle("Automation Project Report");
			spartreprt.config().setReportName("Functional Testing");
			spartreprt.config().setTheme(Theme.DARK);
			
			
			//populate the common info
			extentR=new ExtentReports();
			extentR.attachReporter(spartreprt);
			
			extentR.setSystemInfo("Computer Name", "Local host");
			extentR.setSystemInfo("Envirnoment", "Azure_QA");
			extentR.setSystemInfo("Project", "UI Automation");
			extentR.setSystemInfo("Portal", "UI Aotomation_PORTAL");
			extentR.setSystemInfo("Tester", "Ganesh Kakade");
			extentR.setSystemInfo("Browser", "Chrome");
			extentR.setSystemInfo("OS", "Window 11");
			
			//ITestContext testContext;
			//used to include the groups name in the report
			List<String> includedGroups=context.getCurrentXmlTest().getIncludedGroups();
			if(!includedGroups.isEmpty())
			{
				extentR.setSystemInfo("Groups", includedGroups.toString());
			}
		
		
		}
		
		
		public void onTestSuccess(ITestResult result) 
		{

			testR=extentR.createTest(result.getName());//Create new entry in the report
		
			testR.assignCategory(result.getMethod().getGroups());
			
			//testR.createNode(result.getName());
			testR.log(Status.PASS, result.getName()+" : Got Sucessfully Executed");  //update status pas/fail
			
			
		  }
		public void onTestFailure(ITestResult result)
		{
		    
			testR=extentR.createTest(result.getName());
			testR.createNode(result.getName());
			testR.assignCategory(result.getMethod().getGroups());
			
			testR.log(Status.FAIL, "Test Case Failed is :"+result.getName());
			testR.log(Status.FAIL, "Test Case Failed cause is :"+result.getThrowable().getMessage());
		
		
					
		  }

		public void onTestSkipped(ITestResult result) 
		{
			testR=extentR.createTest(result.getClass().getName());
			testR.createNode(result.getName());
			testR.assignCategory(result.getMethod().getGroups());
			
			
			testR.log(Status.SKIP, "Test Case Skipped is :"+result.getName());
			testR.log(Status.INFO, result.getThrowable().getMessage());
		}

		
		 
		public void onFinish(ITestContext context) {
				
			    extentR.flush();
			
			    String pathOfExtentReport=System.getProperty("user.dir")+"\\Reports\\"+repName;
			    File extentReport=new File(pathOfExtentReport);
		try
		{
			    Desktop.getDesktop().browse(extentReport.toURI());
		}
		catch(IOException e1)
		{
			e1.printStackTrace();
		}
		
		}
		
		
		
	}


