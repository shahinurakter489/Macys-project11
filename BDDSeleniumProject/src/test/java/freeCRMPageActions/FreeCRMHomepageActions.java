package freeCRMPageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import freeCRMPageElements.FreeCRMHomepageElememts;
import freeCRMutilities.DriverSetUp;

public class FreeCRMHomepageActions {
	FreeCRMHomepageElememts	 freeCRMHomepageElememts;
	public FreeCRMHomepageActions() {
		this.freeCRMHomepageElememts = new FreeCRMHomepageElememts();
		PageFactory.initElements(DriverSetUp.chromeDriver, freeCRMHomepageElememts);
	}
	public void getFreeCRMHomepage() {
		DriverSetUp.chromeDriver.get("https://www.freecrm.com/index.html");
		DriverSetUp.chromeDriver.manage().window().maximize();
		DriverSetUp.chromeDriver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		DriverSetUp.chromeDriver.close();
	}
	public void clickSignUp() {
		freeCRMHomepageElememts.Signup.click();
	}
	public void clickLogin() {
		freeCRMHomepageElememts.Login.click();
	}
	public void clickAbout() {
		freeCRMHomepageElememts.about.click();
	}
	
}
