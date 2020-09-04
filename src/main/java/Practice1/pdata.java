package Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class pdata {
	
	public WebDriver driver;
		
	public pdata(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	By putemail=By.xpath("//input[@name='email']");
	public void putemail1(String text)
	{
		driver.findElement(putemail).clear();
		driver.findElement(putemail).sendKeys(text);
	}
	@FindBy(css="[id='pass']")
	WebElement putpass;
	public void putpass1(String text)
	{
		putpass.clear();
		putpass.sendKeys(text);
	}
	@FindBy(how=How.XPATH,using="//input[@name='firstname']")
	WebElement putfn;
	
	public void pufn(String text)
	{
		putfn.clear();
		putfn.sendKeys(text);
	}
	

}
