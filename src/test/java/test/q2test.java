package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.Q1;
import page.Q2;
import util.BrowserFactory;

public class q2test {
	WebDriver driver;
	@Test
			public void ValidateSingleItemRemoved() {
			driver = BrowserFactory.startBrowser();
			Q2 test2 = PageFactory.initElements(driver, Q2.class );
	}
		
		public void closewindow() {
			driver.close();
		}
	}
	