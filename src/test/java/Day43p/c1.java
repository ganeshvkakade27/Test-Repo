package Day43p;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class c1 {

	@Test
	void abc()
	{
		
		System.out.println("IN ABC");
		
	}
	@BeforeTest
	void abc1()
	{
		System.out.println("in ABC1");
		
		Assert.assertEquals("123", 123);
		
	}
}
