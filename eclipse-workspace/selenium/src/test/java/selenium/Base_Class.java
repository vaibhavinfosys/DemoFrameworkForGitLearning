package selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;
import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {
	
	WebDriver driver;
	
   @BeforeClass
   
   public void openBroweser() {
	   
            WebDriverManager.chromedriver().setup();
        
        driver=new ChromeDriver();
        
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     }
   
   @BeforeMethod
   
   public void login() {
	   
	   driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	   
	   driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	   
	   driver.findElement(By.xpath("//div[@class='oxd-form-actions orangehrm-login-action']/child::button[@type='submit']")).click();
	   
	   
	   
	   
	   Reporter.log("Log in to application" , true);
   }
   
   @AfterMethod
   
   public void logout() throws Throwable {
	   
	   
		/*
		 * driver.findElement(By.xpath(
		 * "//div[@class='oxd-topbar-header-userarea']/descendant::span[@class='oxd-userdropdown-tab']"
		 * )).click();
		 * 
		 * WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		 * 
		 * WebElement element =
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "//ul[@role='menu']/descendant::li/a[text()='Logout']")));
		 * 
		 * System.out.println(element.getText());
		 * 
		 * element.click();
		 */
	   Reporter.log("Logout the application " ,true);
   }
   
   @AfterClass
   
   public void closeBrowser() {
	   
	 // driver.close();
   }

}
