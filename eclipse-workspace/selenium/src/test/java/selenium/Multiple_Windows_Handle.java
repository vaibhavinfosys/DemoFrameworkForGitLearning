package selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Multiple_Windows_Handle extends Base_Class {
	
	@Test
	public void wondowsHandles() throws Throwable  {
		
		// Click on the FaceBook
		
				JavascriptExecutor jse=(JavascriptExecutor)driver;
				
				 jse.executeScript("window.scrollBy(0,50000)");
				
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//a[@href='https://www.facebook.com/Selenium2.WebDriver']")).click();
					
				// Click on the twitter
				
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//a[@href='https://twitter.com/SeleniumHQ']")).click();
				
				  Set<String> windows = driver.getWindowHandles();
				  
				  List<String> WList = new ArrayList<String>(windows);
				  
				  for (String adress:WList) {
					  
					  System.out.println(adress);
				  }
				  
				  if(this.SwitchToRightWindows("Selenium (WebDriver) | Facebook", WList)) {
					  
					  System.out.println(driver.getCurrentUrl() + " : " + driver.getTitle());
					  
					    
				  }
				  
				 
				  
		}
	
	public Boolean SwitchToRightWindows(String windowTitle,List<String> WList) {
		

		for(String e:WList) {
			
			String title = driver.switchTo().window(e).getTitle();
			
			if(title.contains(windowTitle)) {
				
				System.out.println("We are in the right windows");
				
				return true;
			}
			
			
		}
		
		return false;
		
		
	}

}
