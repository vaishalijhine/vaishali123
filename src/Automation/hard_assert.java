package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class hard_assert {

	@Test
	public void main() {
		WebDriver driver = Locator.openBrowser("https://vctcpune.com/selenium/practice.html");

		WebElement hide = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
		hide.click();

		WebElement textbox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
		boolean result = textbox.isDisplayed();

		Assert.assertEquals(result, false); // hard assertion
		// Assert.assertFalse(result);

//		String title=driver.getTitle();
//		
//		Assert.assertEquals(title, "Practice Page"); //hard Assertion
//		
//		System.out.println("Thank you");
		driver.close();
	}

}
