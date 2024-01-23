package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Fbloginpagefactory;

public class Fbloginpagefactorytest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.facebook.com");
	}
	@Test
	public void testlogin() throws Exception
	{
		Fbloginpagefactory obj=new Fbloginpagefactory(driver);
		obj.setvalues("abc@gmail.com", "1234");
		obj.login();
	}
	
}
