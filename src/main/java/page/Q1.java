package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Q1 {
	
WebDriver driver;
public Q1(WebDriver driver) {
		this.driver = driver;

		   driver.findElement(By.name("allbox")).click();
		 
		 List<WebElement>mycheckbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		  
		  for(WebElement chk : mycheckbox) {
		  
		if  (chk.isSelected());{
			 String value= (driver.findElement(By.xpath("/html[1]/body[1]/div[2]/form[1]/ul[1]/li[1]/input[1]")).getText());
			  System.out.println(value);
			
		}
		 
		  
		  System.out.println("Passed, checkbox are selected"); }
		 

	}

	}


