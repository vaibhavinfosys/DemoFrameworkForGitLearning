package selenium;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Takes_ScreenShot extends Base_Class {

@Test
	public void WindowsHandling() throws IOException, Throwable {
	
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	
	 jse.executeScript("window.scrollBy(0,50000)");
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//a[@href='https://www.facebook.com/Selenium2.WebDriver']")).click();
		
	// Click on the twitter
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//a[@href='https://twitter.com/SeleniumHQ']")).click();
	
	Set<String> windows=driver.getWindowHandles();
	
	System.out.println(windows);
	
	     int size=windows.size();
	     
	     System.out.println(size);
	
	ArrayList<String> al=new ArrayList<String>(windows);
	
	   for(String s:al) {
		   
		 String  title=driver.switchTo().window(s).getTitle();
		 
		   
		 
		 if(title.equals("Selenium (@SeleniumHQ) / X")) {
			 
			 WebElement Text = driver.findElement(By.xpath("(//span[text()='Selenium'])[1]"));
			 
			   System.out.println(Text.getText());
			   
			   int code = s.hashCode();
			   
			   System.out.println(code);
			   
			   break;
			 
			 
		 }
		 
		 else if (title.equals("Selenium (WebDriver) | Facebook")) {
			 
			 
			
		}
		 
	   }
	      
	      
	
	   driver.switchTo().window(al.get(0));
		 
		 Boolean view=driver.findElement(By.xpath("(//a[text()='About Selenium'])[2]")).isDisplayed();
		 
		 System.out.println(view);
		 
		 if(view==true) {
			 
			 System.out.println("we are in the main windows");
		 }
		 
		 else {
			 
			 System.out.println("we are in the other windows");
		 }
	
	
	
}
	
}
