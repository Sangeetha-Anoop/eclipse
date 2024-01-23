package Seltest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class AssignJunitamazon {
	ChromeDriver driver;
@Before
public void browseropen()
{
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	
}
@Test
public void test()
{
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	driver.findElement(By.xpath("//*[@id='nav-cart-count']")).click();
	driver.findElement(By.xpath("//*[@id='nav-link-accountList-nav-line-1']")).click();
	driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("abc123@gmail.com");
	driver.findElement(By.xpath("//*[@id='continue']")).click();
	driver.navigate().back();
	driver.navigate().back();
	driver.navigate().back();
	driver.findElement(By.xpath("//*[@id='nav-xshop']/a[2]")).click();
	driver.findElement(By.xpath("//*[@id='nav-main']/div[1]/a/span")).click();

	
}
}
