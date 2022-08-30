package Automation;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

public class BrowserSize {
	public static void main(String[] args) {
		WebDriver driver=Locator.openBrowser("https://www.facebook.com/");
		
		Dimension d=new Dimension(400,600);
		driver.manage().window().setSize(d);
		
	
		
		Point p=new Point(300,400);
	    driver.manage().window().setPosition(p);
	}

}
