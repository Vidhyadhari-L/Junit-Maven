package junits;

import java.util.Collection;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicTestEx {
	@TestFactory
	Collection<DynamicTest> junitTest(){
		return Arrays.asList(
				DynamicTest.dynamicTest("Add test", () -> Assertions.assertEquals(2,Calculator.add(1, 1))),
				DynamicTest.dynamicTest("Palindrome test", () -> Assertions.assertTrue(isPalindrome.checkPalindrome("radar"))));
	}

}
