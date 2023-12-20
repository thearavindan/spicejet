package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Projectspecification;

public class AddonsPage extends Projectspecification{
	@FindBy(xpath="//div[@id='at_addon_close_icon']")
	WebElement closeoff;
	
	@FindBy(xpath="//span[text()='SELECT NOW']")
	WebElement selectnow;
	
	@FindBy(xpath="//div[text()='Done']")
	WebElement done;
	
	@FindBy(xpath="(//div[text()='Continue'])[3]")
	WebElement continue2;
	
	@SuppressWarnings("static-access")
	public AddonsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public AddonsPage clickclose() {
		click(closeoff);
		return this;
	}
	
	public AddonsPage continuetoselectseat() {
		jsscrolldown(continue2);
		actionclick(continue2);
		return this;
	}
	
	public AddonsPage selectseat() {
		try {
			waitforvisibility(selectnow);
			click(selectnow);
			actionclick(done);
			
		} catch (Exception e) {
			System.out.println("webelement not displayed");
		}
		return this;
		
	}
	
	public PaymentPage clickcontinue() throws InterruptedException {
		threadsleep();
		actionclick(continue2);
		return new PaymentPage(driver);
	}

}
