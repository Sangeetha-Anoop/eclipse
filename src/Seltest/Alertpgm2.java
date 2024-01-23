package Seltest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alertpgm2 {
	ChromeDriver driver;
	@Before
	public void set()
	{
		driver=new ChromeDriver();
		driver.get("file:///C://Users//dell//Desktop/alert.html");
	}
	@Test
	public void verify()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		String actualtext=a.getText();
		if(actualtext.equals("Hello! Iam an alert box!!"))
		{
			System.out.println("Pass!");
		}
		else
		{
			System.out.println("Fail!");
		}
		a.accept();
		
		}
	

}
