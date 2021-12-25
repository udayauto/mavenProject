package testng.demo;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependancyEx {

	@Test(priority=0)
	public void verifyLogin() {
		
		System.out.println("login test case");
		Assert.fail(); //fail 

	}

	//skip 
	@Test(priority=1, dependsOnMethods="verifyLogin")
	public void editProfile() {
		System.out.println("editProfile");

	}

	@Test(priority=2)
	public void logout() {

		System.out.println("logout");

	}

}
