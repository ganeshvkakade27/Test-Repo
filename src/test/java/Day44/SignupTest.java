package Day44;

import org.testng.annotations.Test;

public class SignupTest {
	
	@Test(priority=1,groups= {"regression"})
	void signupEmail()
	{
		
		System.out.println("This is signup by email");
	}
	
	@Test(priority=2,groups= {"regression"})
	void signupfacebook()
	{
		
		System.out.println("This is signup by FAcebook");
	}
	
	@Test(priority=3,groups= {"regression"})
	void signuptwitter()
	{
		
		System.out.println("This is signup by Twitter");
	}
}
