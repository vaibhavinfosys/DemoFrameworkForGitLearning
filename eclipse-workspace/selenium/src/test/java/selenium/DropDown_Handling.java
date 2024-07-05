package selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import ch.qos.logback.classic.pattern.Util;

public class DropDown_Handling extends Base_Class {
	
	@Test
	public void handleDropDown() throws Throwable {
		
	  WebElement dropDown = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	  
	  // click on the create new Account
	  
	  dropDown.click();
	  
	  WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	  
	         
		
		Select s=new Select(year);
	
		
		List<WebElement> op = s.getAllSelectedOptions();
		
		   
		
		
		int numberOfCount = op.size();
		
		System.out.println(numberOfCount);
		
		
		for(WebElement options:op) {
			
			String listOfYear=options.getText();
			
			System.out.println(listOfYear);
			
		}
		
		
		
		
		
		
	}

}
