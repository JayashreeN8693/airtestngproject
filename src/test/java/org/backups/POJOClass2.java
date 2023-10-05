package org.backups;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJOClass2 extends POJOClass1{

	public void POJOClass2() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//div[@class='_riggip2'])[1]")
	private WebElement checkin;
	
	@FindBy(xpath="(//div[@class='_riggip2'])[2]")
	private WebElement checkout;
	
	@FindBy(xpath="(//div[text()='13'])[2]")
	private WebElement datein;
	
	@FindBy(xpath="(//div[text()='16'])[5]")
	private WebElement dateout;
	
	@FindBy(xpath="//div[@class='_7pspom']")
	private WebElement head;
	
	@FindBy(xpath="(//button[@aria-label='add'])[1]")
	private WebElement adult;
	
	@FindBy(xpath="(//span[@class='tb4j57x dir dir-ltr'])[2]")
	private WebElement reserve;

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getDatein() {
		return datein;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getHead() {
		return head;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getReserve() {
		return reserve;
	}
	
	
	
	
	
}
