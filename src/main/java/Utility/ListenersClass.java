package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ListenersClass implements ITestListener{

	ExtentReports extent;
	ExtentTest Test;
	
	public  void onTestStarts(ITestResult result) 
	{
		extent= ExtentReporter.getReporterObject();
	    // creating  entry of the every test  for the extend report  	
	    Test= extent.createTest(result.getMethod().getMethodName());
			
	}
	
	public  void onTestSuccess(ITestResult result) 
	{	
		    Test.log(Status.PASS,"Test Passed");		
	}
	
	
	public  void onTestFailure(ITestResult result) 
	{		   
	    Test.fail(result.getThrowable());
	    String  FilePath=  utilClass.getScreenShot(result.getName());
		Test.addScreenCaptureFromPath(FilePath);
		
		
	}
	
	public  void onFinish(ITestResult result) 
	{	
		// conpulsory step without this reports generation not happen , it generate the report but show on the screen 
		extent.flush();	
	}
	
	
}
