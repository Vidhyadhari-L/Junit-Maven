package junits;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class Repeatedtest {
	@DisplayName("Reapeated junit exceution")
	@RepeatedTest(4)
	public void junit1() {
		System.out.println("Inside junit test");
	}

}
