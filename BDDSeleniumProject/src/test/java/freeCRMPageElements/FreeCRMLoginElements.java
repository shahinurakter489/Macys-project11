package freeCRMPageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FreeCRMLoginElements {
	@FindBy(name = "email")
	public WebElement userId;

	@FindBy(name = "password")
	public WebElement password;

	@FindBy(xpath = "//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[3]")
	public WebElement submitButton;

	@FindBy(id = "errorMessages")
	public WebElement errorMessage;
}
