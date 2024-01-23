package testngpkg;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class New {
	ChromeDriver driver;
	@BeforeTest
	public void browseropen() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlopen() {
		driver.get("https://www.facebook.com/");
}
	@Test
	public void test1() throws IOException  {
		File f=new File("‪‪‪C:\\Users\\dell\\Desktop\\taskxl.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet("Sheet1");
		System.out.println(sh.getLastRowNum());
		for(int i=1;i<=sh.getLastRowNum();i++) {
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("username "+username);
			String pswd=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("Password "+pswd);
			driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(pswd);
			driver.findElement(By.name("login")).click();
			String actualurl=driver.getCurrentUrl();
			String expectedurl="https://www.facebook.com/";
			if(actualurl.equals(expectedurl)) {
				System.out.println("Logged Successfully");
			}
			else {
				System.out.println("Unsucess");
			}
		}
	}
}