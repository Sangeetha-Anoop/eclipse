package Seltest;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fbdropdownvaluepassing {
	ChromeDriver driver;
	@Before
	public void browseropen()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		
	}
	@Test
	public void dropdown()
	{
		WebElement dayelement=driver.findElement(By.xpath("//*[@id=\"day\"]"));
		Select day=new Select(dayelement);
		day.selectByValue("4");
		WebElement month=driver.findElement(By.xpath("//*[@id=\"month\"]"));
		Select m=new Select(month);
		m.selectByValue("5");
		WebElement year=driver.findElement(By.xpath("//*[@id=\"year\"]"));
		Select y=new Select(year);
		y.selectByVisibleText("1997");
		
		List<WebElement> li = day.getOptions();
		System.out.println("Days:"+li.size());
		List<WebElement> li1 = m.getOptions();
		System.out.println("Month:"+li1.size());
		List<WebElement> li2 = y.getOptions();
		System.out.println("Year:"+li2.size());
		
		
	}
}



