package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Projectspecification;
import pages.Homepage;

public class TC005_LoginTest_With_Email extends Projectspecification{
	
	@BeforeTest
	public void setup() {
		excelfile="TC005_LoginTest_With_Email";
	}
	
	@Test(priority = 5, dataProvider = "getdata", enabled = false)
	public void logintestwithemail(String email, String password, String name) throws IOException, InterruptedException {
		new Homepage(driver)
		.login()
		.clickemail()
		.enteremail(email)
		.enterpassword(password)
		.clicklogin()
		.verifylogin(name)
		.takescreenshot("TC005_LoginTest_With_Email");
	}

}
