package POM;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Automation.Locator;
import POM.ZerodhaKitePOM;


public class ZerodhaLoginTest {
	
	@Test
	public void loginzerodha() throws InterruptedException
	{
	  WebDriver driver= Locator.openBrowser("https://kite.zerodha.com/");
	
	  ZerodhaKitePOM Zero=new ZerodhaKitePOM(driver);
	  
	  Thread.sleep(4000);
	  Zero.enteruserid("OKP335");
	  Zero.enterpassword("ZAQ1234567");
	  Zero.login();
	  
	  Thread.sleep(4000);
	  Zero.enterpin("234567");
	  Zero.continu();
	}
	/*public static void main(String[] args) throws InterruptedException {
		ZerodhaLoginTest obj=new ZerodhaLoginTest();
		obj.loginzerodha();*/
		/* UN : OKP335
Pass: ZAQ1234567
Pin:234567 */
	}

	
	


	
