package testngpkg;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Taskamazonwindow {
	ChromeDriver driver;
	@BeforeTest
	public void browseropen() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlopen() {
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@Test
	public void test1() {
		String parentwindow=driver.getWindowHandle();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobilephones",Keys.ENTER);
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equalsIgnoreCase("Amazon.in : mobilephones")) {
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
		}
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/span/div/div/div/div[1]/div/div[2]/div/span/a/div/img")).click();
		Set<String> allwindow = driver.getWindowHandles();
		for(String handle:allwindow) {
			if(!handle.equalsIgnoreCase(parentwindow)) {
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
			}
		}
	}
}
