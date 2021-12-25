package testng.demo;

import org.testng.annotations.*;

public class BeforeMethodEx {

	@BeforeMethod
	public void launchBrowser() {

		System.out.println("@BeforeMethod");
	}

	@Test
	public void Test1() {

		System.out.println("Test1");
	}

	@Test
	public void Test2() {

		System.out.println("Test2");
	}

	@AfterMethod
	public void closeBrowser() {

		System.out.println("@AfterMethod");
	}

}
