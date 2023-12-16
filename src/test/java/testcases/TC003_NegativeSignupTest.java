package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Projectspecification;
import pages.Homepage;

public class TC003_NegativeSignupTest extends Projectspecification {
	
	@BeforeTest
	public void setup() {
		excelfile="TC003_NegativeSignupTest";
	}
	
	@Test(priority = 3, dataProvider  = "getdata",enabled = false)
	
	public void negativesingnuptest(String firstname, String lastname, String mobileno, String emailid, String passward, String conpass,
			                               String fnameerrmsg, String lastnameerrmsg, String moberrmsg, String mailerrmsg, String passerrmsg,
			                               String conpasserrmsg) throws IOException, InterruptedException {
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
		.invalidfirstname(fnameerrmsg)
		.invalidlastname(lastnameerrmsg)
		.invalidmobno(moberrmsg)
		.invalidemail(mailerrmsg)
		.invalidpass(passerrmsg)
		.invalidconpass(conpasserrmsg)
		.takescreenshot("TC003_NegativeSignupTest");
	}

}
