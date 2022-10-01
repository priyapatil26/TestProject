package testNG;

import org.testng.annotations.*;

public class TestNG3 {
	@Test(priority=1)
	public void a()
	{
	System.out.println("a method");	
	}
	
	@Test(priority=0)
	public void b()
	{
	System.out.println("b method");	
	}
	
	@Test(priority=5)
	public void p2()
	{
	System.out.println("p2 method");	
	}
	
	@Test(priority=-10)
	public void z()
	{
	System.out.println("z method");	
	}
	
	@Test(priority=5)
	public void p1()
	{
	System.out.println("p1 method");	
	}
}
