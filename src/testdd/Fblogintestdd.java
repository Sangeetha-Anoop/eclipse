package testdd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Fbloginpage;
import utilitiesdd.Excelutil;

public class Fblogintestdd {
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void testlogin() throws Exception
	{
		Excelutil ob=new Excelutil();
		ob.getCellValue(null, null, 3, 3)
		ob.getRowCount(null, null)
	}

}
