package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.Projectspecification;
import pages.Homepage;

public class TC010_ValidateFieldTest extends Projectspecification {
	
	@Test(priority = 10, enabled = true)
	public void fielstest() throws IOException {
		new Homepage(driver)
		.flightisdisplayed()
		.checkinisdisplayed()
		.flightstatusisdisplayed()
		.managebookingisdisplayed()
		.takescreenshot("TC010_ValidateFieldTest");
	}

}
