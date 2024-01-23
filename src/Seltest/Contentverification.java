package Seltest;
import org.openqa.selenium.chrome.ChromeDriver;
public class Contentverification {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		String content=driver.getPageSource();
		if(content.contains("Gmail"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
