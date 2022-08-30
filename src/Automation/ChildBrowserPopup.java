package Automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChildBrowserPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= Locator.openBrowser("https://vctcpune.com/");
		
	//	String handle=driver.getWindowHandle();
	//	System.out.println(handle);
		
		WebElement practice=driver.findElement(By.xpath("//a[text()='Start Selenium Practice']"));
		practice.click();
		
		
		Set<String> handles=driver.getWindowHandles();
	//	System.out.println(handles);
		Iterator<String> a=handles.iterator();

while(a.hasNext())
{
	String handle=a.next();
	
	driver.switchTo().window(handle);
	String currentpageTitle=driver.getTitle();
	System.out.println(currentpageTitle);
	
	if(currentpageTitle.equals("Practice Page"))
	{
		Thread.sleep(4000);
		WebElement radio=driver.findElement(By.xpath("//input[@name='radio'][3]"));
		radio.click();
		
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));
		checkbox.click();

	}
	
	}
		
		
	}

}
