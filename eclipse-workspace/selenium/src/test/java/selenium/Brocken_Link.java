package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Brocken_Link extends Base_Class {
	@Test
	public void BrockenLink() throws Throwable, Throwable {
		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		
		int statusCode=200;
		
		for(WebElement allLinks:link ) {
			
			String links = allLinks.getAttribute("href");
			
			System.out.println(links);
			
			try {
			
			HttpURLConnection huc = (HttpURLConnection)(new URL(links).openConnection());
			
			huc.setRequestMethod("HEAD");
			
			huc.connect();
			
			huc.getResponseCode();
			
			if(statusCode>=400) {
				
				System.out.println(links + " is Brocken Link " + link.size());
				
				
			}
			
			else {
				
				System.out.println(links + "Valid Link");
			}
			
			}
			
			catch(Exception e) {
				
				e.printStackTrace();			}
			
			
		}
		
		System.out.println(link.size());
		
		
		
	
		
	
		
		
	}

}
