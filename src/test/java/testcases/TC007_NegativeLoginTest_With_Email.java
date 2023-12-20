package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Projectspecification;
import pages.Homepage;

public class TC007_NegativeLoginTest_With_Email extends Projectspecification {
	
	@BeforeTest
	public void setup() {
		excelfile="TC007_NegativeLoginTest_With_Email";
	}
	
	@Test(dataProvider = "getdata")
	public void negativelogintestwithemail(String email, String password, String invalidmsg) throws IOException, InterruptedException {
		new Homepage(driver)
		.login()
		.clickemail()
		.enteremail(email)
		.enterpassword(password)
		.clicklogin()
		.invalidloginmsg(invalidmsg)
		.takescreenshot("TC007_NegativeLoginTest_With_Email");
	}

}


