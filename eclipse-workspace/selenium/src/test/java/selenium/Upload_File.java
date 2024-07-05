package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import ch.qos.logback.core.joran.action.Action;

public class Upload_File extends Base_Class {
	
	@Test
	public void uploadFile() {
		
		Actions act=new Actions(driver);
		
		WebElement file=driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		
		/*
		 * file.sendKeys("‪C:\\Users\\Dell\\Desktop\\Reporting.tx");
		 */
		
		
		
		act.moveToElement(file).perform();
		
		file.sendKeys("C:\\\\Users\\\\Dell\\\\Desktop\\\\Reporting.txt");
	
		
		
		
	}

}
