package Day46;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OrangeHRM {

	WebDriver driver;
	@BeforeClass
	void setup() throws InterruptedException
	{
	
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		//driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		
	//	driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		
		
	}
	
	
	@Test(priority=1)
	void TestLogo()
	{
		
		boolean st=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(st,true);
	}
	
	
	@Test(priority=2)
	void TestURL()
	{
		
		Assert.assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login1", driver.getCurrentUrl());
	}
	
	@Test(priority=3,dependsOnMethods={"TestURL"})
	void TestTittle()
	{
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	
	@AfterClass
	void tearDown()
	{
		driver.close();
	}


	
	
}
