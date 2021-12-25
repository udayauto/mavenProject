package testng.demo;
import org.testng.annotations.Test;
public class SequencingEx {

	// Sequencing
	// -- Priority
	// -- dependency
	//testNG --default -- alphabetical order 
	
	@Test(priority=0)
	public void Hyderabad() {

		System.out.println("Test case 1");

	}

	@Test(priority=1)
	public void Pune() {

		System.out.println("Test case 2");
	}

	@Test(priority=2)
	public void Chennai() {

		System.out.println("Test case 3");
	}

	@Test(priority=3)
	public void Delhi() {

		System.out.println("Test case 4");
	}

	@Test(priority=4, enabled=true)
	public void Banglore() {

		System.out.println("Test case 5");
	}
	
	@Test(priority=5, enabled=true)
	public void Alaska() {

		System.out.println("Test case 6");
	}
	
}
