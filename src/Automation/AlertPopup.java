package Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertPopup {
	public static void main(String[] args) {
		
		WebDriver driver= Locator.openBrowser("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement button=driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		button.click();
		Alert a=driver.switchTo().alert();
		a.sendKeys("vaishu");
		System.out.println(a.getText());
		a.accept();
	//	a.dismiss();
	}

}
