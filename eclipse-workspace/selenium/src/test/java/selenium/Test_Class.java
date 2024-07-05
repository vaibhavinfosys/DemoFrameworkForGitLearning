package selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_Class extends Base_Class {
	
	@Test
	
	public void windowHandleScenario() throws Throwable {
	
		// Click on the FaceBook
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		 jse.executeScript("window.scrollBy(0,50000)");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@href='https://www.facebook.com/Selenium2.WebDriver']")).click();
			
		// Click on the twitter
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@href='https://twitter.com/SeleniumHQ']")).click();
	
	     
		Set<String> windows = driver.getWindowHandles();
		
	      List<String> id=new ArrayList<String>(windows);
	      
	     //  Test_Class test=new Test_Class(); 
	      
	     if( this.SwitchToRightWindow("Selenium (WebDriver) | Facebook",id)) {
	    	 
	    	 System.out.println(driver.getCurrentUrl() +" : " + driver.getTitle());
	    	 
	    	 
	     }
		
		
		}
	
	public  Boolean SwitchToRightWindow(String windowTitle, List<String> id) {
		
		
		for(String e:id) {
			
			String title = driver.switchTo().window(e).getTitle();
			
			if(title.contains(windowTitle)) {
				
				System.out.println("We are in the Right windows..");
				
				return true;
			}
		}
		
		return false;
		
		
		
		
		      
		
		
		/*
		 * String mainWindow = id.get(0);
		 * 
		 * String childWindow = id.get(1);
		 * 
		 * System.out.println(mainWindow);
		 * 
		 * System.out.println(childWindow);
		 * 
		 * //driver.switchTo().window(mainWindow);
		 * 
		 * driver.switchTo().window(childWindow);
		 * 
		 * 
		 * 
		 * String title = driver.getTitle();
		 * 
		 * System.out.println(title);
		 */
		
	//	String text1=driver.findElement(By.xpath("//h2[text()='Donate to Selenium']")).getText();
		 
	//	System.out.println(text1);
		
		
		
   // switch to 
		
		
	
	
	}

}
