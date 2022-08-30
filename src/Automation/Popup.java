package Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Popup {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= Locator.openBrowser("https://vctcpune.com/selenium/practice.html");
	
		WebElement alert=driver.findElement(By.id("alertbtn"));
	    alert.click();
	    
	  //  Thread.sleep(5000);
	    
	    Alert a= driver.switchTo().alert();
	    
	    Thread.sleep(5000);

	    a.accept();

	
	}

}
