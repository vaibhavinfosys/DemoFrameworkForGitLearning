package StepDefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.LogIn_Page;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Steps {
	
	WebDriver driver;
	
	LogIn_Page page;
	
	
	
	@Before
	public void openBrowserORSettingUp() {
		
		WebDriverManager.chromedriver().setup();
		
		 driver=new ChromeDriver();
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 
		
	}
	
	@After
	
	public void closeBrowserORTearDown () throws Throwable {
		
		System.out.println("Browser Close ");
		
	}
	
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
	 
		page=new LogIn_Page(driver);
		
	    page.verifyUserOntheloginPage();
		
		
	}

	@When("User enter UserName as {string} and password as {string}")
	public void user_enter_user_name_as_and_password_as(String username, String password) {
	    
		page=new LogIn_Page(driver);
		
		page.EnterUserName(username);
		
		page.enterPassword(password);
		
		
	}

	@When("User click on the login button")
	public void user_click_on_the_login_button() {
	   
		page=new LogIn_Page(driver);
		
		page.clickOntheLoginButton();
		
	}

	@Then("System should show the homepage")
	public void system_should_show_the_homepage() {
		page=new LogIn_Page(driver);
		
		page.verifylogo();
		
		
	}

}
