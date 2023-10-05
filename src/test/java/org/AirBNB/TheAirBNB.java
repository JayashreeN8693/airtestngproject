package org.AirBNB;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.backups.POJOClass1;
import org.backups.POJOClass2;
import org.backups.UtilityClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TheAirBNB extends UtilityClass{
	
	JavascriptExecutor js;
	 Robot rob;
	
	@BeforeClass
	public void tC1() {
		EdgeBrowser();
		launchUrl("https://www.airbnb.co.in/");
		Maximize();
		ImplicitlyWait(20);
	}
	@Test
	public void tC2() throws InterruptedException, AWTException{
		POJOClass1 po1 = new POJOClass1();
		WebElement farm = po1.getFarm();
		farm.click();
		ImplicitlyWait(10);
		WebElement place = po1.getPlace();
		place.click();
		Hold(2000);
	    rob = new Robot();
	    for (int i = 0; i <=5; i++) {
	    	rob.keyPress(KeyEvent.VK_PAGE_DOWN);
		    rob.keyRelease(KeyEvent.VK_PAGE_DOWN); 
		}
	}
	@AfterClass
	public void tC3() throws IOException {
		DateandTime();
		printTitle();
		printUrl();
	}

}
