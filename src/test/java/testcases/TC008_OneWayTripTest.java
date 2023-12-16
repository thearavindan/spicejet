package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Projectspecification;
import pages.Homepage;

public class TC008_OneWayTripTest extends Projectspecification {
	
	@BeforeTest
	public void setup() {
		excelfile="TC008_OneWayTripTest";
	}
	
	@Test(priority = 8, dataProvider = "getdata", enabled = true)
	public void onewaytriptest(String firstname, String lastname, String contact, String email, String city, 
			                                     String p2firstname, String p2lastname, String p2mobno, String cardno,
			                                     String cardname, String expmonth, String expyear, String ccv, String errmsg ) throws IOException {
		
		new Homepage(driver)
		.oneway()
		.from()
		.tolocation()
		.depaturedate()
		.passengers()
		.clicksearchflight()
		.clickcontinue2()
		.title()
		.firstnamecd(firstname)
		.lastnamecd(lastname)
		.contactcd(contact)
		.emialcd(email)
		.selectcountry()
		.city(city)
		.checkprimarypassanger()
		.clicknext()
		.titilep2()
		.firstnamep2(p2firstname)
		.lastnamep2(p2lastname)
		.mobnop2(p2mobno)
		.clickcontinue()
		.selectseat()
		.clickcontinue()
		.clickcreditdebitcard()
		.entercardno(cardno)
		.entercardname(cardname)
		.enterexpmonth(expmonth)
		.enterexpyear(expyear)
		.enterccvno(ccv)
		.proceedtopay()
		.validateerrormsg(errmsg)
		.takescreenshot("TC008_OneWayTripTest");
		
		
	}

}
