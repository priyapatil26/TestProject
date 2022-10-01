 package testNG;
import java.io.*;
import java.util.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ObjectRepository {

	public static void main(String[] args) throws Exception {
		ObjectRepository obj=new ObjectRepository();
		//propety file Location
		File src= new File("C:\\Users\\Gokul\\eclipse-workspace\\TestNG\\Repository\\Object_Repo.properties");
		
		//Load the File
		FileInputStream fis=new FileInputStream(src);
		
		//read propetry file 
		Properties pro = new Properties();
		
		pro.load(fis);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gokul\\eclipse-workspace\\chromedriver.exe");
		//WebDriver d = new ChromeDriver();
		WebDriver d= new ChromeDriver();
		
		Thread.sleep(3000);
		
		
	}

}
