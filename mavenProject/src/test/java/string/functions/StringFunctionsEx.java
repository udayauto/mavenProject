package string.functions;

public class StringFunctionsEx {

	public static void main(String[] args) {

		String str = "Selenium Java";

		// count ---length()
		int count = str.length();
		System.out.println("countof string is: " + count);

		// convert to UpperCase
		System.out.println(str.toUpperCase());

		// convert to Lowercase

		System.out.println(str.toLowerCase());

		// substring
		System.out.println(str.substring(9, 13));
		System.out.println(str.substring(0, 8));

		String company = "CTS";

		// Starts-with --true or false
		boolean flag = company.startsWith("C");
		System.out.println(flag);

		// concat

		String s1 = "Hyderabad";
		String s2 = "Ramoji film city";

		String value = s1.concat(s2);
		System.out.println(value);

		// + operator for concat in java
		System.out.println(s1 + " " + s2);

		// Equals
		// equalsIgnoreCase
		System.out.println("----------------------------------");

		String expectedValue = "Login is successful";
		String actualValue = "login is successful"; // read from application.

		if (expectedValue.equalsIgnoreCase(actualValue)) {

			System.out.println(" both are equal");
		} else {

			System.out.println(" they are not equal");
		}

		// indexof

		String s3 = "Hyderabad Railway"; // array 0 to n value
		System.out.println(s3.indexOf("H")); // position
		System.out.println(s3.indexOf("R"));

		// charat
		System.out.println("chart at 0 postion : " + s3.charAt(0));
		System.out.println("chart at 0 postion : " + s3.charAt(10));
		
		// contains 
		
		//from application
		String actualurl ="https://www.ci.com/credit/compare/view-all-credit-cards";
		
		if(actualurl.contains("https://www.citi.com/credit-cards")){
			
			System.out.println("landing on credit cards page -- successful");
			
		}else {
			
			System.out.println("landing on wrong page --unsuccessful");

			
		}
	}
}
