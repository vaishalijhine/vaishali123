package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Scroll {
	public static void main(String[] args) {
		
	WebDriver driver=Locator.openBrowser("https://demoqa.com/text-box");
	
	WebElement submit=driver.findElement(By.xpath("//button[@id='submit']"));
		
		//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",submit);
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(100,300)");
	}

}
