package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.Q4;
import util.BrowserFactory;

public class q4test {
	WebDriver driver;
	
	@Test
	public void validUserShouldLogin() {
		
		driver = BrowserFactory.startBrowser();
		
		Q4  q4 = PageFactory.initElements(driver, Q4.class );

	}
		
}
	