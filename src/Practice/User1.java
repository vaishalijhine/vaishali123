package Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class User1 {
	public static void vaishali(WebDriver driver,String name) throws IOException {
		
		TakesScreenshot tc= ((TakesScreenshot)driver);
		
		File a1= tc.getScreenshotAs(OutputType.FILE);
		
		File a2= new File("C:\\img\\"+name+".jpg");
		
		FileHandler.copy(a1, a2);
		
	}

}
