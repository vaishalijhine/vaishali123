package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseDropDrag {
	public static void main(String[] args) {
		WebDriver driver=Locator.openBrowser("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement iframe=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);
		
		WebElement source=driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'])[1]"));
	
	WebElement destination=	driver.findElement(By.xpath("//div[@id='trash']"));
	
	Actions act=new Actions(driver);
	
	act.dragAndDrop(source, destination).perform();
	
	
	}

}
