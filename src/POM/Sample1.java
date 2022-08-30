package POM;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Sample1 {
	
	@Test()
	@Parameters({"a","b"})
	public void test8(int a,int b)
	{
		System.out.println(a+b);
		System.out.println("test is Executed");
	}
	
	@Test()
	@Parameters({"a","b"})
	public void test5(int a,int b)
	{
		System.out.println(a-b);
		System.out.println("test5 executed");
	}
	
	

}
