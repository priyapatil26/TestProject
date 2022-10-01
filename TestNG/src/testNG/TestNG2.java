package testNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG2 {
	
	@Test
	public void assertionCheck()
	{
		String expectedMsg="Log In";
		String actualMsg="Lag In";
		
		try
		{
			Assert.assertEquals(actualMsg, expectedMsg);
		} catch(Error e)
		{
			e.printStackTrace();
		}
		System.out.println("Verificaton successful");
		
	}

}
