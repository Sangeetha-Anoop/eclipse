package testngpkg;


import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Asn2912amazon {
	ChromeDriver driver;
	@BeforeTest
	public void urlopen()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	@Test
	public void testing()

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
	
	
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String parentWindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[1]/div/div[2]/div/span/a/div/img")).click();
		Set<String> allwindowhandles=driver.getWindowHandles();
		for(String handle:allwindowhandles)
		{
			System.out.println(handle);
			if(!handle.equalsIgnoreCase(parentWindow))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.id("add-to-cart-button")).click();
				driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
			}

		}
	}
	

}
