package handledropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDownEx {
	
	public static void main(String[] args) throws InterruptedException {
		
		// open a browser
		WebDriverManager.chromedriver().setup(); // System.SetProperty
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Open application.
		driver.get("http://softwaretesting-guru.blogspot.com/p/main-page.html");
		
		// link
		
		driver.findElement(By.linkText("Selenium Practice page")).click();
		// input Name
		driver.findElement(By.name("Name")).sendKeys("Sanjeev");
		
		// checkbox -- click
		Thread.sleep(2000);
		driver.findElement(By.name("subscribe")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("subscribe")).click();
		
		// Comments - input 
		driver.findElement(By.name("comments")).sendKeys("COMMENTS TEST");
		
		// Select  -- Handle Drop-downs 
		
		WebElement countryDropDown = driver.findElement(By.name("countries"));
		Select handleDropDown = new Select(countryDropDown);
		
		//handleDropDown.selectByVisibleText("Argentina");
		handleDropDown.selectByIndex(2);
		
		// Combo box - handle
		
		WebElement comboValues = driver.findElement(By.name("computerbrands"));
		Select handleComboBox = new Select(comboValues);
		
	  // Select values from combo box
		handleComboBox.deselectByIndex(0);
		handleComboBox.selectByIndex(1);
		handleComboBox.selectByVisibleText("Sony");
		
		// select radio button
		driver.findElement(By.xpath("//input[@value='good']")).click();
		
		// submit form
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
	}

}
