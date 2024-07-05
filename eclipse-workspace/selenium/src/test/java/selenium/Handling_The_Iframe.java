package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Handling_The_Iframe extends Base_Class {
	
	@Test
	 public void handleIframe() {
		
		// switch to respective frame
		
	//	driver.switchTo().frame("aswift_2");
		
		String text = driver.findElement(By.xpath("// h3[text()='Reported Cases and Deaths by Country or Territory        ']")).getText();
		 
		 System.out.println(text);
		 
		 List<WebElement> frame = driver.findElements(By.tagName("iframe"));
		 
		 System.out.println(frame.size());
		 
		 
		 
		
		 
	 }

}
