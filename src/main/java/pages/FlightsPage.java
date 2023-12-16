package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Projectspecification;

public class FlightsPage extends Projectspecification{
	
	@FindBy(xpath="(//*[name()='rect'])[2]")
	WebElement checkbox;
	
	@FindBy(xpath="//div[text()='Continue']")
	WebElement continuebtn1;
	
	@FindBy(xpath="//div[text()='Modify Search']")
	WebElement modifysearch;
	
	@FindBy(xpath="//div[text()='one way']")
	WebElement oneway;
	
	@FindBy(xpath="//div[text()='round trip']")
	WebElement roundtrip;
	
	@FindBy(xpath="//div[text()='Passengers']")
	WebElement passengers;
	
	@FindBy(xpath="(//*[name()='svg'][@data-testid='svg-img'])[44]")
	WebElement addadult;   
	
	@FindBy(xpath="(//*[name()='path'][@fill-rule='nonzero'])[16]")
	WebElement addchildren;
	
	@FindBy(xpath="//div[text()='Search Flight']")
	WebElement searchflight;
	
	@FindBy(xpath="(//div[text()='3,025'])[7]")
	WebElement depatureflight;
	
	@FindBy(xpath="(//div[text()='3,292'])[7]")
	WebElement returnflight;
	
	@FindBy(xpath="(//div[text()='Continue'])[1]")
	WebElement countinuebtn2;
	
	@SuppressWarnings("static-access")
	public FlightsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
public FlightsPage clickcheckbox() {
	click(checkbox);
	return this;
}

public FlightsPage clickcotinuebtn1() {
	click(continuebtn1);
	return this;
}

public FlightsPage clickmodifysearch() {
	click(modifysearch);
	return this;
}

public FlightsPage clickonewayms() {
	click(oneway);
	return this;
}

public FlightsPage clickroundtripms() {
	click(roundtrip);
	return this;
}

public FlightsPage addadultms() {
	click(passengers);
	click(addadult);
	click(passengers);
	return this;
}

public FlightsPage addchildms() {
	click(passengers);
	click(addchildren);
	click(passengers);
	return this;
}

public FlightsPage searchflightms() {
	click(searchflight);
	return this;
}

public FlightsPage selectdepature() {
	click(depatureflight);
	return this;
}

public FlightsPage selectreturnflight() {
	actionclick(returnflight);
	return this;
}

public PassengersPage clickcontinue2() {
	actionclick(countinuebtn2);
	return new PassengersPage(driver);
}


}
