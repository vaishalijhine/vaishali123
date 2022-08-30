package POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Automation.Locator;

public class Table {
	public static void main(String[] args) {
		WebDriver driver=Locator.openBrowser("https://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> headings=driver.findElements(By.xpath("//table//thead//th"));
		
		for(int i=0;i<headings.size();i++)
		{
			WebElement head=headings.get(i);
			System.out.println(head.getText());
		}
	}

}
