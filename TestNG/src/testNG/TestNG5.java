package testNG;

import org.testng.annotations.Test;

public class TestNG5 {
	@Test
	public void a()
	{ 
		System.out.println("a test method");
	}

	@Test(invocationCount=2,priority=-1,enabled=false)
	public void b()
	{ 
		System.out.println("b test method");
	}

	@Test
	public void c()
	{ 
		System.out.println("c test method");
	}


}
