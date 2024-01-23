package Seltest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
public class Junitpgmfb {
	ChromeDriver driver;
@Before
public void browseropen()
{
	driver=new ChromeDriver();
	driver.get("https://www.facbeook.com");
	
}
@Test
public void test()
{
	String content=driver.getPageSource();
	if(content.contains("Facebook"))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
}
@After
public void browserclose()
{
	driver.quit();
}
}
