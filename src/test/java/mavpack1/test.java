package mavpack1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test {
ChromeDriver o;

@BeforeTest
public void bef()
{
	o=new ChromeDriver();
}
@Test
public void test1()
{
	o.get("https://www.saucedemo.com/");
	
	

}
}
