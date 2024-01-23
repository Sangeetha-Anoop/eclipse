package Seltest;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;



public class Responsecode {
	ChromeDriver driver;
	String baseurl="https://www.google.com";
	@Before
	public void browseropen()
	{
		driver = new ChromeDriver();
	}
	@Test
	public void linkcount() throws Exception
	{
		driver.get(baseurl);
		URL ob=new URL(baseurl);
		HttpURLConnection con=(HttpURLConnection)ob.openConnection();
		con.connect();
		if(con.getResponseCode()==200)
		{
			System.out.println("valid----"+baseurl);
		}
		else
			System.out.println("Invalid----"+baseurl);
	}
	@After
	public void close()
	{
		driver.quit();
	}

}
