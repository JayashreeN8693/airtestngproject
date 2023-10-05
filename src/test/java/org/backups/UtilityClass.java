package org.backups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilityClass {
	
	public static WebDriver driver;
	public static Alert alt;
	public static Actions act;
	public static Robot rob;
	public static Select slt;
	public static JavascriptExecutor js;
	
	public static void OpenChrome() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
   }
	public static void EdgeBrowser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	public static void launchUrl(String url) {
		driver.get(url);
   }
	public static void printTitle() {
		String title = driver.getTitle();
		System.out.println(title);
   }
	public static void printUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
   }
	public static void Closetab() {
		driver.close();
   }
	public static void QuitBrowser() {
		driver.quit();
   }
	public static void ReloadBrowser() {
		driver.navigate().refresh();
   }
	public static void Maximize() {
		driver.manage().window().maximize();
	}
	public static void Minimize() {
		driver.manage().window().minimize();
	}
	public static void Previouspage() {
		driver.navigate().back();
	}
	public static void Nextpage() {
		driver.navigate().forward();
	}
	public static void Hold(int time) throws InterruptedException {
		Thread.sleep(time);
	}
	public static void FilltextBox(WebElement element, String Input) {
		element.sendKeys(Input);
	}
	public static void Click(WebElement element) {
		element.click();
	}
	public static void AcceptAlert() {
		alt = driver.switchTo().alert();
		alt.accept();
	}
	public static void CancelAlert() {
		alt = driver.switchTo().alert();
		alt.dismiss();
	}
	public static void Mousehover(WebElement element) {
		act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	public static void DragandDrop(WebElement element1 , WebElement element2) {
		act = new Actions(driver);
		act.dragAndDrop(element1, element2).perform();
	}
	public static void Copyusingkeyboard() throws AWTException {
		rob = new Robot();
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_C);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_C);
	}
	public static void PasteUsingKeyboard() throws AWTException {
		rob = new Robot();
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_V);
	}
	public static void PressEnter() throws AWTException {
		rob = new Robot();
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
	}
	public static void PrintAllOptions(WebElement element) {
		slt = new Select(element);
		List<WebElement> alloptions = slt.getOptions();
		for (WebElement options : alloptions) {
			System.out.println(options.getText());
		}
	}
	public static void Screenshot(String loation) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourcelocation = ts.getScreenshotAs(OutputType.FILE);
		File destloction = new File("location");
		FileUtils.copyFile(sourcelocation, destloction);
		}
	public static void ScrollDown(String args) {
        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].ScrollIntoView(true)", args);
	}
	public static void ScrollUp(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].ScollIntoView(false)", element);
	}
	public static void FillUsingJS(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].SetAttribute('value',' + input +')", element);
	}
	public static void LinkCount() {
		List<WebElement> alllinks = driver.findElements(By.tagName("link"));
		System.out.println("No of links: " +alllinks.size());
	}
	public static void TableCount() {
		List<WebElement> alltable = driver.findElements(By.tagName("table"));
		System.out.println("No of Tables: " +alltable.size());
	}
	public static void SelectUsingText(WebElement element, String text) {
		slt = new Select(element);
		slt.selectByVisibleText(text);
	}
	public static void SelectUsingIndex(WebElement element, int index) {
		slt = new Select (element);
		slt.selectByIndex(index);
	}
	public static void ParentWindowId() {
	    String parentid = driver.getWindowHandle();
	    System.out.println(parentid);
	}
	public static void AllWindowId() {
		Set<String> allid = driver.getWindowHandles();
		System.out.println(allid);
	}
	public static void FetchChildWindow(int i) {
		Set<String> allwindowid = driver.getWindowHandles();
		List<String> allids = new ArrayList(allwindowid);
		System.out.println(allids.get(i));
	}
	public static void ImplicitlyWait(int time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	public static void DateandTime() {
		Date d = new Date();
		System.out.println(d);
	}
		
}

