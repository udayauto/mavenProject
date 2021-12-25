package string.functions;

public class CompanyEx {
	
	public static void main(String[] args) {
		
		// company names - find a company name that starts with 'C'
		String str[] = {"CTS", "TCS", "Compucom", "Wipro"}; // 0 index
		
		//get the count
		int count = str.length;
		System.out.println(count);
		
		// get or fetch each value
		// for loop.
		
		for (int i = 0; i < count; i++) {
			//System.out.println(str[i]); // indexing //1//2..etc
			
			//// starts-with 'C'
			if (str[i].charAt(0)=='C') {
				
				System.out.println(str[i]);
			}
			
		}

	}

}
