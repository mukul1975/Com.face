package Practice1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class inicializeBrowser {
	
	public WebDriver driver;
	public Properties prob;
	
	public WebDriver browser() throws IOException
	{
		prob=new Properties();
		FileInputStream fis=new FileInputStream("D:\\Maven\\raja\\Practice\\src\\main\\java\\Practice1\\browser.properties");
		prob.load(fis);
		
		String browserName=prob.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Saiful\\Desktop\\Selenium\\webdriver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		else if(browserName.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Saiful\\Desktop\\Selenium\\webdriver\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}

}
