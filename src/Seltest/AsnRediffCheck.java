package Seltest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AsnRediffCheck {
	ChromeDriver driver;
	
	@Before
	public void browseropen()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	@Test
	public void test()
	{
		//driver=new ChromeDriver();
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
		boolean b=logo.isDisplayed();
		if(b)
		{
			System.out.println("Logo present!");
		}
		else
			System.out.println("Logo not present!");
	}
	@Test
	public void test2()
	{
		//driver=new ChromeDriver();
		WebElement check = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input"));
		boolean c=check.isSelected();
		if(c)
		{
			System.out.println("Checkbox is selected!");
		}
		else
			System.out.println("Not selected!");
	}
	@Test
	public void test3()
	{
		//driver=new ChromeDriver();
		WebElement radio =driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]"));
		boolean r=radio.isEnabled();
		if(r)
		{
			System.out.println("Radio button enabled!");
		}
		else
		{
			System.out.println("Radio button disabled!");
		}
	}
	@After
	public void close()
	{
		driver.quit();
	}

}
