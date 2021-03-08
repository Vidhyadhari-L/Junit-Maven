package junits;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class Annotations {
	@BeforeEach
	public void beforejunit() {
		System.out.println("Before Junit");
	}
	
	@Test
	public void junit1() {
		System.out.println("Inside my junit");
		 
		
	}
	@AfterEach
	public void afterjunit() {
		System.out.println("after Junit");
	}
	
	

}
