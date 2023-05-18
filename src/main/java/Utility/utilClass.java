package Utility;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import baseTest.baseTest;

public class utilClass extends baseTest {

	// decare al methods as static then call call name .methods name

	public static void acceptAlertPops() {
		Alert alt = driver.switchTo().alert();
		alt.accept();
		;

	}

	public static void dismissAlertPops() {
		Alert alt = driver.switchTo().alert();
		alt.dismiss();

	}

	public static String getScreenShot(String testname) 
	{

		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destination = new File(System.getProperty("user.dir") + "\\ScreenShots\\" + testname + ".png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
           return System.getProperty("user.dir")+"\\ScreenShots\\"+testname+ ".png";
	 }

	public static void maximizeWindow() {
		driver.manage().window().maximize();

	}

	public static void applyImplciteWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
