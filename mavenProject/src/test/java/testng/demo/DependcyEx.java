package testng.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependcyEx {
	
	@Test
	public void verifyLogin() {
		System.out.println("Login");
	//	Assert.fail(); //verification
		
	}
	
	@Test(enabled=false)  //skip ---off
	public void verifyAccountSignup() {
		System.out.println("verifyAccountSignup");
		
	}


}
