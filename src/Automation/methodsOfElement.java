package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class methodsOfElement {
	public static void main(String[] args) {
		WebDriver driver=Locator.openBrowser("https://demo.guru99.com/test/radio.html");
		
		WebElement radio=driver.findElement(By.xpath("//input[@value='Option 2']"));
		
		
		
		boolean status=radio.isSelected();
		System.out.println(status);
		
		radio.click();
		
		boolean newStatus=radio.isSelected();
		System.out.println(newStatus);
		
		
	}

}
