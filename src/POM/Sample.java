package POM;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;


public class Sample {
	
	@Test(priority =2,timeOut =2000)
	public void test1() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("Test1 executed");
	}
	
	@Test(priority =1,invocationCount =2)
	public void test2()
	{
		System.out.println("Test2 Executed");
	}
	
	
	
	
	
	
	@Test(priority =3,enabled = false)
	public void test()
	{
		System.out.println("test execute");
	}
	
	@Test(dependsOnMethods = {"test1"})
	public void test4()
	{
		System.out.println("test 4 executed");	
	}
	
	
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class Eecuted");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After  class Executed");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before method Executed");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After method Executed");
	}
	
	@BeforeTest
	public void beforTest()
	{
		System.out.println("Before Test Executed");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test Executed");
	}

}
