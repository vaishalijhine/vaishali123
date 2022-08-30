package Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	public static void main(String[] args) {
		WebDriver driver=Locator.openBrowser("https://demo.guru99.com/test/simple_context_menu.html");
		
		//WebElement dclick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Actions act=new Actions(driver);
	//	act.doubleClick(dclick);  //to double click on webpage element
	//	act.perform();
		
		//driver.switchTo().alert().accept();
		
		WebElement rclick=driver.findElement(By.xpath("//span[text()='right click me']"));
		act.contextClick(rclick);
		act.perform();
		
	WebElement copy=driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-copy']"));
	copy.click();
	
	driver.switchTo().alert().accept();
	}

}
