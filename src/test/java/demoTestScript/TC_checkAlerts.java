package demoTestScript;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility.ListenersClass;
import Utility.utilClass;
import baseTest.baseTest;
import pageObjects.homePageObjects;
@Listeners(Utility.ListenersClass.class)
public class TC_checkAlerts extends baseTest {
	
	public homePageObjects po;

	@BeforeClass
	public void ObjectCeation() throws IOException {
		po = new homePageObjects();	
		initializeBrowser();
	}	
	
	@Test
	public void validateSimleAlert() {
		po.handlesimplePopup("Rudra");
	}

	@Test
	public void validateConformationAlert() {
		po.handleConfirmationAlert("Ambadas");
	}
	
	@AfterClass
	public void clearObjects() {
		po=null;
		driver.close();
	}	

}
