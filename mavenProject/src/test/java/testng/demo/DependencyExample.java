package testng.demo;

import org.testng.Assert;
import org.testng.annotations.*;

public class DependencyExample {
	
	//dependency 
	
	@Test
	public void verifyLogin() {
		
		System.out.println("verifyLogin");
		
		Assert.fail(); //Assertion
	}
	
//skipped
	@Test(dependsOnMethods="verifyLogin")
	public void editProfile() {
		
		System.out.println("editProfile");
	}

	@Test(dependsOnMethods="verifyLogin")
	public void logout() {
		
		System.out.println("logout");
	}


}
