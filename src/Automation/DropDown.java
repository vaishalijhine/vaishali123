package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		WebDriver driver=Locator.openBrowser("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		WebElement products=driver.findElement(By.xpath("//select[@id='first']"));
		Select select=new Select(products);
	//	select.selectByIndex(2);
		select.selectByValue("Google");
	//	select.selectByVisibleText("Yahoo");
	}

}
