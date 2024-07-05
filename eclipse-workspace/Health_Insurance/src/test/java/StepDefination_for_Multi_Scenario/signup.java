package StepDefination_for_Multi_Scenario;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class signup {
	
	@When("user enter all field and click on the create button")
	public void user_enter_all_field_and_click_on_the_create_button() {
	    System.out.println("Enter the registration all field" );
	}

	@Then("user successful registrate the respective page.")
	public void user_successful_registrate_the_respective_page() {
	    System.out.println("Validate the registration page");
	}

}
