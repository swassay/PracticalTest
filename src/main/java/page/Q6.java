package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Q6 {
	WebDriver driver;
	public Q6(WebDriver driver) throws InterruptedException{
	this.driver=driver;
	
			// month dropdown element
		
		Select MONTHDROPDOWN = new Select(driver.findElement(By.name("due_month")));
	int i=12;	
		List<WebElement> mth = MONTHDROPDOWN.getOptions();
		for (WebElement months:mth) {
			System.out.println(months.getText());
		 System.out.println((months.getAttribute("value")));
		 int option = MONTHDROPDOWN.getOptions().size();
			System.out.println("actual"+(option-1));
			System.out.println("i="+i);
			Assert.assertEquals(i, option-1, "Failed Month Test");
			System.out.println("Printing months - Exiting");
	}		
	}}	

