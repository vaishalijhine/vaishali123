package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=Locator.openBrowser("https://demoqa.com/text-box");
		
		WebElement fname=driver.findElement(By.xpath("//input[@id='userName']"));
		fname.sendKeys("vaishali Rahul Jhine");
		
		Actions act=new Actions(driver);
		
		act.sendKeys(Keys.TAB);
		
		act.sendKeys("vaishali.tilekar1793@gmail.com");
		
		act.sendKeys(Keys.TAB);
		
		act.sendKeys("Pune ");
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		
		act.sendKeys(Keys.TAB);
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.sendKeys(Keys.TAB);

		act.build().perform();
		
		Thread.sleep(5000);
		WebElement sub=driver.findElement(By.xpath("//button[@id='submit']"));
		sub.click();
		

		
	}

}
