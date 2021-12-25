package testng.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	WebDriver driver = null;

	@BeforeMethod
	public void launchBrowser() {
		// Open Application
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}

	@Test
	public void verifyLogin() throws InterruptedException {

		// enterUseName
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
		// enterPwd
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

		Thread.sleep(3000);

	}

	@Test
	public void verifyHeaderImage() {

		// enterUseName
		WebElement element = driver.findElement(By.xpath("//div[@id='divLogo']/img"));

		// verification
		if (element.isDisplayed()) {
			System.out.println("Beanding header logo is displayed -- successful");
		}else {
			System.out.println("Beanding header logo is NOT displayed -- Unsuccessful");

		}

	}

	@AfterMethod
	public void tearDown() {
		// close session
		driver.close();

	}

}
