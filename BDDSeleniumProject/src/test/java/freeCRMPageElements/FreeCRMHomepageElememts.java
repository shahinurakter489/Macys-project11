package freeCRMPageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FreeCRMHomepageElememts {
	@FindBy(xpath = " //body/div[1]/main[1]/section[1]/a[1]")
	public WebElement Signup;
	@FindBy(xpath = "//span[contains(text(),'Log In')]")
	public WebElement Login;

	@FindBy(xpath = " //a[contains(text(),'About')]")
	public WebElement about;

}
