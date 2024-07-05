package StepDefination_for_Multi_Scenario;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class homepage {
	
	
	@When("user land on the Homepage.")
	public void user_land_on_the_homepage() {
		
	    System.out.println("User on the hompages");
	
	}

	@Then("User valiadte to the Homepage text and any thank you message")
	public void user_valiadte_to_the_homepage_text_and_any_thank_you_message() {
	    System.out.println("Validate the text which are present in the homepage");
	}


}
