package selenium;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class List extends Base_Class {
	
	@Test
	public void getText() {
		
		
		 java.util.List<WebElement> list = driver.findElements(By.xpath("(//div[@class='oxd-grid-item oxd-grid-item--gutters orangehrm-dashboard-widget']/descendant::ul)[2]/li"));
		 
		 ArrayList<String> ArList=new ArrayList<String>();
		 
		
		 for(WebElement element:list) {
			 
			String  text=element.getText();
			 
			 System.out.println(text);
			 
			 ArList.add(text);
		 }
		 
		 System.out.println(ArList);
		 
		 System.out.println(ArList.size());
		 
		 java.util.List<WebElement> newList = driver.findElements(By.xpath("//ul[@class='oxd-main-menu']/descendant::li"));
		 
		int ActualSize=newList.size();
		 
		 ArrayList< String> NewTabList=new ArrayList<String>();
		 
		 
		 for(WebElement elemet:newList) {
			 
			 String tabListText = elemet.getText();
			 
			 System.out.println(tabListText);
			 
			 NewTabList.add(tabListText);
			 
		 }
		 
		 System.out.println(NewTabList);
		 
		int ExpectedSize = NewTabList.size();
		
	  if(ActualSize==ExpectedSize) {
		  
		  System.out.println("Test Case is Pass ---------------");
	  }
	  
	  else {
		  
		  
		  System.out.println("Test Case is Fail ----- ");
	  }
	  
	  driver.findElement(By.xpath("//div[@class='oxd-main-menu-search']/input[@class='oxd-input oxd-input--active']")).sendKeys("Admin");
	  
	  // providing the wait  for checking the autosuggestion
	  
	  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	  
	  java.util.List<WebElement> suggestion = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@class='oxd-main-menu']/descendant::li")));
	  
		 for(WebElement suggestions:suggestion) {
			 
			 String text=suggestions.getText();
			 
			 System.out.println(text);
			 
			 if(suggestions.getText().equals(text)) {
				 
				 suggestions.click();
			 }
		 }
		 
		 
		 // Enter the value in the System User Username field
		 
		 driver.findElement(By.xpath("//form[@class='oxd-form']/descendant::input[@class='oxd-input oxd-input--active']")).sendKeys("Admin");
		 
		 // choose user role
		 
		 driver.findElement(By.xpath("(//form[@class='oxd-form']/descendant::i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")).click();
		 
		 // select user role from dropDown
		 
		 java.util.List<WebElement> userRole = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@role='listbox']/descendant::span")));
		 
		 
		try{
			for(WebElement element:userRole) {
		
			
			String text = element.getText();
			
			System.out.println(text);
			
			if(element.getText().equals("Admin")) {
				
				element.click();
				
				
			}
			
			}
			
		}
			
			catch (Exception e) {
				
				e.printStackTrace();
			}
		
	
	// click on the PIM Tab
		
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/descendant::span[text()='PIM']")).click();
		
		// click on the add employee
		
		driver.findElement(By.xpath("//div[@class='oxd-topbar-body']/descendant::a[text()='Add Employee']")).click();
	
	// upload a file
		
		WebElement file=driver.findElement(By.xpath("//button[@class='oxd-icon-button oxd-icon-button--solid-main employee-image-action']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(file).sendKeys("C:\\\\\\\\Users\\\\\\\\Dell\\\\\\\\Pictures\\\\\\\\Screenshots\\\\\\\\Screenshot (4).png").perform();
		
		
	
	
	
	
	
	
	}
	 
		 
		 
		 
		
		 
		 
		 
	}


