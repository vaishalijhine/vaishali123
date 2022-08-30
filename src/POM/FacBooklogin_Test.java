package POM;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Automation.Facebooklogin_page_object;
import Automation.Locator;


public class FacBooklogin_Test {
	

		WebDriver driver;
		
		@BeforeClass
		public void loginfacebook() 
		{
			WebDriver driver=Locator.openBrowser("https://www.facebook.com/");

		}
		
			
		@Test
		public void setvalidCredinital() throws InterruptedException {
			
		Facebooklogin_page_object facebook=new Facebooklogin_page_object(driver);
			
		Thread.sleep(4000);
			facebook.setemail("vaishali.tilekar1793@gmail.com");
			facebook.setpassword("vaishu@1234");
			facebook.clickonsubmit();
		}
		
			}



