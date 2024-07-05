package selenium;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class find_Brocken_Image {
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.worldometers.info/world-population/india-population/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> image = driver.findElements(By.tagName("img"));
		
		for(WebElement images:image) {
			
			  String src=images.getAttribute("src");
			  
			  
			  try {
				  
				HttpsURLConnection huc=(HttpsURLConnection)(new URL(src)).openConnection();
				
						huc.setRequestMethod("HEAD");
						
						huc.connect();
						
						int responceCode=huc.getResponseCode();
						
						if(responceCode>=400) {
							
							System.out.println(src+" -- Brocken images");
						}
						
						else {
							
							System.out.println(src + " -- Valid image ");
						}
						
						
			 }
			  
			  catch(Exception e) {
				  
				  e.getStackTrace();
			  }
		}
		
		
	}

}
