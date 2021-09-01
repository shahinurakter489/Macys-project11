package freeCRMPageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import freeCRMPageElements.FreeCRMSignUppageElements;
import freeCRMutilities.DriverSetUp;

public class FreeCRMSignUppageActions {
	FreeCRMSignUppageElements signup = new FreeCRMSignUppageElements();
	
	
	public FreeCRMSignUppageActions () {
		this.signup = new FreeCRMSignUppageElements();
		
		PageFactory.initElements(DriverSetUp.chromeDriver, signup);
		
		
	}

	public void getFreeCRMSignUpPage()  {
		DriverSetUp.chromeDriver.get("https://register.freecrm.com/register/");
		DriverSetUp.chromeDriver.manage().window().maximize();
		DriverSetUp.chromeDriver.manage().deleteAllCookies();
		DriverSetUp.chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		DriverSetUp.chromeDriver.close();
		
	}

	
	public void enterUserEmail(String email) {
		signup.useremail.sendKeys(email);
	}
	public void selectcountryName() {
		signup.countryname.click();
	}
	
	public void enteruserPhonenumber(String phonenumber) {
		signup.Userphonenumber.sendKeys(phonenumber);
	}

	public void checkBox(String checkbox) {
		signup.checkBox.click();
	}
	public void submitButton() {
		signup.submitButton.click();
	}
	public String errorMessage() {
		String error = signup.errorMessage.getText();
		return error;
	}

	
		
	}




