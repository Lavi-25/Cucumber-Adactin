package com.Projectabc;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;

	public static void browserclose() {
		driver.close();
	}

	public static void quitbrowser() {
		driver.quit();
	}

	// Navigate
	public static void Navigateto(String f) {
		driver.navigate().to(f);
	}

	public static void Navigateback() {
		driver.navigate().back();
	}

	public static void Navigateforward() {
		driver.navigate().forward();
	}

	public static void Navigaterefresh() {
		driver.navigate().refresh();
	}

	// get
	public static void get(String g5) {
		driver.get(g5);
	}
	// Alert

	public static void alrert(String h) {
		if (h.equalsIgnoreCase("accept")) {
			driver.switchTo().alert().accept();
		} else if (h.equalsIgnoreCase("cancel")) {
			driver.switchTo().alert().dismiss();
		}
	}

	// Actions
	public static void Action(WebElement ele, String j) {
		Actions a = new Actions(driver);

		if (j.equalsIgnoreCase("click")) {
			a.click(ele).perform();
		} else if (j.equalsIgnoreCase("double click")) {
			a.doubleClick(ele).perform();
		} else if (j.equalsIgnoreCase("contextclick")) {
			a.contextClick(ele).perform();
		} else if (j.equalsIgnoreCase("moveto element")) {
			a.moveToElement(ele);
		}
	}

	// Frames
	public static void Frames(WebElement ele1) {
		driver.switchTo().frame(ele1);
	}
// drop down
	public static void dropdown(WebElement u1, String m, String n) {
		Select p = new Select(u1);
		if (m.equalsIgnoreCase("Value'")) {
			p.selectByValue(n);
		} else if (m.equals("text")) {
			p.selectByVisibleText(n);
		} else if (m.equals("index")) {
			p.selectByIndex(Integer.parseInt(n));
		}
	}

	// check box
	public static void checkbox(WebElement ele2) {
		ele2.click();
	}

	public static void checking_types(WebElement ele3, String k) {
		if (k.equalsIgnoreCase("isenabled")) {
			System.out.println(ele3.isEnabled());

		} else if (k.equalsIgnoreCase("isdidplayed")) {
			System.out.println(ele3.isEnabled());

		} else if (k.equalsIgnoreCase("isselected")) {
			System.out.println(ele3.isSelected());
		}
	}

	// Get Options
	public static void Getoptions(WebElement ele4) {

		Select f = new Select(ele4);
		List<WebElement> c = f.getOptions();
		for (int i = 0; i < c.size(); i++) {
			System.out.println(c.get(i).getText());
		}
	}

	// Get title
	public static void Gettitle() {
		driver.getTitle();
	}

	// Get current url
	public static void Get_currenturl() {
		driver.getCurrentUrl();
	}

	// Get text
	public static void Get_text(WebElement le) {
		String a1 = le.getText();
		System.out.println(a1);
	}

	// Get attribute
	public static void Get_attribute(WebElement le1) {
		String a2 = le1.getAttribute("Value");
		System.out.println(a2);
	}

	// wait
	public static void Wait(int second) {
		driver.manage().timeouts().implicitlyWait(second, TimeUnit.SECONDS);
	}

	// Take screenshot
	public static void Take_screenshot(String l) throws Exception {
		TakesScreenshot u = (TakesScreenshot) driver;
		File s = u.getScreenshotAs(OutputType.FILE);

		File y = new File("C:\\Users\\HP\\eclipse-workspace\\MavenProject\\Screenshot\\" + l + ".png");
		FileHandler.copy(s, y);
	}

	// Scroll up and down
	public static void scroll(String dir) {
		JavascriptExecutor Scrool = (JavascriptExecutor) driver;
		if (dir.equalsIgnoreCase("down")) {
			Scrool.executeScript("window.scrollBy(0,300)", "");
		} else if (dir.equalsIgnoreCase("up")) {
			Scrool.executeScript("window.scrollBy(0,-300)", "");
		}
	}

	// Sendkeys
	public static void Sendkeys(WebElement element, String h1) {
		element.sendKeys(h1);
	}

	// Get first selected options()
	public static void first_options(WebElement f1) {
		Select j1 = new Select(f1);
		String x = j1.getFirstSelectedOption().getText();
		System.out.println(x);
	}

	// Get all selected options()
	public static void all_options(WebElement y) {
		Select k1 = new Select(y);
		List<WebElement> z = k1.getAllSelectedOptions();
		System.out.println(z);
	}

	// Is multiple()
	public static void Is_multiple(WebElement t) {
		Select y1 = new Select(t);
		System.out.println(y1.isMultiple());

	}

	// Click()
	public static void click(WebElement w) {
		w.click();
	}
	


	// Window handles
	public static void Window_handles() {
		String mainWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		Iterator<String> iterator = allWindowHandles.iterator();

		while (iterator.hasNext()) {
			String ChildWindow = iterator.next();
			if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
			}
		}

	}

	public static WebDriver launchbrowser(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver.exe");

			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {

			System.setProperty("webdriver.GECKO.driver", "C:\\Users\\HP\\Desktop\\Selenium");

			WebDriver driver = new FirefoxDriver();
		} else {
			System.out.println("Invalid Browser");
		}
		return driver;
	}
}
