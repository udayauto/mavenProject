package testng.demo;
import org.testng.annotations.Test;
public class SequencingEx2 {

	// Sequencing
	// -- Priority
	// -- dependency
	//testNG --default -- alphabetical order 
	
	@Test
	public void Hyderabad() {

		System.out.println("Test case 1");
	}

	@Test
	public void Pune() {

		System.out.println("Test case 2");
	}

	@Test
	public void Chennai() {

		System.out.println("Test case 3");
	}

	@Test
	public void Delhi() {

		System.out.println("Test case 4");
	}

	@Test
	public void Banglore() {

		System.out.println("Test case 5");
	}
	
	@Test
	public void Alaska() {

		System.out.println("Test case 6");
	}
	
}
