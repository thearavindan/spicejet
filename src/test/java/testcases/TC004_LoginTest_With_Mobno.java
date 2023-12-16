package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Projectspecification;
import pages.Homepage;

public class TC004_LoginTest_With_Mobno extends Projectspecification{
	
	@BeforeTest
	public void setup() {
		excelfile="TC004_LoginTest_With_Mobno";
	}
	
	@Test(priority = 4, dataProvider = "getdata",enabled = false)
	public void logintestwithmobno(String mob, String pass, String loginname) throws IOException, InterruptedException {
		new Homepage(driver)
		.login()
		.clickmobno()
		.entermobno(mob)
		.enterpassword(pass)
		.clicklogin()
		.verifylogin(loginname)
		.takescreenshot("TC004_LoginTest_With_Mobno");
		
	}
	

}
