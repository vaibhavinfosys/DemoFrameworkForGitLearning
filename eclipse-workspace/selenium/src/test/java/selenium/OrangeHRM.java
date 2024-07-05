package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRM  extends Base_Class{	
	@Test
	
	public void child_Xpath_Axes() {
		
		 List<WebElement> list = driver.findElements(By.xpath("//ul[@class='oxd-main-menu']/child::li"));
		 
		 int size=list.size();
		 
		 System.out.println(size);
		 
			  for(WebElement elements:list) {
			  
			  String text=elements.getText();
			  
			  System.out.println( text);
			  
			  }
			 
		 List<String> Actuallist=new ArrayList<String>();
		 
		 int listSize=Actuallist.size();
		 
		 for(WebElement elements:list) {
			 
			 Actuallist.add(elements.getText());
			 
		 }
		 
		 for(String values:Actuallist) {
			 
			 System.out.println(values);
		 }
		 
		 System.out.println("List stored in Collection is "+ Actuallist);
		 
		 
		 
		 List <String> ExpectedList=new ArrayList<String>();
		 
		 ExpectedList.add("Admin");
		 
		 ExpectedList.add("PIM");
		 
		 ExpectedList.add("Leave");
		 
		 ExpectedList.add("Time");
		 
		 ExpectedList.add("Recruitment");
		 
		 ExpectedList.add("My Info");
		 
		 ExpectedList.add("Performance");
		 
		 ExpectedList.add("Dashboard");
		 
		 ExpectedList.add("Directory");
		 
		 ExpectedList.add("Maintenance");
		 
		 ExpectedList.add("Claim");
		 
		 ExpectedList.add("Buzz");
		 
	   Assert.assertEquals(Actuallist, ExpectedList,"List are not matched");
	   
	   
		 
		
		
	}

}
