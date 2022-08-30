package Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Iframe {
	public static void main(String[] args) {
		WebDriver driver=Locator.openBrowser("https://vctcpune.com/selenium/practice.html");
		
		
	//	driver.switchTo().frame(0);   //switch to frame by index
	//	driver.switchTo().frame("iframe-name");   //switch to frame by id or name
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='courses-iframe']")));   //switch to frame by Webelement

		WebElement course=driver.findElement(By.xpath("(//a[text()='Courses'])[1]"));
		course.click();
		
		//driver.switchTo().defaultContent();// will switch the focus to main page
		
		driver.switchTo().parentFrame();
		WebElement alert=driver.findElement(By.xpath("//input[@id='alertbtn']"));	
		alert.click();
		
	//	Alert a=driver.switchTo().alert();
	//	a.accept();
		
		

	}

}
