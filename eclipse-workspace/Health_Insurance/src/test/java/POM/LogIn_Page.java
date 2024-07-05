package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LogIn_Page {
	
	// Declaration
	
	@FindBy(xpath = "//input[@name='username']")private WebElement userName;
	
	@FindBy(xpath = "//input[@name='password']")private WebElement passWord;
	
	@FindBy(xpath = "//button[@type='submit']")private WebElement clkOnLoginBtn;
	
	@FindBy(xpath = "//button[@type='submit']")private WebElement verifyLoginBtn;
	
	@FindBy(xpath = "//img[@src='/web/images/orangehrm-logo.png?v=1711595107870']")private WebElement verifyLogo;
	
	
	
	// initialization
	
	public LogIn_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	// Declaration 
	
	public void EnterUserName(String username) {
		
		
		userName.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		
		passWord.sendKeys(password);
	}
	
	public void clickOntheLoginButton() {
		
		clkOnLoginBtn.click();
		
	}
	
	public void verifyUserOntheloginPage() {
		
		Boolean result=verifyLoginBtn.isDisplayed();
		
		System.out.println(result);
		
		Assert.assertEquals(result, true," user not in the login page");
	}
	
	public void verifylogo() {
		
		Boolean RESULT=verifyLogo.isDisplayed();
		
		System.out.println(RESULT);
		
		Assert.assertEquals(RESULT,true,"User are not in the homepage");
	}
	
	
}
