package Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import Automation.Locator;

public class UserDefine {
	public static void TakesScreenshot() throws IOException {
		
		WebDriver driver= Locator.openBrowser("https://vctcpune.com/selenium/practice.html");
		
		TakesScreenshot tc= ((TakesScreenshot)driver);
		
	File source =  tc.getScreenshotAs(OutputType.FILE);
	
	File destination= new File("C:\\img\\v1.jpg");
	
	FileHandler.copy(source, destination);
	}	

}
