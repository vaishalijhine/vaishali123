package POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Automation.Locator;

public class Table1 {
	public static void main(String[] args) {
		WebDriver driver=Locator.openBrowser("https://demo.guru99.com/test/web-table-element.php");

		WebElement cname=driver.findElement(By.xpath("//table//tbody//tr[2]//td[1]"));
		System.out.println(cname.getText());
		
		WebElement price=driver.findElement(By.xpath("//table//tbody//tr[4]//td[4]"));
		System.out.println(price.getText());
		
		List<WebElement> tableprice=driver.findElements(By.xpath("//table[1]//tbody//tr//td[4]"));
		double max=0;
		for(int i=1;i<tableprice.size();i++)
		{
			WebElement coloumprice=tableprice.get(i);
			String pricelist=coloumprice.getText();
			double value=Double.parseDouble(pricelist);
			
			if(value >max)
			{
				max=value;
			}
		}
		System.out.println("Maxprice" + max);

	}

}
