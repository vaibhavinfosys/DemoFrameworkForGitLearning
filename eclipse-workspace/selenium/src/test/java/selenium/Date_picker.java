package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Date_picker {
	
	@Test
	public void  handleDatePicker() throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver(); // ------- IMP quetion 
		
		driver.get("http://demo.guru99.com/test/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement datePicker=driver.findElement(By.xpath("//input[@name='bdaytime']"));
		
		Thread.sleep(2000);
		
		datePicker.sendKeys("09052024");
		
	}

}
