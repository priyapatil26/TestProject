package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG7 {
	@Test
	public void createAccount()
	{ 
		Assert.assertTrue(3>10);
		System.out.println("this is createaccount method");
	}
	@Test(dependsOnMethods= {"createAccount"})
	public void login()
	{ 
		System.out.println("this is login method");
	}


}
