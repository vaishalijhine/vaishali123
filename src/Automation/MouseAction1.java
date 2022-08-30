package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseAction1 {
	public static void main(String[] args) {
	WebDriver driver=Locator.openBrowser("https://www.amazon.in/");
		
	WebElement signIn=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));	
	
	Actions act=new Actions(driver);
	
	act.moveToElement(signIn).perform();
	
	WebElement wis=driver.findElement(By.xpath("//span[text()='Your Wish List']"));
	wis.click();
		
		
	}

}
