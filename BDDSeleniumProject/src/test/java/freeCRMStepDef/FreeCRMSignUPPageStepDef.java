package freeCRMStepDef;

import org.testng.Assert;

import freeCRMPageActions.FreeCRMSignUppageActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ups.utilities.DriverSetup;

public class FreeCRMSignUPPageStepDef {
	FreeCRMSignUppageActions freeCRMSignUppageActions = new FreeCRMSignUppageActions();
	
	@Given("customer in Free CRM Sign up  page")
	public void customer_in_Free_CRM_Sign_up_page() {
		
		 freeCRMSignUppageActions.getFreeCRMSignUpPage();
	   
	}

	@When("customer gives input  email address")
	public void customer_gives_input_email_address(String userEmail) {
		 freeCRMSignUppageActions.enterUserEmail(userEmail);

	}

	@When("customer gives input  country name and phonenumber")
	public void customer_gives_input_country_name_and_phonenumber() {
		 freeCRMSignUppageActions.enteruserPhonenumber(null);

	}

	@When("customer  select the agreement box")
	public void customer_select_the_agreement_box(String agreement) {
		 freeCRMSignUppageActions.checkBox(agreement);

	}

	@Then("customer should able to Sign up")
	public void customer_should_able_to_Sign_up() {

		  String expectedURL ="https://www.freecrm.com/index.html";
		   String acturalURL = DriverSetup.chromeDriver.getCurrentUrl();
		   Assert.assertEquals(acturalURL, expectedURL);
		}
	}


}
