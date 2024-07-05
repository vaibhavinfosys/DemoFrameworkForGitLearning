package selenium;

import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FindTheBrockenlink extends Base_Class{
	
	
	@Test
	public void findBrckenlink() {
		
		
		 List<WebElement> link = driver.findElements(By.tagName("a"));
		 
		 for(WebElement links:link) {
			 
		String	alllinks= links.getAttribute("href");
		
		
		
		try {
			
			
			HttpsURLConnection huc=(HttpsURLConnection)(new URL(alllinks)).openConnection();
			
			huc.setRequestMethod("HEAD");
			
			huc.connect();
			
			int responsecode = huc.getResponseCode();
			
			if(responsecode>=400) {
				
				System.out.println(alllinks + responsecode + "Brocken Link" );
				
				
			}
			
			else {
				
				System.out.println(alllinks + responsecode + "Valid  Link");
			}
			}
			
			
			
			
			
		
		 
		 catch (Exception e) {
			
			 e.printStackTrace();
		}
			 
			 
		 }
		
	}

}
