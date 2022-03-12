package wdmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GenreicMethods {
	public static WebDriver driver;
	public void start()
	{
		switch("chrome")
		{
		case "chrome":
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		driver=new ChromeDriver();
		break;
		case "firefox":	
			System.setProperty("webdriver.gecko.driver", ".//drivers//geckodriver.exe");
			driver=new FirefoxDriver();
			break;
		case "IE":	
			System.setProperty("webdriver.ie.driver", ".//drivers//IE Driver ServerIEDriverServer.exe");
			driver=new InternetExplorerDriver();
			break;
		case "default":
			System.out.println("PLease give proper browsername");
			break;
		}
		}
	
	public void openWebsite()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	public void screenMaximizer()
	{
		driver.manage().window().maximize();
	}

	public void pageDetails()
	{
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}
	
	public void closeCurentBrowser()
	{
		driver.close();
	}
	public void allbrowsersClose()
	{
		driver.quit();
	}
	public void type(WebElement ele,String data)
	{
		ele.clear();
		ele.sendKeys(data);
	}
	
	public void button(WebElement ele)
	{
		ele.click();
	}
}
