package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MoseDropdragmany {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=Locator.openBrowser("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement iframe=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);
		
	List<WebElement> source=driver.findElements(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle']"));
	int s=source.size();   //to get the size of list
	
	WebElement destination=driver.findElement(By.xpath("//div[@id='trash']"));
	
	Actions act=new Actions(driver);
	
	for(int i=0;i<s;i++)
	{
		WebElement image=source.get(i);  //get method is used to get the value from list
		act.dragAndDrop(image, destination).perform();
		Thread.sleep(2000);
		
	}
	List<WebElement> Restore=driver.findElements(By.xpath("//a[@title='Recycle this image']"));
	int ForResto=Restore.size();
	
	for(int j=0;j<ForResto;j++)
	{
		WebElement Backreturn=Restore.get(j);
		Backreturn.click();
		Thread.sleep(3000);
	}
	
	
	}

}
