package testng.demo;

import org.testng.annotations.Test;

public class AnnotationsExam {
	
  @Test
  public void login() {
	  
	  System.out.println("login successful");
  }
  
  
  @Test
  public void search() {
	  
	  System.out.println("search is successful");
  }
  
}
