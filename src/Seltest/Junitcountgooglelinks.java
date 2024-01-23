package Seltest;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Junitcountgooglelinks {
	ChromeDriver driver;
@Before
public void browseropen()
{
	driver=new ChromeDriver();
	driver.get("https://www.google.com");
	
}
@Test
public void test()
{
	List<WebElement> li=driver.findElements(By.tagName("a"));
	System.out.println("Links count:"+li.size());
	for(WebElement s:li)
	{
		String link=s.getAttribute("href");
		String text=s.getText();
		System.out.println(link+"-----"+text);
				
	}

}
@After
public void quit()
{
	driver.quit();
}


}
