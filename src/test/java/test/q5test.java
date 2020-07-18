package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.Q5;
import util.BrowserFactory;

public class q5test {

	WebDriver driver;
	@Test
	public void validUserLogin() {
		driver = BrowserFactory.startBrowser();
		Q5  q5test=PageFactory.initElements(driver, Q5.class );
	}
}
