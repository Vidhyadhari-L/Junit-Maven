package junits;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.Assume.assumeTrue;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class assumptionEx {
	
	@DisplayName("Assumptions Example")
	@Test
	public void junit1() {
		System.setProperty("ENV","DEV1");
		assumeTrue("DEV".equals(System.getProperty("ENV")));
		//assertTrue(true);
		assertEquals(30,Calculator.add(10,20));
		
		
	}
	

}
