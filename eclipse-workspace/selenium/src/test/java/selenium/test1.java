package selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {
	
	@Test
	public void test() throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Selenium");
		
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("")).click();
		
		List<WebElement> listOfElement=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='lnnVSe']"));
		
		
		System.out.println(listOfElement.size());
		for(WebElement e:listOfElement) {
			
			   String text=e.getText();
			   
			   System.out.println(text);
			   
			   if(text.contains("selenium tutorial")) {
				   
				   e.click();
				   
				   break;
			   }
		}
  
		
		
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[3]/div/div/div[1]/div/div/span/a/h3")).click();
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,5000)");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div/footer/div/div/div[1]/ul/li[2]")).click();
		
		// Window Handling Start
		
		String mainWindow=driver.getWindowHandle();
		
		Set<String> windows=driver.getWindowHandles();
		
		ArrayList<String> al=new ArrayList<String>(windows);
		
		for(String window:al) {
			
		String	title=driver.switchTo().window(window).getTitle();
		
		if(title.equals("Selenium (@SeleniumHQ) / X")) {
			
		String text1=driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div/div/div[3]/div/div/div/div/div[2]/div[1]/div/div[2]/div/div/div/span")).getText();
		
		System.out.println(text1);
		
		break;
		
	}
		
}
		
		
		
		driver.switchTo().window(mainWindow);
		
		String text2=driver.findElement(By.xpath("//h1[text()='Getting started']")).getText();
		
		System.out.println(text2);
		
		if(text2.equalsIgnoreCase("Getting started")) {
			
			System.out.println("Confirmed we are in the main the windows");
		}
   
		else {
			
			System.out.println("Need to  refer the chat GPT");
		}
   
   
		
	}

}

