package testng.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgDepneEx {

	@Test(priority = 0)
	public void verifyLogin() {

		System.out.println("test case for Login");
		Assert.fail();
	}

	//turn feature OFF

	@Test(priority = 1, dependsOnMethods = "verifyLogin")
	public void editProfile() {

		System.out.println("test case for editProfile");

	}

	@Test(enabled=true)//not delete
	public void generateServiceRequest() {

		System.out.println("test case for generateServiceRequest");

	}
}
