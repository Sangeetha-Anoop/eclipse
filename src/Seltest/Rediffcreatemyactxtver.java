package Seltest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Rediffcreatemyactxtver {
	ChromeDriver driver;
@Before
public void browseropen()
{
	driver=new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	
}
@Test
public void buttonverify()
{
	WebElement button=driver.findElement(By.xpath("//*[@id=\"Register\"]"));
	String buttontext=button.getAttribute("value");
	if(buttontext.equals("Create my account >>"))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
}
@After
public void browserclose()
{
	driver.quit();
}
}
