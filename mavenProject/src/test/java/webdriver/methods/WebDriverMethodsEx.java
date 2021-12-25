package webdriver.methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMethodsEx {
	public static void main(String[] args) {

		// driver initialize

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Test case
		// Step1: Open Google application
		// open application (arg - url)
		driver.get("https://www.google.com/");

		// Step2: Search for any content - selenium
		WebElement googleSearchBox = driver.findElement(By.name("q"));

		googleSearchBox.sendKeys("selenium", Keys.ENTER);
		// googleSearchBox.submit();

		// Step3: Verify PageTitle after Google search.

		// getTitle
		String actualTitle = driver.getTitle();
		String expectedTitle = "Selenium - Google Search";

		// compare
		if (expectedTitle.equalsIgnoreCase(actualTitle)) { // exact match
			System.out.println("Google search title does match -- successful");

		} else {
			System.out.println("Google search title does not match -- unsuccessful");

		}

		// getCurrentURl
		String actualUrl = driver.getCurrentUrl();
		String expecedUrl = "https://www.google.com/search?q=selenium";

		// contains
		if (actualUrl.contains(expecedUrl)) {

			System.out.println("search is successful and landing page is correct");

		} else
			System.out.println("search is NOT successful and landing page is not correct");

		// close
		// driver.close(); // current session
		driver.quit(); // all browsers // 3.141
	}

}
