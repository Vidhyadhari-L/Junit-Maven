package junits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public interface DefaultInterface {
	@Test
	default void testPalindrome() {
		boolean flag=isPalindrome.checkPalindrome("radar");
		assertTrue(flag);
		System.out.println("Inside default interface");
	}
}
