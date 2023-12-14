package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import mavpack1.Execlup;
import page.Page;

public class Testsauce {
	WebDriver o;
	@BeforeTest
	public void bef()
	{
		o=new ChromeDriver();
		
		
	}
	@Test
	public void test() throws Exception
	{ Page pag=new Page(o);
		
	String x="C:\\Users\\H P\\OneDrive\\Desktop\\Book1.xlsx";
	String sh="Sheet2";
	int r= Execlup.rowval(x,sh);
	System.out.println("num of r="+r);
	for(int i=1;i<=r;i++)
	
	{
		o.get("https://www.saucedemo.com/");
		String u=Execlup.excelupload(x, sh, i, 0);
		System.out.println(u);
		String pa=Execlup.excelupload(x, sh, i, 1);
		System.out.println(pa);
		pag.setval(u, pa);
		pag.click();
	pag.validation();
			
			
		}
		
	}

}
