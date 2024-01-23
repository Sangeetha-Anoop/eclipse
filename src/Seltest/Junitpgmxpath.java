package Seltest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
public class Junitpgmxpath {
	ChromeDriver driver;
@Before
public void browseropen()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	
}
@Test
public void test()
{
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sangithats@gmail.com");
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Ambika@satheesan");
	driver.findElement(By.xpath("//input[@name='login']")).click();
	//driver.findElement(By.name("btnk")).click();
}
}
