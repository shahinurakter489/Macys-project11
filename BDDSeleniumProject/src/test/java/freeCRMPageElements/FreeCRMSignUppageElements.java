package freeCRMPageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FreeCRMSignUppageElements {
	

	
	@FindBy(id = "email")
	public WebElement useremail;

	@FindBy(className = "//*[@class=\"search\"]")
	public WebElement countryname;

	

	@FindBy(id = "//*[@name=\"phone\"]")
	public WebElement Userphonenumber;

	@FindBy(className = "//*[@name=\"terms\"]")
	
	public WebElement checkBox;

	@FindBy(xpath ="//*[@class=\"ui fluid large blue submit button\"]")
	public WebElement submitButton;

	@FindBy(id = "errorMessages")
	public WebElement errorMessage;
}
