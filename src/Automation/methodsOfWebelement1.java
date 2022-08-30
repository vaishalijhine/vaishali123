package Automation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Practice.User1;

public class methodsOfWebelement1 {
	public static void main(String[] args) throws IOException {
		WebDriver driver=Locator.openBrowser("https://vctcpune.com/selenium/practice.html");
		
		WebElement text=driver.findElement(By.xpath("//input[@name='show-hide']"));
		text.sendKeys("velocity");
		
		
		User1.vaishali(driver, "abc");   //user define screenshot method
		
		boolean status=text.isDisplayed();
		System.out.println(status);
		
		WebElement hide=driver.findElement(By.xpath("//input[@value='Hide']"));
		hide.click();
		
	boolean newstatus=	text.isDisplayed();
	System.out.println(newstatus);
	}

}
