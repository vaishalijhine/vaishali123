package Automation;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Window_popup {
	public static void main(String[] args) {
		WebDriver driver= Locator.openBrowser("https://vctcpune.com/selenium/practice.html");
	
		String a= driver.getWindowHandle();
		System.out.println(a);
		
		Set<String> b=driver.getWindowHandles();   //in set unique value save
	    System.out.println(b);
	}

}
