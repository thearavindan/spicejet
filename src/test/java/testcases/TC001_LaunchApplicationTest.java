package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.Projectspecification;
import pages.Homepage;

public class TC001_LaunchApplicationTest extends Projectspecification {
	@Test
	public void lauchapp() throws IOException {
		new Homepage(driver)
		.takescreenshot("TC001_LaunchApplication");
	}

}
