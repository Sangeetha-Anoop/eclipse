package Seltest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
public class Titleveramazon {
	ChromeDriver driver;
@Before
public void browseropen()
{
	driver=new ChromeDriver();
	driver.get("https://www.amazon.com");
	
}
@Test
public void test()
{
	String content=driver.getTitle();
	//System.out.println(content);
	if(content.equals("Amazon.com"))
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
