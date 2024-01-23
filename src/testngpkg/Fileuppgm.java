package testngpkg;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuppgm {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demo.guru99.com/test/upload/");
	}
	@Test
	public void test1() throws Exception
	{
		driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\dell\\Desktop\\SangeethaTS.pdf");
		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
		
	}
	

}
