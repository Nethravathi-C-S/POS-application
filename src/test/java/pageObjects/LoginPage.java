package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testCases.TC_002_OrgSelectTest;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div/input")
	WebElement txtMobileNumber;

	@FindBy(id = "outlined-adornment-password")
	WebElement txtPassword;

	@FindBy(xpath = "//button[normalize-space()='LOGIN']")
	WebElement btnLogin;


	public void setMobile(String mobile) {
		txtMobileNumber.sendKeys(mobile);
	}

	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}

	public void clickLogin() {
		btnLogin.click();
	}


}
