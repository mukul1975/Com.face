package Practice1;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class comFaceTest extends inicializeBrowser{
	
	@BeforeTest
	public void star() throws IOException
	{
		driver=browser();
		driver.get(prob.getProperty("url"));
		driver.manage().window().maximize();
	}

	@Test(dataProvider="getdata")
	public void facebrowser(String text1, String text2, String text3) throws IOException
	{
		
		pdata pd=new pdata(driver);
		pd.putemail1(text1);
		pd.putpass1(text2);
		pd.pufn(text3);		
//		driver.close();		
	}
	
	@AfterTest
	public void ses()
	{
		driver.close();
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data=new Object[4][3];
		data[0][0]="alam@alim";
		data[0][1]="wewewewe";
		data[0][2]="MD";
		
		data[1][0]="muhin@khaja";
		data[1][1]="xsxsxsxs";
		data[1][2]="Rahim";
		
		data[2][0]="mash@bin";
		data[2][1]="uhuhuhuhu";
		data[2][2]="tamim";
		
		data[3][0]=" ";
		data[3][1]=" ";
		data[3][2]=" ";
		return data;
	}
}
