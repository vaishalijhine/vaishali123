package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Automation.Locator;

public class ewSide {
	public static void main(String[] args) {
		WebDriver driver=Locator.openBrowser("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	
	//	WebElement Alert1=driver.findElement(By.xpath("//input[@value='Alert']"));
	//	Alert1.click();
		
		
	//	driver.switchTo().alert().accept();
		
		WebElement prompt=driver.findElement(By.xpath("//input[@value='Prompt']"));
		prompt.click();
		
		 Alert a=driver.switchTo().alert();
		 a.sendKeys("abc");
		 a.dismiss();
	}

}
