package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Projectspecification;

public class PaymentPage extends Projectspecification{
	@FindBy(xpath="//div[text()='Credit/Debit Card']")
	WebElement Credit_DebitCard;
	
	@FindBy(id="card_number")
	WebElement cardno;
	
	@FindBy(id="payment_form_card_number_error")
	WebElement cardno_errmsg;
	
	@FindBy(id="name_on_card")
	WebElement nameoncard;
	
	@FindBy(id="card_exp_month")
	WebElement expmonth;
	
	@FindBy(id="card_exp_year")
	WebElement expyear;
	
	@FindBy(id="security_code")
	WebElement cvvcode;
	
	@FindBy(xpath="//div[text()='Proceed to pay']")
	WebElement proccedtopay;
	
	@FindBy(xpath="//div[text()='Invalid Card Details']")
	WebElement invalid_message;
	
	@FindBy(xpath="//iframe[@class='card_number_iframe']")
	WebElement frame1;
	
	@FindBy(xpath="//iframe[@class='name_on_card_iframe']")
	WebElement frame2;
	
	@FindBy(xpath="//iframe[@class='card_exp_month_iframe']")
	WebElement frame3;
	
	@FindBy(xpath="//iframe[@class='card_exp_year_iframe']")
	WebElement frame4;
	
	@FindBy(xpath="//iframe[@class='security_code_iframe']")
	WebElement frame5;
	
	@SuppressWarnings("static-access")
	public PaymentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public PaymentPage clickcreditdebitcard() throws InterruptedException {
		click(Credit_DebitCard);
		threadsleep();
		return this;
	}
	
	public PaymentPage entercardno(String num) {
		switchtoframe(frame1);
		sendkeys(cardno, num);
		exitframe();
		return this;
	}
	
	public PaymentPage entercardname(String name) {
		switchtoframe(frame2);
		sendkeys(nameoncard, name);
		exitframe();
		return this;
	}
	
	public PaymentPage enterexpmonth(String month) {
		switchtoframe(frame3);
		sendkeys(expmonth, month);
		exitframe();
		return this;
	}
	
	public PaymentPage enterexpyear(String year) {
		switchtoframe(frame4);
		sendkeys(expyear, year);
		exitframe();
		return this;
	}
	
	public PaymentPage enterccvno(String num) {
		switchtoframe(frame5);
		sendkeys(cvvcode, num);
		exitframe();
		return this;
	}
	
	public PaymentPage proceedtopay() throws InterruptedException {
		jsscrolldown(proccedtopay);
		actionclick(proccedtopay);
		return this;
	}
	
	public PaymentPage validateerrormsg(String invalidmsg) {
		waitforvisibility(invalid_message);
		verifymessage(invalid_message, invalidmsg);
		return this;
	}

}
