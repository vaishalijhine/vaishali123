package Automation;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot1 {
	public static void takeScreenshot(WebDriver driver,String name) throws IOException {
		
		String date=ScreenShot1.getDate();
		TakesScreenshot sc=((TakesScreenshot)driver);  //upcast driver to screenshot
		
		File source=sc.getScreenshotAs(OutputType.FILE);
		
		File destination= new File("C:\\img\\"+name+""+date+".jpg");
		
		FileHandler.copy(source, destination);
	
}
	
	public static String getDate()
	{
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MMM-dd HH-mm-ss"); //format the time date and time as required
		LocalDateTime currentTime=LocalDateTime.now();  //return current time
		
		String d=dtf.format(currentTime);//format the time given by now() method to required format and return String
		return d;
	}
	}
