package Automation;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Facebook_login_test {
	WebDriver driver;
	
	@BeforeClass
	public void loginfacebook() 
	{
	  driver=Locator.openBrowser("https://www.facebook.com/");

	}
	
		
	@Test
	public void setvalidCredinital() throws InterruptedException {
		
	Facebooklogin_page_object facebook=new Facebooklogin_page_object(driver);
		
	Thread.sleep(4000);
		facebook.setemail("vaishali.tilekar1793@gmail.com");
		facebook.setpassword("vaishu@1234");
		facebook.clickonsubmit();
	}
	
	/*@Test
	public static void main(String[] args) throws InterruptedException {
		Facebook_login_test obj=new Facebook_login_test();
		obj.setvalidCredinital();
	}*/
	
/*	@AfterTest
	public void closed()
	{
		driver.close();
	}*/

}
