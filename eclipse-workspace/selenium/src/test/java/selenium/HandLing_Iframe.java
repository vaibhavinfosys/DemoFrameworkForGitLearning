package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandLing_Iframe extends Base_Class {

	@Test
	public void Handle_Iframe() throws Throwable {

		/*
		 * WebElement singleFrame =
		 * driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		 * 
		 * driver.switchTo().frame(singleFrame);
		 * 
		 * int mainFrameHashcode=driver.switchTo().frame(singleFrame).hashCode();
		 * 
		 * System.out.println("HashCode for main frame is " + mainFrameHashcode);
		 * 
		 */

		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();

		WebElement multiFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));

		driver.switchTo().frame(multiFrame);

		

		WebElement frame = driver.findElement(By.xpath("//h5[text()='Nested iFrames']"));

		System.out.println(frame.getText());

		WebElement childFrame = driver
				.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));

		driver.switchTo().frame(childFrame);

		
		

		WebElement first_Frame = driver.findElement(By.xpath("//input[@type='text']"));

		Thread.sleep(3000);

		first_Frame.sendKeys("vaibhav");

		Thread.sleep(3000);

		first_Frame.clear();

		int hashcode = driver.switchTo().parentFrame().hashCode();

		System.out.println("parent frame Hashcode is " + hashcode);

		WebElement Main_Frame = driver.findElement(By.xpath("//input[@type='text']"));

		Main_Frame.sendKeys("vaibhav");

	}

}
