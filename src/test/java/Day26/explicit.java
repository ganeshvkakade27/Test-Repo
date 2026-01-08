package Day26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit {

	

	public static void main(String[] args)  {
		
	WebDriver driver=new ChromeDriver();
	WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));  //Declaration 
	
	driver.get("https://testautomationpractice.blogspot.com/");
	
	driver.manage().window().maximize(); 

	WebElement ele=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='name']")));
	ele.sendKeys("Admin");
	
	WebElement ele1=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email']")));
	ele1.sendKeys("Admin");
	WebElement el2=mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Alert']")));
	el2.click();
	
	//Thread.sleep(30000);
	//driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	//Thread.sleep(30000);
	//driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
driver.close();
}  
}
