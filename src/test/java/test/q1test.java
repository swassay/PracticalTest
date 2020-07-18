package test;


	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.Q1;
import util.BrowserFactory;

public class q1test {
		WebDriver driver;
		@Test
		public void ValidatetoggleallcheckboxCHECKED() {
		driver = BrowserFactory.startBrowser();
		Q1 test = PageFactory.initElements(driver, page.Q1.class);
			
	}
	}
