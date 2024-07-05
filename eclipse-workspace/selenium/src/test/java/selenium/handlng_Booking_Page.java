package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class handlng_Booking_Page extends Base_Class{
	@Test
	public void HandlingBookingpage() throws Throwable {
		
		
		  WebElement pupup = driver.findElement(By.xpath( "/html/body/div[19]/div/div/div/div[1]/div[1]"));
		 
		Boolean  checkingElement=pupup.isDisplayed();
		
		System.out.println(checkingElement);
		
		if(checkingElement==true) {
			
			Thread.sleep(8000);
			driver.findElement(By.xpath("/html/body/div[19]/div/div/div/div[1]/div[1]/div/button")).click();
			
		}

		 
		
		WebElement inputfield=driver.findElement(By.xpath("//*[@id=\":re:\"]"));
		
		inputfield.clear();
		
		inputfield.sendKeys("New Delhi",Keys.ARROW_DOWN,Keys.ENTER);
		
	}
	
	

}
