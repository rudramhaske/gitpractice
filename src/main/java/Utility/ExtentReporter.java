package Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporter {

	static ExtentReports extent;
	
	public static  ExtentReports getReporterObject() 
	{   // make object of ExtentSparkReporter class 
		String path = System.getProperty("user.dir")+"\\extentReports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Test Report");
		reporter.config().setDocumentTitle("Test Result");
		
		  extent=new ExtentReports();
		  extent.attachReporter(reporter);
		  extent.setSystemInfo("Tester","Ambadas Mhaske");
		  
		  return extent;
		  // create entry forthe test 
	    
		
	}
}
