package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Projectspecification;

public class PassengersPage extends Projectspecification {
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[1]")
	WebElement titlecd;
	
	@FindBy(xpath="(//div[text()='Mr'])[1]")
	WebElement mrcd;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/input[1]")
	WebElement firstnamecd;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement lastnamecd;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	WebElement mobnocd;
	
	@FindBy(xpath="(//input[@type='text'])[4]")
	WebElement emailcd;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-tmtnm0 r-1777fci r-ymttw5 r-5njf8e r-1otgn73 r-13qz1uu'])[1]")
	WebElement country_cd;
	
	@FindBy(xpath="(//div[@class='css-76zvg2 r-qsz3a2 r-poiln3 r-n6v787 r-1e081e0 r-oyd9sg'][normalize-space()='India'])[1]")
	WebElement india_cd;
	
	@FindBy(xpath="(//input[@type='text'])[5]")
	WebElement city_cd;
	
	@FindBy(xpath="(//*[name()='svg'][@data-testid='svg-img'])[9]")
	WebElement passenger1;
	
	@FindBy(xpath="(//*[name()='rect'])[3]")
	WebElement primarypass_checkbox;
	
	@FindBy(xpath="//div[text()='Next']")
	WebElement next_p1;
	
	@FindBy(xpath="(//*[name()='path'][@id='a'])[2]")
	WebElement passenger2;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[4]")
	WebElement title_p2;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1habvwh r-19fu0aa r-1loqt21 r-mabqd8 r-1777fci r-1yt7n81 r-1otgn73'])[1]")
	WebElement mr_p2;
	
	@FindBy(xpath = "//input[@data-testid='traveller-1-first-traveller-info-input-box']")
	WebElement firstname_p2;
	
	@FindBy(xpath="//input[@data-testid='traveller-1-last-traveller-info-input-box']")
	WebElement lastname_p2;
	
	@FindBy(xpath="//input[@data-testid='sc-member-mobile-number-input-box']")
	WebElement mobno_p2;
	
	@FindBy(xpath="//div[text()='Continue']")
	WebElement continue1;
	
	@SuppressWarnings("static-access")
	public PassengersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public PassengersPage title() {
		click(titlecd);
		click(mrcd);
		return this;
	}
	
	public PassengersPage firstnamecd(String fname) {
		clear(firstnamecd);
		sendkeys(firstnamecd, fname);
		return this;
	}
	
	public PassengersPage lastnamecd(String lname) {
		clear(lastnamecd);
		sendkeys(lastnamecd, lname);
		return this;
	}
	
	public PassengersPage contactcd(String mob) {
		clear(mobnocd);
		sendkeys(mobnocd, mob);
		return this;
	}
	
	public PassengersPage emialcd(String mail) {
		clear(emailcd);
		sendkeys(emailcd, mail);
		return this;
	}
	
	public PassengersPage selectcountry() {
		click(country_cd);
		actionclick(india_cd);
		return this;
	}
	
	public PassengersPage city(String city) {
		sendkeys(city_cd, city);
		return this;
	}
	
	public PassengersPage clickpassenger1() {
		actionclick(passenger1);
		return this;
	}
	
	public PassengersPage checkprimarypassanger() {
		actionclick(primarypass_checkbox);
		return this;
	}
	
	public PassengersPage clicknext() {
		actionclick(next_p1);
		return this;
	}
	
	public PassengersPage clickpassenger2() {
		actionclick(passenger2);
		return this;
	}
	
	public PassengersPage titilep2() {
		actionclick(title_p2);
		actionclick(mr_p2);
		return this;
	}
	
	public PassengersPage firstnamep2(String frstname) {
		actionsendkeys(firstname_p2, frstname);
		return this;
	}
	
	public PassengersPage lastnamep2(String lastname){
		actionclick(lastname_p2);
		actionsendkeys(lastname_p2, lastname);
		return this;
	}
	
	public PassengersPage mobnop2(String mobno) {
		actionclick(mobno_p2);
		actionsendkeys(mobno_p2, mobno);
		return this;
	}
	
	public AddonsPage clickcontinue() {
		actionclick(continue1);
		return new AddonsPage(driver);
	}
	
	

}
