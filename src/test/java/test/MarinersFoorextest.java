package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Marinersforexpage;



public class MarinersFoorextest {
WebDriver driver;
	
	@BeforeTest
	public void beftt()
	{
		driver=new ChromeDriver();
		driver.get("https://marinersforex.com/flights-Booking");
	}
	
	@Test
	public void testttt() throws InterruptedException
	{
		Marinersforexpage f=new Marinersforexpage(driver);
		driver.manage().window().maximize();
		f.testing();
		//Thread.sleep(30000);
		f.count();
		f.submit();
	}
}
