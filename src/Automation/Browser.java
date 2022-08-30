package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//	//	driver.get("https://vctcpune.com/");
//		
//		driver.navigate().to("https://vctcpune.com/");
//		
//		Thread.sleep(6000);
//		
//		driver.navigate().back();
//		Thread.sleep(6000);
//
//		driver.navigate().forward();
//		Thread.sleep(6000);
//
//		driver.navigate().refresh();
//		
//		String title =driver.getTitle();
//		System.out.println(title);
//		
//		String url=driver.getCurrentUrl();
//		System.out.println(url);
//		
//		driver.manage().window().maximize();
//		
//		driver.manage().window().minimize();
//		
	//}
	
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("");
	driver.navigate().to("");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	driver.manage().window().maximize();
	driver.manage().window().minimize();

}
