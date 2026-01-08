package Day45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
	}
	
	@Test(dataProvider="dp")
	void TestLogin(String email,String pass) throws InterruptedException
	{
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		boolean status=driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
		
		Thread.sleep(2000);
		if(status)
		{
			driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
			Assert.assertTrue(status);
		}
		else
		{
			Assert.assertFalse(status);
		}
		
	}
	
	@AfterClass
	void teadDown()
	{
		driver.close();
		
	}
	
	
	
	//it always return two dimention array
	@DataProvider(name="dp",indices= {2,4})
	Object[][ ]loginData()
	{
		Object data[][]= {
							{"ganesh.vimal@gmail.com","Test@123"},
							{"ganesh.vmal@gmail.com","@t@123"},
							{"12mohan12@gmail.com","Abc@123"},
							{"ganesh.vimal@gmail.com","Test@123"},
							{"ganesh.kakade@gmail.com","Abc@123"},
							{"ganesh.l@gmail.com","Tes@123"}
				
						};
		
		
		return data;
	}
	
	
}
