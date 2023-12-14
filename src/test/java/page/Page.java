package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page {
	WebDriver o;
@FindBy(xpath="//input[@id=\"user-name\"]")
WebElement user;
@FindBy(xpath="//input[@id=\"password\"]")
WebElement pass;
@FindBy(xpath="//input[@id=\"login-button\"]")
WebElement login;


public Page(WebDriver o)
{
	this.o=o;
	PageFactory.initElements(o, this);
}

public void setval(String x,String p)

{
	
user.sendKeys(x);
pass.sendKeys(p);
}


public void click()

{
	login.click();

}public void validation()
{
	String exp="https://www.saucedemo.com/inventory.html";
	String act=o.getCurrentUrl();
	if(exp.equalsIgnoreCase(act)) {
		System.out.println("pass");
		
	}
	else
	{System.out.println("fail");}

}}