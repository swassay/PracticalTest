package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Q5 {
	WebDriver driver;

	public Q5(WebDriver driver) throws InterruptedException {

		this.driver = driver;
		String catstr = "HomeGoods";
		driver.findElement(By.name("categorydata")).sendKeys(catstr);
		driver.findElement(By.xpath("//input[@value='Add category']")).click();
		if (catstr.equalsIgnoreCase("HomeGoods")) {
			System.out.println("Category  already exists");
			} 
		}
	}

