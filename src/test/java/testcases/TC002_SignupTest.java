package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Projectspecification;
import pages.Homepage;

public class TC002_SignupTest extends Projectspecification{
	
	@BeforeTest
	public void setup() {
		excelfile="TC002_SignupTest";
	}
	
	@Test(dataProvider  = "getdata", enabled = false)
	
	public void singnuptest(String firstname, String lastname, String mobileno, String emailid, String passward, String conpass) throws IOException, InterruptedException {
		new Homepage(driver)
		.signup()
		.selecttitle()
		.enterfirstname(firstname)
		.enterlastname(lastname)
		.selectcountry()
		.selectdob()
		.entermobno(mobileno)
		.enteremail(emailid)
		.enterpassward(passward)
		.enterconformpass(conpass)
		.checkbox()
		.clicksubmit()
		.takescreenshot("TC002_SignupTest");
	}
	
	
	

}
