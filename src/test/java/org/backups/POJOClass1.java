package org.backups;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJOClass1 extends UtilityClass{
	
	public POJOClass1() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//label[@aria-hidden='false'])[3]")
	private WebElement farm;

	@FindBy(xpath="(//img[@loading='eager'])[2]")
	private WebElement place;

	public WebElement getFarm() {
		return farm;
	}

	public WebElement getPlace() {
		return place;
	}

	
	
}
