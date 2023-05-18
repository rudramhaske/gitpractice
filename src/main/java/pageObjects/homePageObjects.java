package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.utilClass;
import baseTest.baseTest;

public class homePageObjects extends baseTest {
	// page objects should not contain any deta 

	public homePageObjects() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#name")
	private WebElement name;

	@FindBy(id = "alertbtn")
	private WebElement altbtn;

	public void handlesimplePopup(String Fname) {
		name.sendKeys(Fname);
		altbtn.click();	
		utilClass.acceptAlertPops();
	}

	@FindBy(css = "#name")
	private WebElement nameText;

	@FindBy(css = "#confirmbtn")
	private WebElement confirmBtn;

	public void handleConfirmationAlert(String Sname) {
		nameText.sendKeys(Sname);
		confirmBtn.click();
		utilClass.dismissAlertPops();

	}

}
