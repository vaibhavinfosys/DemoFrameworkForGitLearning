package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_Upload {
	
	@Test
	public void uploadFile() throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		
		WebElement element=driver.findElement(By.xpath("//input[@id='input-4']"));
		
		Thread.sleep(2000);
		
		element.sendKeys("C:\\Users\\Dell\\Desktop\\IMP Quetions.txt");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='file-input']/descendant::button[@class='btn btn-default fileinput-remove fileinput-remove-button']")).click();
	}

}
