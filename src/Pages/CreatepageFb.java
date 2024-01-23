package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreatepageFb {
	WebDriver driver;
	By createpage=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By getstart=By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button/div/div");
	public CreatepageFb(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clickelement()
	{
		driver.manage().window().maximize();
		driver.findElement(createpage).click();
		driver.findElement(getstart).click();
	}

}
