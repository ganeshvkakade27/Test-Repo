package Day44;

import org.testng.annotations.Test;

public class PaymentTest {

	
	@Test(priority=1,groups= {"sanity","regression"})
	void paymentrs()
	{
		System.out.println("PAyment in Rupees");
		
	}
	
	@Test(priority=2,groups= {"sanity","regression"})
	void paymentdoller()
	{
		System.out.println("PAyment in Dollers");
		
	}
}
