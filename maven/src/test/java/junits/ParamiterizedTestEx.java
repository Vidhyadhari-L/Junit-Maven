package junits;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Month;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParamiterizedTestEx {
	
	@ValueSource(strings= {"radar","acca","mom"})
	@ParameterizedTest
	
	public void junitTest(String arg1) {
		assertTrue(isPalindrome.checkPalindrome(arg1));
	}
	
//	@EnumSource(Month.class)
//	@ParameterizedTest
//public void junitTest2(Month month)
//{
//	//System.out.println(month.getValue());
//	assertEquals(3,month.getValue());  //only the test case with month 3 passes other 11 month test case fails
//}
	
	
	@EnumSource(Month.class)
	@ParameterizedTest
public void junitTest3(Month month)
{
	//System.out.println(month.getValue());
	int monthNumber=month.getValue();
	assertTrue(monthNumber>=1 && monthNumber<=12);  //1-12 month test cases pass another than number>12 fails
}
	
	@EnumSource(value=Month.class, names= {"FEBRUARY"})
	@ParameterizedTest
	public void junitTest4(Month month)
	{
		assertEquals(month.length(false),28); //true boolean indicates for leap year
		}
	
	
	@CsvSource(value= {"test:Test"},delimiter=':')
	
	@ParameterizedTest

	public void junitTest5(String exp,String act)
	{
		assertEquals(exp,act);
	}
	
}
