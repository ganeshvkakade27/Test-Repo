package Day44;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependancies {
	
	
	@Test(priority=1)
	void openapp()
	{
		
		Assert.assertTrue(true);
	}

	@Test(priority=2,dependsOnMethods= {"openapp"})
	void login()
	{
		Assert.assertTrue(false);

	}
	
	@Test(priority=3,dependsOnMethods= {"login"})
	void search()
	{
		Assert.assertTrue(true);

		
	}
	
	@Test(priority=4,dependsOnMethods= {"login"})
	void ad_search()
	{
		Assert.assertTrue(true);
		
	}
	
	@Test(priority=5,dependsOnMethods= {"login"})
	void logout()
	{
		Assert.assertTrue(true);

	}
}
