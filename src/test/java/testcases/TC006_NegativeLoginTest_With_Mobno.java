package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Projectspecification;
import pages.Homepage;

public class TC006_NegativeLoginTest_With_Mobno extends Projectspecification {
	

	@BeforeTest
	public void setup() {
		excelfile="TC006_NegativeLoginTest_With_Mobno";
	}
	
	@Test(priority = 6, dataProvider = "getdata",enabled = true)
	public void negativelogintestwithmobno(String mob, String password, String invalidmsg) throws IOException, InterruptedException {
		new Homepage(driver)
		.login()
		.clickmobno()
		.entermobno(mob)
		.enterpassword(password)
		.clicklogin()
		.invalidloginmsg(invalidmsg)
		.takescreenshot("TC006_NegativeLoginTest_With_Mobno");
		
	}

}
