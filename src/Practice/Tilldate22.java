package Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Tilldate22 {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver= ReturnClass.OpenBrowser("https://vctcpune.com/selenium/practice.html");
		
	/*	WebElement Radio=driver.findElement(By.xpath("//input[@name='webform']"));     //click....method of webElement
		
		boolean a= Radio.isSelected();     //isselected
		System.out.println(a);
		Radio.click();

	//	Thread.sleep(4000);
		
		WebElement show=driver.findElement(By.xpath("//input[@name='show-hide']"));
		
		boolean b=show.isDisplayed();
		System.out.println(b);
		show.sendKeys("vaishu");
		
		WebElement hide=driver.findElement(By.xpath("//input[@value='Hide']"));
		hide.click();
		
		boolean c=show.isDisplayed();
		System.out.println(c);
		
		
		WebElement heading=driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']"));   //xpath by text
	      String welcome=heading.getText();   //gettext
	      System.out.println(welcome);
	
	      
	  WebElement dropdown= driver.findElement(By.xpath("//select[@id='dropdown-class-example']")); //select[@id=dropdown-class-example]
		
	  Select a=new Select(dropdown);
		
	a.selectByIndex(1);
//	a.selectByValue("Option2");
	//a.selectByVisibleText("Option3");*/
		
		
	TakesScreenshot sc=((TakesScreenshot) driver);
	
	File Source=sc.getScreenshotAs(OutputType.FILE);
	
	File destination= new File("C:\\img\\facebook1.jpg");
		
	FileHandler.copy(Source,destination);
		
	
	
	
		
		
	}

}
