package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserProvider {
	
	/*
	 * ThreadLocal class is from java helps too create same intance for any class
	 * it has two method
	 * get()
	 * set()
	 * 
	 */
				
	public static WebDriver driver;
	static ThreadLocal<WebDriver>tdriver=new ThreadLocal<WebDriver>();
	
	public static WebDriver getDriver()
	{
		return tdriver.get();
	}
	
	public static WebDriver setDriver(String bname)
	{
		if(bname.equals("chrome"))
		{
			driver=new ChromeDriver();
			tdriver.set(driver);
		}if(bname.equals("edge"))
		{
			driver=new EdgeDriver();
			tdriver.set(driver);
		}
		return getDriver();
	}

}
