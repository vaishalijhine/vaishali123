package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locator1 {
public static void main(String[] args)  {
	WebDriver driver=Locator.openBrowser("https:/www.facebook.com/");
	
	WebElement email=driver.findElement(By.id("email"));    //locating element by id
	email.sendKeys("velocity");
	
//	WebElement pass=driver.findElement(By.name("pass"));    //locating element by name
//	pass.sendKeys("Katraj");
	
	//WebElement login=driver.findElement(By.tagName("button"));   //by tagname
	//login.click();
	
//	WebElement forgot=driver.findElement(By.className("_6ltj"));  //duplicate
//	forgot.click();
	
	  //css cannot find with and cannot make locator unique if we have multiple matching
	
//	WebElement create=driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
 //   create.click();   //by css
    
//   WebElement createpage= driver.findElement(By.partialLinkText("Create a Page"));
//   createpage.click();
	
	WebElement emailid=driver.findElement(By.xpath("//input[@id='email']"));    //xpath by attribute
	emailid.sendKeys("vaishali");
	
//	WebElement forgotten=driver.findElement(By.xpath("//a[text()=\"Forgotten password?\"]"));   //xpath by text
//	forgotten.click();
	
	
	//WebElement contain=driver.findElement(By.xpath(""));    //by contains xpath
	
//	WebElement index=driver.findElement(By.xpath("(//input[@id='pass'])[1]"));  //xpath by index
//	index.sendKeys("vaishal1i");
	
	WebElement email1=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
	email1.sendKeys("Rahul");
	
}
}
