package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebooklogin_page_object {
	
	@FindBy (xpath="//input[@id='email']") private WebElement email;
	@FindBy (xpath="//input[@name='pass']") private WebElement password;
	@FindBy (xpath="//button[@name='login']") private WebElement Login;
	@FindBy (xpath="//a[text()='Forgotten password?']") private  WebElement forgot;
	@FindBy (xpath="//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']") private WebElement createnewacc;
	@FindBy (xpath="//a[text()='Create a Page']") private WebElement Createpage;
	
	public Facebooklogin_page_object(WebDriver driver)
	{
		PageFactory.initElements(driver,this);   	//we use initelement of pagefactory class which is used 	
		                                            //to the webdriver in its argument and then with the help of
		                                            //@FindBy annotationit will find all the elements declared in the class

	}
		
	public void setemail(String mail)
	{
		email.sendKeys(mail);
	}
	
	public void setpassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void clickonsubmit()
	{
		Login.click();
	}
	
	public void clickonforgot()
	{
		forgot.click();
	}
	public void clickonsignup()
	{
		createnewacc.click();
	}
	public void clickoncreatepage()
	{
		Createpage.click();
	}
	
	
	
	
	
	
	
	
	
	

}
