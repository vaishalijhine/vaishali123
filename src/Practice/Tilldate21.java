package Practice;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tilldate21 {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");   //browser initialization

	WebDriver driver=new ChromeDriver();   //upcasting...
	
	driver.get("https:/www.facebook.com/");    //url open
	
	String title=driver.getTitle();
	System.out.println(title);
	
	String url=driver.getCurrentUrl();
	System.out.println(url);
	
	//String source=driver.getPageSource();
	//System.out.println(source);
	
	driver.manage().window().maximize();
	
	Thread.sleep(4000);
	driver.manage().window().minimize();
	
	
	Dimension d=new Dimension(400,600);
	driver.manage().window().setSize(d);
	
	Point p= new Point(100,400);
	driver.manage().window().setPosition(p);
	
	WebElement email=driver.findElement(By.tagName("button"));      //by tagname
	email.click();
	
	WebElement email1=driver.findElement(By.name("email"));     //by name
	email1.sendKeys("asdf");
	
	
	
	WebElement pass=driver.findElement(By.name("pass"));    //by classname    inputtext _55r1 _6luy _9npi
	pass.sendKeys("zxcv");
	
	WebElement lof=driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy"));    //by id
	lof.click();
	
	Thread.sleep(4000);

	WebElement css=driver.findElement(By.cssSelector("a[class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
	css.click();
	
	WebElement email11=driver.findElement(By.xpath("//input[@name='email']"));     //xpath by attribute
	email.sendKeys("dchavhan933@gmail.com");
	
	WebElement forgot=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
	forgot.click();
			
	
	
	
	
	
}
}