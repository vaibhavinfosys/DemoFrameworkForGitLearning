package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automate_Form {
	
	@Test
	
	public void automate_Form_CitiusTech_Pune () throws Throwable{
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://phptravels.com/demo");
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		// first name

		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Vaibhav");

		// LAST NAME
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Hulwan");

		// Business name


		driver.findElement(By.xpath("//input[@name='business_name']")).sendKeys("Testing");


		// Email

		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("vaibhavhulwan95@gmail.com");


		WebElement number1=driver.findElement(By.xpath("//div[@class='d-flex mt-4 mt-lg-0']/descendant::span[@id='numb1']"));

		String text1=number1.getText();


		WebElement number2=driver.findElement(By.xpath("//div[@class='d-flex mt-4 mt-lg-0']/descendant::span[@id='numb2']"));


		 String text2=number2.getText();
		 
		 
		 // convert String to int
		 
		int value1=Integer.parseInt(text1);
		
		int value2=Integer.parseInt(text2);
		
		// Adding two number(value1+value2)
		
		int addition = value1+value2;
		
		// convert the int to string
		
	    String result= String.valueOf(addition);
	    
	    
		 

	

		driver.findElement(By.xpath("//div[@class='d-flex mt-4 mt-lg-0']/descendant::input[@id='number']")).sendKeys(result);

		// click on submit button
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[text()='Submit']")).click();

        Thread.sleep(2000);
        
		WebElement validation=driver.findElement(By.xpath("//div[@class='completed']/descendant::strong[text()=' Thank you!']"));

		String ActText=validation.getText();
		
	String	ActTextWithoutSpace=ActText.replaceAll("[^a-zA-Z0-9]", "");
	
	String lowerCaseText = ActTextWithoutSpace.toLowerCase();
	
	System.out.println(lowerCaseText);
		
		

	 String expectedtext="thankyou";

		Assert.assertEquals(lowerCaseText, expectedtext,"Text are fail");
		
	}

}
