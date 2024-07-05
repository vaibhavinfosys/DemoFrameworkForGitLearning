package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;

public class Colour_Validate  extends Base_Class{
	
 @Test
	public void ColourValidate() {
	
	   WebElement recoverdCount=driver.findElement(By.xpath("(//span[text()='675,392,251'])[1]"));
	   
	   String getCss = recoverdCount.getCssValue("color");
	   
	   System.out.println(getCss);
	   
	   String color = Color.fromString(getCss).asHex();
	       
	   System.out.println(color);
	   
	   
}

}
