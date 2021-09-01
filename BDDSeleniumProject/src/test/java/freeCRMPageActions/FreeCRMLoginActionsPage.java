package freeCRMPageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import freeCRMPageElements.FreeCRMLoginElements;
import freeCRMutilities.DriverSetUp;

public class FreeCRMLoginActionsPage {

	FreeCRMLoginElements freeCRMLoginElements = new FreeCRMLoginElements();

	public FreeCRMLoginActionsPage() {
		this.freeCRMLoginElements = new FreeCRMLoginElements();

		PageFactory.initElements(DriverSetUp.chromeDriver, freeCRMLoginElements);

	}

	public void getFreeCRMLoginPage() {
		DriverSetUp.chromeDriver.get("https://ui.cogmento.com/");
		DriverSetUp.chromeDriver.manage().window().maximize();
		DriverSetUp.chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void inputUserId(String userId) {
		freeCRMLoginElements.userId.sendKeys(userId);

	}

	public void inputPassword(String password) {
		freeCRMLoginElements.password.sendKeys(password);

	}

	public void clickSubmitButton() {
		freeCRMLoginElements.submitButton.click();
	}

	public String errorMessage() {
		String error = freeCRMLoginElements.errorMessage.getText();
		return error;
	}

}
