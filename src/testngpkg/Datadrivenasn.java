package testngpkg;
import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadrivenasn {
	ChromeDriver driver;
	@BeforeTest
	public void browseropen() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlopen() {
		driver.get("https://www.saucedemo.com/v1/");
}
	@Test
	public void test1() throws IOException  {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		File f=new File("‪C:\\Users\\dell\\Documents\\task.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet("Sheet1");
		System.out.println(sh.getLastRowNum());
	
		for(int i=1;i<=sh.getLastRowNum();i++) {
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("username "+username);
			String pswd=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("Password "+pswd);
			driver.findElement(By.xpath("//*[@id=\"user-name\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(username);
			driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pswd);
			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			String actual=driver.getCurrentUrl();
			String expected="https://www.saucedemo.com/v1/inventory.html";
			if(actual.equals(expected))
			{
				System.out.println("Success!");
			}
			else
			{
				System.out.println("Fail!");
			}
		}
	}
}