package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Q3 {
	WebDriver driver;

	public Q3(WebDriver driver) throws InterruptedException {

		this.driver = driver;
	
		Thread.sleep(3000);

		   driver.findElement(By.name("allbox")).click();
		 
		 List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
	
}
	
}

