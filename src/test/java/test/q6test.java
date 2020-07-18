package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.Q6;
import util.BrowserFactory;

public class q6test {
	WebDriver driver;
	@Test
	public  void validMonth () {
		driver = BrowserFactory.startBrowser();
		Q6  q6test = PageFactory.initElements(driver,Q6.class );
}

}

