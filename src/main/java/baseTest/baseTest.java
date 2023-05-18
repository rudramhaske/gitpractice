package baseTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Utility.ListenersClass;
import Utility.PropertyFileReader;
import Utility.utilClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.homePageObjects;

public class baseTest {

	public static WebDriver driver;

	public void initializeBrowser() throws IOException {

		String browsername = PropertyFileReader.getBrowserName();

		if (browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browsername.equalsIgnoreCase("edge")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new EdgeDriver();
		}
		
        utilClass.maximizeWindow();
        utilClass.applyImplciteWait();
		driver.get(PropertyFileReader.getUrl());

	}

}
