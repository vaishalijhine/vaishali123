package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ZerodhaKitePOM {
	@FindBy (xpath="//input[@id='userid']") private WebElement userid;
	@FindBy (xpath="//input[@id='password']") private WebElement password;
	@FindBy (xpath="//button[@class='button-orange wide']") private WebElement submit;
	@FindBy (xpath="//a[text()='Forgot user ID or password?']") private WebElement forgotpass;
	@FindBy (xpath="//input[@id='pin']") private WebElement pin;
	@FindBy (xpath="//button[@class='button-orange wide']") private WebElement  cont;   

	
	
	public ZerodhaKitePOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enteruserid(String id)
	{
		userid.sendKeys(id);
	}
	
	public void enterpassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void login()
	{
		submit.click();
	}
	
	public void enterpin(String pi)
	{
		pin.sendKeys(pi);
	}
	
	public void continu()
	{
		cont.click();
	}

}
