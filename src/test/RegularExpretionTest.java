package test;
 

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import lab7.RegularExpretion;

public class RegularExpretionTest {
	
	RegularExpretion regex = new RegularExpretion();
	@Test
	void regexForTimeTest() throws Exception{
		String expected = "[12:00-13:00, 12:00-18:00, 14:00-18:00, 14:00-18:00]";
		
		String acctual = regex.regexForTime();
		Assertions.assertEquals(expected, acctual);;
		
	}
}