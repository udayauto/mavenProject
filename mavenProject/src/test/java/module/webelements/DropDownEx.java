package module.webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownEx {

	WebDriver driver;

	// test case

	@BeforeMethod
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void submitCompBrandForm() throws Exception {

		// open browser	
		driver.get("http://softwaretesting-guru.blogspot.com/p/blog-page.html");

		// Fill the FOrm and Submit

		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Testvalue");

		// Check box || radio is selected.
		// verification methods

		WebElement checkBoxElement = driver.findElement(By.xpath("//input[@name='subscribe']"));

		// uncheck check box
		driver.findElement(By.xpath("//input[@name='subscribe']")).click();

		// Un check check box || radio button
		if (!checkBoxElement.isSelected()) {

			driver.findElement(By.xpath("//input[@name='subscribe']")).click();

		}

		// enter coments
		driver.findElement(By.xpath("//textarea[@name='comments']")).sendKeys("comments");

		// Handle Drop-down Element

		WebElement cntyDrop = driver.findElement(By.xpath("//select[@name='countries']"));
		Select countryDropDown = new Select(cntyDrop);

		Thread.sleep(6000);

		// by Index
		// countryDropDown.selectByIndex(2);
		countryDropDown.selectByVisibleText("Argentina");

		// Combo box
		WebElement comboBox = driver.findElement(By.xpath("//select[@name='computerbrands']"));
		Select comboBoxValues = new Select(comboBox);

		// multi values
		comboBoxValues.deselectByVisibleText("DELL");
		comboBoxValues.selectByIndex(2); // HP
		comboBoxValues.selectByVisibleText("Sony");

		// verify radio button and select if not selected.
		driver.findElement(By.xpath("//input[@value='good']")).click();

		// submit the form
		driver.findElement(By.xpath("//input[@value='Submit']")).click();

		// Handle Alerts or Pop-ups
		// Step1: switchTo alert. // SwitchTo

		/*
		 * Thread.sleep(2000); Alert handleAlert = driver.switchTo().alert(); //
		 * accepted -- handle
		 * 
		 * String alertText = handleAlert.getText();
		 * System.out.println("alert Text is : " + alertText);
		 * 
		 * handleAlert.accept(); // Yes
		 */
		// handleAlert.dismiss(); // cancel

		// Hanlde Alerts --

		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();

		System.out.println("alert text is: " + alertText);
		alert.accept(); // accept --OK/ Yes
		// alert.dismiss(); // Cancel option

	}

	@AfterMethod
	public void tearDown() {
    driver.close();
    
	}
}
