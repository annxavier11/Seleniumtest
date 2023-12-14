package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Marinersforexpage {

	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"country-select-demo\"]")
	WebElement dep;
	@FindBy(xpath="/html/body/div/div/div[2]/section/div[1]/form/div[2]/div[1]/div/div[2]/div/div/div/div")
	WebElement des;
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[3]/ul/li/div")
	WebElement clas;
	//@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[3]/ul/li/ul/li[1]/div/div/div[2]")
//WebElement adultval;
	@FindBy(xpath="/html/body/div/div/div[2]/section/div[1]/form/div[2]/div[3]/ul/li/ul/li[1]/div/div/div[3]/p")
	WebElement adultcount;
//	@FindBy(xpath="/html/body/div/div/div[2]/section/div[1]/form/div[2]/div[3]/ul/li/ul/li[1]/div/div/div[3]/p")
//	WebElement childvalue;	
	@FindBy(xpath="/html/body/div/div/div[2]/section/div[1]/form/div[2]/div[3]/ul/li/ul/li[2]/div/div/div[3]")
	WebElement childcount;
//	@FindBy(xpath="")
	//WebElement infantval;
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[3]/ul/li/ul/li[3]/div/div/div[3]/p")
	WebElement infantcount;
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[3]/ul/li/ul/li[4]/div/div[1]/fieldset/div/label[2]/span[1]/span[1]/input")
	WebElement buisness;
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[4]/input")
	WebElement search;
	@FindBy(xpath="/html/body")
	WebElement date;
	public Marinersforexpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);}
	

public void testing() 
{
	//driver.manage().window().maximize();
	
	dep.click();
	dep.clear();
	dep.sendKeys("Chennai/Madras, India ");
	
	des.click();
	des.clear();
	des.sendKeys("Cairo, Egypt ");
	}
public void count() throws InterruptedException	
	{
	clas.click();
	
		adultcount.click();
		//Thread.sleep(1000);
	  childcount.click();
	
	
	
}

public void submit()
{
	buisness.click();
	search.click();


}
public void date()
{
	
date.click();
date.clear();
date.sendKeys("10/10/2014");

}
}
