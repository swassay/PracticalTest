package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Q2 {
WebDriver driver;	
	public Q2(WebDriver driver) throws InterruptedException {
	
		this.driver = driver;
	 String toggle= (driver.findElement(By.xpath("//form[@name='todo']/ul/li")).getText());
	 driver.findElement(By.xpath("//form[@name='todo']/ul/li/input")).click();
	 driver.findElement(By.xpath("//input[@value=\"Remove\"]")).click();
	  Thread.sleep(2000); 
	  String toggle2=(driver.findElement(By.xpath("//form[@name='todo']/ul/li")).getText());
	  
	  if(toggle2!=toggle) 
	  
	  { System.out.println("Checkbox deleted");
	 	  
	  }
	}
}
