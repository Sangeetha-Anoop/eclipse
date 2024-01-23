package testngpkg;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Taskrishiherbals {

	ChromeDriver driver;

	@BeforeTest

	public void set()

	{

		driver = new ChromeDriver();

	}

	@BeforeMethod

	public void urlloading()

	{

		driver.get("https://rishiherbalindia.linker.store/");

	}

	@Test

	public void test1() {

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/a/span")).click();

		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[1]/a")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[1]/input")).sendKeys("zwt@gmail.com");

		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[2]/input")).sendKeys("Rishi@1234");

		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[3]/label/input")).click();

		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[1]/button/span")).click();


		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


		driver.findElement(By.xpath("//*[@id=\"register-model-signin-link\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[1]/input")).sendKeys("zwt@gmail.com");

		driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[2]/input")).sendKeys("Rishi@1234");

		driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/button[1]")).click();

		String actual=driver.getCurrentUrl();

		String expected="https://rishiherbalindia.linker.store/";

		if(actual.equals(expected)) 

		{

			System.out.println("Success!");

		}

		else

		{

			System.out.println("Fail!");

		}

	}

	@Test

	public void test2()

	{

		driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Herbal agro Growth Booster");

		driver.findElement(By.xpath("//*[@id=\"search\"]/span/button/i")).click();

		JavascriptExecutor js=(JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,400)", "");
		WebElement mo=driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a/img"));
		Actions act=new Actions(driver);
		act.moveToElement(mo);
		act.perform();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/div[2]/div[2]/ul/li[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[2]/h4/a")).click();
		 driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[4]/a")).click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a/img")).click();
		 driver.findElement(By.xpath("//*[@id=\"prod_cont\"]/div/div[4]/button[1]/span")).click();
		 driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/a")).click();
		 driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[2]/a")).click();
		 driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[3]/a")).click();

		 



	}

}
