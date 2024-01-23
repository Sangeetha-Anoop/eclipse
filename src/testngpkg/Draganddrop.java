package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {
	ChromeDriver driver;
	@BeforeTest
	public void set()
	{
		driver = new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demoqa.com/droppable");
	}
	@Test
	public void test1()
	{
		driver.manage().window().maximize();
		WebElement dragme=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(dragme, drop);
		act.perform();
		WebElement t=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		System.out.println(t.getText());
		if(t.getText().equalsIgnoreCase("Dropped"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	
	}
	@AfterTest
	public void end()
	{
		driver.quit();
	}

}
