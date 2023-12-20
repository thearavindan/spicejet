package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Projectspecification;

public class LoginPage extends Projectspecification {
	@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-ubezar r-1ozqkpa'][normalize-space()='Mobile Number'])[1]")
	WebElement mobileno;
	
	@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-ubezar r-1ozqkpa'][normalize-space()='Email'])[1]")
	WebElement email;
	
	@FindBy(xpath="//input[@data-testid='user-mobileno-input-box']")
	WebElement mobnofiled;
	
	@FindBy(xpath="//input[@type='email']")
	WebElement emailfiled;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement passward;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-184aecr r-z2wwpe r-1loqt21 r-18u37iz r-tmtnm0 r-1777fci r-1x0uki6 r-1w50u8q r-ah5dr5 r-1otgn73'])[1]")
	WebElement loginbutton;
	
	@FindBy(xpath="//div[text()='Hi Aravindan']")
	WebElement loginname;
	
	@FindBy(xpath="//div[contains(text(),'valid mobile number')]")
	WebElement invalidmobmsg;
	
	@FindBy(xpath="//div[contains(text(),'valid email')]")
	WebElement invalidemailmsg;
	
	@FindBy(xpath="//div[text()='Please enter a valid password']")
	WebElement invalidpass;
	
	@FindBy(xpath="//div[text()='Invalid Username/Password']")
	WebElement errormessage;
	
	@SuppressWarnings("static-access")
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage clickmobno() {
		click(mobileno);
		return this;
	}
	
	public LoginPage clickemail() {
		click(email);
		return this;
	}
	
	public LoginPage entermobno(String mob) {
		sendkeys(mobnofiled, mob);
		return this;
	}
	
	public LoginPage enteremail(String mail) {
		sendkeys(emailfiled, mail);
		return this;
	}
	
	public LoginPage enterpassword(String pass) {
		sendkeys(passward, pass);
		return this;
	}
	
	public LoginPage clicklogin() throws InterruptedException {
		click(loginbutton);
		threadsleep();
		return this;
	}
	
	public LoginPage verifylogin(String name) {
		waitforvisibility(loginname);
		loginmessage(loginname, name);
		return this;
	}
	
	public LoginPage invalidemobmsg(String errormsg) {
		waitforvisibility(invalidmobmsg);
		verifymessage(invalidmobmsg, errormsg);
		return this;
		
	}
	
	public LoginPage invalidemailmsg(String errormsg) {
		waitforvisibility(invalidemailmsg);
		verifymessage(invalidemailmsg, errormsg);
		return this;
	}
	
	public LoginPage invalidpasswordmsg(String errormsg) {
		waitforvisibility(invalidpass);
		verifymessage(invalidpass, errormsg);
		return this;
	}
	
	public LoginPage invalidloginmsg(String errmsg) throws InterruptedException {
		verifymessage(errormessage, errmsg);
		return this;
	}
	
	

}
