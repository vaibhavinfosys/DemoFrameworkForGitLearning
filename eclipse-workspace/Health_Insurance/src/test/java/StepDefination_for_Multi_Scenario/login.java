package StepDefination_for_Multi_Scenario;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
	
	@When("user enter username and password and click on the login button")
	public void user_enter_username_and_password_and_click_on_the_login_button() {
		
	
	    System.out.println("enter usrename and password");
	    
	}

	@Then("system naviaget to the homepage")
	public void system_naviaget_to_the_homepage() {
	    System.out.println("navigate to the homepage");
	}


}
