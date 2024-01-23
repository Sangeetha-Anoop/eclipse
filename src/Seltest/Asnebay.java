package Seltest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Asnebay {
	ChromeDriver driver;
@Before
public void browseropen()
{
	driver=new ChromeDriver();
	driver.get("https://www.ebay.com");
	driver.manage().window().maximize();
	
}
@Test
public void test()
{
	String content=driver.getTitle();
	System.out.println(content);
	if(content.equals("ebay.com"))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
	driver.findElement(By.xpath("//*[@id=\"gh-shop-a\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"gh-sbc\"]/tbody/tr/td[1]/ul[1]/li[4]/a")).click();
	String content1=driver.getPageSource();
	if(content1.contains("Shop by Category"))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
	driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[1]/div[2]/span[1]/a/div[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"gh-minicart-hover\"]/div/a[1]")).click();
	driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div[2]/div/div/div/div[3]/a[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("books");
	driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
	
}
@After
public void browserclose()
{
	driver.quit();
}
}
