package Automation;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

public class LoginTest {
	
	public void loginWithValidCredentialTest() throws EncryptedDocumentException, IOException {
		WebDriver driver= Locator.openBrowser("https://www.facebook.com/");
		
		Facebooklogin_page_object facebooklogin=new Facebooklogin_page_object(driver);
		
		
		//	facebooklogin.setemail("vaishu");
		//	facebooklogin.setpassword("200921");

	
		facebooklogin.setemail(Parametarization.getData("vaishu1", 0, 0));
		facebooklogin.setpassword(Parametarization.getData("vaishu1", 1, 0));
		facebooklogin.clickonsubmit();
		
	}
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		LoginTest obj= new LoginTest();
		obj.loginWithValidCredentialTest();
	}
	
	
	

}
