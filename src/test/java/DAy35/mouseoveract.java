package DAy35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseoveract {

	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com");
		
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		WebElement pointme=driver.findElement(By.xpath("//button[normalize-space()='Point Me']"));
		
		WebElement lap=driver.findElement(By.xpath("//a[normalize-space()='Laptops']"));
		
		act.moveToElement(pointme).moveToElement(lap).click().perform();
		
		
		
		
		
		
	}
	
}
