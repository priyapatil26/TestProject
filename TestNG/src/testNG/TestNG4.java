package testNG;

import org.testng.annotations.*;

public class TestNG4 
{
	@Test
	public void a()
	{
		System.out.println("A test method");
	}
	
	//Industry mostly used
	@Test(enabled=false)
	public void b()
	{
		System.out.println("b test method");
	}
	
	@Test(invocationCount=2) //multiple count run
	public void c()
	{
		System.out.println("c test method");
	}
	
}
