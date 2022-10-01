package testNG;

import org.testng.annotations.*;

public class TestNG01 {
	@Test
	public void a2() {
		System.out.println("a2 test method");
	}

	@BeforeTest
	public void b() {
		System.out.println("222b method");
	}

	@BeforeSuite
	public void c() {
		System.out.println("11111c method");

	}

	@AfterMethod
	public void d() {
		System.out.println("555d method");
	}

	@BeforeClass
	public void e() {
		System.out.println("33333e method");
	}

	@AfterTest
	public void f() {
		System.out.println("77f method");
	}

	@AfterClass
	public void g() {
		System.out.println("666g method");
	}

	@BeforeMethod
	public void h() {
		System.out.println(" 4444h method");
	}

	@AfterSuite
	public void i() {
		System.out.println("8888i method");
	}

	@Test
	public void a1() {
		System.out.println("a1 test method");
	}

}
