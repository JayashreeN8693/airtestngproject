package org.backups;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOJO2 extends UtilityClass{
	
	public LoginPOJO2() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='phoneInputphoneNumber']")
	private WebElement mob;
	
	@FindBy(xpath="//span[@class='t1dqvypu dir dir-ltr']")
	private WebElement cont;

	public WebElement getMob() {
		return mob;
	}

	public WebElement getCont() {
		return cont;
	}

	
	
	

}
