package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.Q3;
import util.BrowserFactory;

public class q3test {
	WebDriver driver;
	@Test
	public void ValidateAllListItemREmoved() {
	driver = BrowserFactory.startBrowser();
	Q3  test3 = PageFactory.initElements(driver, Q3.class );
}
	
	public void closewindow() {
		driver.close();
	}
}

