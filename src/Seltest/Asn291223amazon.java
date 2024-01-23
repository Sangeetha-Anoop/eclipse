package Seltest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Asn291223amazon {
	ChromeDriver driver;
@Before
public void browseropen()
{
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
}
@Test
public void test()

{
	driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobiles");
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	String content=driver.getTitle();
	//System.out.println(content);
	if(content.equals("Amazon.in : mobiles"))
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
