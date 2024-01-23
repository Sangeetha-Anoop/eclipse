package Seltest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
public class Swaglabs {
	ChromeDriver driver;
@Before
public void browseropen()
{
	driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com");
	
}
@Test
public void test()
{
	driver.findElement(By.id("user-name")).sendKeys("standard_user",Keys.ENTER);
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.name("login-button")).click();
	//driver.findElement(By.name("btnk")).click();
}
}
