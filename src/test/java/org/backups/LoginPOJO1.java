package org.backups;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOJO1 extends UtilityClass{
	
	public LoginPOJO1() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[text()='Continue with email']")
	private WebElement contwithemail;
	
	@FindBy(xpath="//input[@name='user[email]']")
	private WebElement user;
	
	@FindBy(xpath="//span[text()='Continue']")
	private WebElement ok;
	
	@FindBy(xpath="//div[@class='i1vtfp57 dir dir-ltr']")
	private WebElement pass;

	@FindBy(xpath="//span[text()='Log in']")
	private WebElement login;
	
	@FindBy(xpath="//a[text()='Forgotten your password?']")
	private WebElement forgotpass;

	public WebElement getContwithemail() {
		return contwithemail;
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getOk() {
		return ok;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getForgotpass() {
		return forgotpass;
	}
	
	
}
