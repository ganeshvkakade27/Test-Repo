package Day44;

import org.testng.annotations.Test;

public class loginTest {
	
	@Test(priority=1,groups= {"sanity"})
	void loginEmail()
	{
		
		System.out.println("This is login by email");
	}
	
	@Test(priority=2,groups= {"sanity"})
	void loginfacebook()
	{
		
		System.out.println("This is login by FAcebook");
	}
	
	@Test(priority=3,groups= {"sanity"})
	void logintwitter()
	{
		
		System.out.println("This is login by Twitter");
	}
}
