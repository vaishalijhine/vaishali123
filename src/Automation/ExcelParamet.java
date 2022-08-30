package Automation;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExcelParamet {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		WebDriver driver=Locator.openBrowser("https://www.facebook.com/");
		
		String emailid=Parametarization.getData("vaishu1", 0, 0);
		String password=Parametarization.getData("vaishu1", 1, 0);
		
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys(emailid);
		
		WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
		pass.sendKeys(password);
		
	}

}
