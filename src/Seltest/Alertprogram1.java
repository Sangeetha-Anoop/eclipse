package Seltest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alertprogram1 {
	ChromeDriver driver;
	@Before
	public void set()
	{
		driver=new ChromeDriver();
		driver.get("file:///C://Users//dell//Desktop/alert.html");
	}
	@Test
	public void verify()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("abc");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("123");
	}
	

}
