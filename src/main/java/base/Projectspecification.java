package base;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utilities.Utility;

public class Projectspecification extends Utility{                  //spicejet
	@Parameters({"browser", "url"})
	@BeforeMethod
	public void launchbrowser(String browser, String url) {
		browser(url, browser);
	}
	
	@DataProvider(name ="getdata")
   public Object[][] getdata() throws IOException {
		Object[][] data = readexcel(excelfile);
		return data;
	}
@AfterMethod
public void closebrowser() {
	close();
}

}
