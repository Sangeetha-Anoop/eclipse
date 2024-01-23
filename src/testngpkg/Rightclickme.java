package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rightclickme {
	ChromeDriver driver;
	@BeforeTest
	public void set()
	{
		driver = new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
	@Test
	public void test1()
	{
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		WebElement right=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		act.contextClick(right).perform();
		WebElement edit=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]"));
		edit.click();
		String alert1=driver.switchTo().alert().getText();
		System.out.println(alert1);
		driver.switchTo().alert().accept();	
		WebElement el=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(el).perform();
		String alert2=driver.switchTo().alert().getText();
		System.out.println(alert2);
		driver.switchTo().alert().accept();	
		}
	
	}


