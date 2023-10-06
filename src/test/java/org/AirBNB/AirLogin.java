package org.AirBNB;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.backups.LoginPOJO1;
import org.backups.LoginPOJO2;
import org.backups.UtilityClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AirLogin extends UtilityClass{
	
	Robot rob;
	JavascriptExecutor js;
	
	@BeforeClass
	public void tC1() {
		EdgeBrowser();
		Maximize();
		ImplicitlyWait(20);
	}
	@BeforeMethod
	public void tC2() {
		DateandTime();
		launchUrl("https://www.airbnb.co.in/login");
	}
	@Parameters({"mail"})
	@Test(enabled=true , priority=0)
	public void tC3(String mail) throws AWTException, InterruptedException {
		ImplicitlyWait(20);
		rob = new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		LoginPOJO1 lpo = new LoginPOJO1();
		WebElement email = lpo.getContwithemail();
	    js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click()", email);
	    Hold(3000);
		WebElement user = lpo.getUser();
		FilltextBox(user, mail);
		WebElement ok = lpo.getOk();
		js.executeScript("arguments[0].click()", ok);
	}
	@Parameters({"mobile"})
	@Test(enabled=true , priority=1)
	public void tC4(String mobile) {
		ImplicitlyWait(20);
		LoginPOJO2 pojo2 = new LoginPOJO2();
		WebElement mob = pojo2.getMob();
		FilltextBox(mob, mobile);
		WebElement cont = pojo2.getCont();
		cont.click();
	}
	@AfterMethod
	public void tC5() {
		DateandTime();
		printTitle();
	}
	@AfterClass
	public void tC6() {
		printUrl();
		Minimize();
	}
	

}
