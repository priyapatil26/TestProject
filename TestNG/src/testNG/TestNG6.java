package testNG;

import org.testng.SkipException;
import org.testng.annotations.*;

public class TestNG6 {
	@Test
	public void a()
	{ 
		System.out.println("a test method");
	}
	@Test
	public void b()
	{ 
		System.out.println("b test method");
	}
	@Test
	public void c()
	{ 
		System.out.println("c test method");
		throw new SkipException("Skipping c method");
	}




}
