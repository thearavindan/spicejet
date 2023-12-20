package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Projectspecification;

public class Homepage extends Projectspecification{ //spicejet
	@FindBy(xpath="//div[text()='Signup']")
	WebElement signup;
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement login;
	
	@FindBy(xpath="//div[text()='Flights']")
	WebElement flight;
	
	@FindBy(xpath="//div[text()='check-in']")
	WebElement checkin;
	
	@FindBy(xpath="//div[text()='flight status']")
	WebElement flightstatus;
	
	@FindBy(xpath="//div[text()='manage booking']")
	WebElement managebooking;
	
	@FindBy(xpath="//div[text()='one way']")
	WebElement oneway;
	
	@FindBy(xpath="//div[text()='round trip']")
	WebElement roundtrip;
	
	@FindBy(xpath="//div[text()='From']")
	WebElement from;
	
	@FindBy(xpath="//div[text()='India']")
	WebElement region;
	
	@FindBy(xpath="//div[text()='Chennai']")
	WebElement fromcity;
	
	@FindBy(xpath="//div[text()='To']")
	WebElement to;
	
	@FindBy(xpath="//div[text()='Mumbai']")
	WebElement tocity;
	
	@FindBy(xpath="//div[text()='Departure Date']")
	WebElement depaturecalender;
	
	@FindBy(xpath="(//div[text()='25'])[2]")
	WebElement depaturedate;
	
	@FindBy(xpath="(//*[name()='svg'][@data-testid='svg-img'])[14]")
	WebElement returncalender;
	
	@FindBy(xpath="(//div[text()='29'])[2]")
	WebElement returndate;
	
	@FindBy(xpath="//div[text()='Passengers']")
	WebElement passengers;
	
	@FindBy(xpath="(//*[name()='svg'][@data-testid='svg-img'])[18]")
	WebElement addadult;
	
	@FindBy(xpath="(//*[name()='svg'][@data-testid='svg-img'])[20]")
	WebElement addchildren;
	
	@FindBy(xpath="//div[text()='Family & Friends']")
	WebElement familyandfriends;
	
	@FindBy(xpath="//div[text()='Search Flight']")
	WebElement searchflight;
	
	@SuppressWarnings("static-access")
	public Homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public SignupPage signup() {
		click(signup);
		switchtowindow(1);
		return new SignupPage(driver);
	}
	
	public LoginPage login() {
		click(login);
		return new LoginPage(driver);
	}
	
	public Homepage flightisdisplayed() {
		fieldisdisplayed(flight);
		return this;
	}
	
	public Homepage checkinisdisplayed() {
		fieldisdisplayed(checkin);
		return this;
	}
	
	public Homepage flightstatusisdisplayed() {
		fieldisdisplayed(flightstatus);
		return this;
	}
	
	public Homepage managebookingisdisplayed() {
		fieldisdisplayed(managebooking);
		return this;
	}
	
	public Homepage clickflight() {
		click(flight);
		return this;
	}
	
	public  Homepage oneway() {
		click(oneway);
		return this;
	}
	
	public Homepage roundtrip() {
		click(roundtrip);
		return this;
	}
	
	public Homepage from() {
		click(from);
		click(region);
		click(fromcity);
		return this;
	}
	
	public Homepage tolocation()  {
		click(region);
		click(tocity);
		return this;
	}
	
	public Homepage depaturedate() {
	//	click(depaturecalender);
		click(depaturedate);
		return this;
	}
	
	public Homepage returndate() {
	//	click(returncalender);
		click(returndate);
		return this;
	}
	
	public Homepage passengers() {
		click(passengers);
		click(addadult);
		click(passengers);
		return this;
	}
	
	public FlightsPage clicksearchflight() {
		actionclick(searchflight);
		return new FlightsPage(driver);
	}

}
