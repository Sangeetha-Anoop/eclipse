package Seltest;
import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotrediff2{
	ChromeDriver driver=new ChromeDriver();
	@Before
	public void browseropen()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void screenshot() throws Exception
	{
		WebElement dayelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		File src1=dayelement.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1,new File("./Screenshots//ElementScreenshot.png"));
	}
	@After
	public void close()
	{
		driver.quit();
	}

}
