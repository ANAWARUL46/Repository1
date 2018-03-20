package pack1;

import org.junit.Before;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Pch {
	WebDriver driver;
	
	@BeforeTest
	public void OpenBrowser() {
		driver=new FirefoxDriver();
	}
	@Test
	public void Pch() throws InterruptedException {
	driver.get("http://www.pch.com/");
	
	driver.findElement(By.xpath(".//*[@id='uni_header']/div[2]/div[1]/div[3]/ul/li[2]/a")).click();
	
	Select Titleselect=new Select(driver.findElement(By.name("TI")));
	Titleselect.selectByIndex(1);
	
	driver.findElement(By.name("FN")).sendKeys("Anwar");
	driver.findElement(By.name("LN")).sendKeys("Islam");
	driver.findElement(By.name("A1")).sendKeys("17220  90 TH AVENUE #D3");
	driver.findElement(By.name("ZI")).sendKeys("11432");
	
	Select monthselect=new Select(driver.findElement(By.name("MN")));
	 monthselect.selectByIndex(5);
	 
		Select dayselect=new Select(driver.findElement(By.name("DY")));
		 dayselect.selectByIndex(10);
    
	Select yearselect=new Select(driver.findElement(By.name("YR")));
	yearselect.selectByVisibleText("1988");
	
	driver.findElement(By.name("EM")).sendKeys("anawarul46@gmail.com");
	driver.findElement(By.name("CE")).sendKeys("anawarul46@gmail.com");
	
	Thread.sleep(5000);
	driver.close();
	Alert alt=driver.switchTo().alert(); 
	
	System.out.println(alt.getText());
	alt.accept();
	
	
	
	
	
	}

}
