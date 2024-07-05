package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Home_page {
	
	// Declaration
	
	 @FindBy(xpath = "//span[text()='Admin']")private WebElement admin;
	 
	 @FindBy(xpath = "//h5[text()='System Users']") private WebElement text;
	 
	 
	 // initialization
	 
	 public Home_page(WebDriver driver) {
		 
		 PageFactory.initElements( driver,this);
	 }
	 
	 // implementation
	 
	 public void userClickOntheadminLink() {
		 
		 admin.click();
	 }
	 
	 
 public void verifyText() {
		 
	 String actualText=text.getText();
	 
	 String expectedText="System Users";
	 
	 Assert.assertEquals(actualText, expectedText, "User are not in the Admin page");
	 
	 
	 
	 }
	 
	 
	 

}
