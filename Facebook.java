package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Facebook {
	WebDriver driver;
	
	@BeforeTest
	public void OpenBrowser() {
		driver= new FirefoxDriver();
	}
	
	@Test
	public void Facebook1() {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("firstname")).sendKeys("Anwar");
		driver.findElement(By.name("lastname")).sendKeys("Islam");
		driver.findElement(By.name("reg_email__")).sendKeys("anawarul46@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__" )).sendKeys("anawarul46@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("1234");
		
		Select monthselect=new Select(driver.findElement(By.name("birthday_month")));
		monthselect.selectByIndex(5);
		
		Select day= new Select(driver.findElement(By.name("birthday_day")));
		day.selectByIndex(10);
	
		Select year= new Select(driver.findElement(By.name("birthday_year")));
		year.selectByVisibleText("1985");
		
		driver.findElement(By.xpath(".//*[@id='u_0_c']")).click();
		 driver.close();
	}
	

}
