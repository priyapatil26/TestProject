package testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestNG8 {
	WebDriver d;
	@BeforeClass
	public void setEnv()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gokul\\eclipse-workspace\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com/");
	}
	@DataProvider
	public Object[][] dataSet() throws Exception
	{
		File src=new File("C:\\Users\\Gokul\\eclipse-workspace\\TestNG\\Repository\\Object_Repo.properties");
		FileInputStream fis=new FileInputStream(src);
		Properties pro=new Properties();
		pro.load(fis);
		Object arr[][]=new Object[3][2];
		TestNG8 t8=new TestNG8();
		arr[0][0]=pro.getProperty("EmailData");
		arr[0][1]=pro.getProperty("PasswordData");
		
		arr[1][0]="TestEmail2";
		arr[1][1]="Password";
		return arr;
	}
	
	@Test(dataProvider="dataset")
	public void enterCred(String Username,String Password) throws Exception 
	{
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[@id='email']")).clear();
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[@id='pass']")).clear();
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[@id='email']")).sendKeys(Username);
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[@id='pass']")).sendKeys(Password);
		Thread.sleep(3000);
		d.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(3000);
		d.navigate().back();
		

}
}
