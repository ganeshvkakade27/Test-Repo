package DAy43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationBeforeClass {

	@BeforeClass
	void login()
	{
		
		System.out.println("Login");
	}
	
	@Test(priority=2)
	void search()
	{
		
		System.out.println("Search");
	}

	@Test(priority=1)
	void advanceSEarch()
	{
		
		System.out.println(" Advanced Search");
	}


	@AfterClass
	void logout()
	{
		
		System.out.println("Logout");
	}


}
