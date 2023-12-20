package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Projectspecification;

public class SignupPage extends Projectspecification{
	@FindBy(xpath="//select[@class='form-control form-select ']")
	WebElement title;
	
	@FindBy(id="first_name")
	WebElement firstname;
	
	@FindBy(id="last_name")
	WebElement lastname;
	
	@FindBy(xpath="//select[@class='form-control form-select']")
	WebElement country;
	
	@FindBy(id="dobDate")
	WebElement dob;
	
	@FindBy(xpath="//select[@class='react-datepicker__month-select']")
	WebElement month;
	
	@FindBy(xpath="//select[@class='react-datepicker__year-select']")
	WebElement year;
	
	@FindBy(xpath="//div[@class='react-datepicker__day react-datepicker__day--026']")
	WebElement date;
	
	@FindBy(xpath="//input[@placeholder='+91 01234 56789']")
	WebElement mobileno;
	
	@FindBy(xpath="(//input[@id='email_id'])[1]")
	WebElement email;
	
	@FindBy(id="new-password")
	WebElement passward;
	
	@FindBy(id="c-password")
	WebElement conpass;
	
	@FindBy(id="defaultCheck1")
	WebElement checkbox;
	
	@FindBy(xpath="//button[text()='Submit']")
	WebElement submit;
	
	@FindBy(xpath="//div[text()='Please enter valid first name']")
	WebElement invalidfname;
	
	@FindBy(xpath="//div[text()='Please enter valid last name']")
	WebElement invalidlname;
	
	@FindBy(xpath="//div[text()='Please enter valid mobile number']")
	WebElement invalidmobno;
	
	@FindBy(xpath="//div[text()='Please enter valid Email ID']")
	WebElement invalidemail;
	
	@FindBy(xpath="//div[contains(text(),'Password length should be')][1]")
	WebElement invalidpass;
	
	@FindBy(xpath="(//div[contains(text(),'Password length should be')])[2]")
	WebElement invalidconpass;
	
	@SuppressWarnings("static-access")
	public SignupPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public SignupPage selecttitle() {
		select(title, "Mr");
       return this;
	}
	
	public SignupPage enterfirstname(String frstname) {
		jsscrolldown(firstname);
		sendkeys(firstname, frstname);
		return this;
	}
	
	public SignupPage enterlastname(String lstname) {
		sendkeys(lastname, lstname);
		return this;
	}
	
	public SignupPage selectcountry() {
		jsscrolldown(country);
		select(country, "India ");
		return this;
	}
	
	public SignupPage selectdob() {
		jsscrolldown(dob);
		click(dob);
		select(month, "December");
		select(year, "1996");
		click(date);
		return this;
	}
	
	public SignupPage entermobno(String mob) {
		jsscrolldown(mobileno);
		sendkeys(mobileno, mob);
		return this;
	}
	
	public SignupPage enteremail(String mail) throws InterruptedException {
		jsscrolldown(email);
		click(email);
		threadsleep();
		sendkeys(email, mail);
		return this;
	}
	
	public SignupPage enterpassward(String pass) throws InterruptedException {
		actionclick(passward);
		threadsleep();
		sendkeys(passward, pass);
		return this;
	}
	
	public SignupPage enterconformpass(String conpas) {
		sendkeys(conpass, conpas);
		return this;
	}
	
	public SignupPage checkbox() {
	actionclick(checkbox);
		return this;
	}
	
	public SignupPage clicksubmit() throws InterruptedException {
		actionclick(submit);
		 threadsleep();
		return this;
	}
	
	public SignupPage invalidfirstname(String fname) {
		jsscrolldown(invalidfname);
		verifymessage(invalidfname, fname);
		return this;
	}
	
	public SignupPage invalidlastname(String lname) {
		jsscrolldown(invalidlname);
		verifymessage(invalidlname, lname);
		return this;
	}
	
	public SignupPage invalidmobno(String mob) {
		jsscrolldown(invalidmobno);
		verifymessage(invalidmobno, mob);
		return this;
	}
	
	public SignupPage invalidemail(String mail) {
		jsscrolldown(invalidemail);
		verifymessage(invalidemail, mail);
		return this;
	}
	
	public SignupPage invalidpass(String pass) {
		jsscrolldown(invalidpass);
		verifymessage(invalidpass, pass);
		return this;
	}
	
	public SignupPage invalidconpass(String conpass) {
		jsscrolldown(invalidconpass);
		verifymessage(invalidconpass, conpass);
		return this;
	}
	

}
